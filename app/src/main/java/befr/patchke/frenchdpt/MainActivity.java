package befr.patchke.frenchdpt;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.text.InputType;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText editCode;
    private TextView txtResult;
    private static final int REQUEST_CODE_SPEECH = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCode = findViewById(R.id.editCode);
        txtResult = findViewById(R.id.txtResult);

        // Empêche le clavier système de s'ouvrir
        editCode.setInputType(InputType.TYPE_NULL);

        // Ouvre le clavier personnalisé
        editCode.setOnClickListener(v -> showCustomKeyboard());

        // Bouton reconnaissance vocale
        findViewById(R.id.btnVoice).setOnClickListener(v -> startVoiceRecognition());
    }

    private void showCustomKeyboard() {
        CustomKeyboardDialog dialog = new CustomKeyboardDialog(this, code -> {
            editCode.setText(code);
            searchDepartment();
        });
        dialog.show();
    }

    private void startVoiceRecognition() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO}, REQUEST_CODE_SPEECH);
        } else {
            Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Dites le code départemental");
            startActivityForResult(intent, REQUEST_CODE_SPEECH);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CODE_SPEECH && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            startVoiceRecognition();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_SPEECH && resultCode == Activity.RESULT_OK && data != null) {
            ArrayList<String> results = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            if (results != null && !results.isEmpty()) {
                String code = results.get(0).toUpperCase().replaceAll("[^0-9AB]", "");
                editCode.setText(code);
                searchDepartment();
            }
        }
    }

    private void searchDepartment() {
        String code = editCode.getText().toString().toUpperCase();
        String[] dep = DepartmentCache.get(code);
        String imageName = "a" + code.toLowerCase();
        int imageResId = getResources().getIdentifier(imageName, "drawable", getPackageName());

        ImageView imageView = findViewById(R.id.imageDepartement);

        if (dep != null) {
            txtResult.setText(getString(R.string.departement_result, dep[0], dep[1]));
            imageView.setImageResource(imageResId);
        } else {
            txtResult.setText(R.string.unknown);
            imageView.setImageResource(0);
        }
    }
}
