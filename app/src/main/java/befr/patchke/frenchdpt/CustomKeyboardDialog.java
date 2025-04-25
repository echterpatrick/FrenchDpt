package befr.patchke.frenchdpt;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;

public class CustomKeyboardDialog extends Dialog {

    public interface OnCodeEnteredListener {
        void onCodeEntered(String code);
    }

    private final StringBuilder code = new StringBuilder();
    private final OnCodeEnteredListener listener;

    public CustomKeyboardDialog(@NonNull Context context, OnCodeEnteredListener listener) {
        super(context);
        this.listener = listener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_keyboard);
        EditText keyboardInput = findViewById(R.id.keyboardInput);
        keyboardInput.setText("");
        int[] btnIds = {
                R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3,
                R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7,
                R.id.btn8, R.id.btn9, R.id.btnA, R.id.btnB
        };

        for (int id : btnIds) {
            Button btn = findViewById(id);
            btn.setOnClickListener(v -> {
                if (code.length() < 3) {
                    code.append(btn.getText().toString());
                    keyboardInput.setText(code);
                }
            });
        }

        findViewById(R.id.btnDel).setOnClickListener(v -> {
            if (code.length() > 0) code.deleteCharAt(code.length() - 1);
            keyboardInput.setText(code);
        });

        findViewById(R.id.btnOk).setOnClickListener(v -> {
            listener.onCodeEntered(code.toString());
            keyboardInput.setText("");
            dismiss();
        });
    }
}

