package id.ac.polinema.intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExplicitIntentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
    }

    public void tombolOnClick(View arg0) {
        EditText edit = findViewById(R.id.input_name);
        TextView text = findViewById(R.id.text_output);
        text.setText(edit.getText());
    }
}