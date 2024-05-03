package com.example.falepormim;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button2;

    TTS tts;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edtext);
        button2.findViewById(R.id.button2);
        tts = new TTS(this);
        button2.setOnClickListener(v->{
            String s=editText.getText().toString();
            tts.speak(s);
        });
    }
}