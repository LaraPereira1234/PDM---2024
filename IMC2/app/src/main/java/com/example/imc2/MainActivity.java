package com.example.imc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edPeso,edAltura;

    double imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edPeso=findViewById(R.id.edPeso);
        edAltura=findViewById(R.id.edAltura);
    }

    public void calcular(View view){
        double peso = Double.parseDouble(edPeso.getText().toString());
        double altura = Double.parseDouble(edAltura.getText().toString());

        imc = peso/(altura * altura);

        String imcS = imc.toString();

        Log.d(tag:"i", imcS);
        Toast.makeText(context this, imcS, Toast.LENGTH_SHORT).show();
    }
}