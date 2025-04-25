package befr.patchke.frenchdpt;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.speech.RecognizerIntent;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class VoiceRecognitionHelper {
    private static final int REQUEST_VOICE_CODE = 101;

    public static void startRecognition(Activity activity) {
        if(ContextCompat.checkSelfPermission(activity, Manifest.permission.RECORD_AUDIO)
                == PackageManager.PERMISSION_GRANTED) {

            Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                    RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Dites le code départemental");

            activity.startActivityForResult(intent, REQUEST_VOICE_CODE);
        } else {
            ActivityCompat.requestPermissions(activity,
                    new String[]{Manifest.permission.RECORD_AUDIO},
                    REQUEST_VOICE_CODE);
        }
    }

    public static String handleResult(int requestCode, Intent data) {
        if(requestCode == REQUEST_VOICE_CODE && data != null) {
            ArrayList<String> results = data.getStringArrayListExtra(
                    RecognizerIntent.EXTRA_RESULTS);
            return results.get(0).replaceAll("[^0-9AB]", "");
        }
        return null;
    }
}

