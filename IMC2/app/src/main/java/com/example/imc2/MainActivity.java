package com.example.imc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edPeso,edAltura;

    //double imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edPeso=findViewById(R.id.edPeso);
        edAltura=findViewById(R.id.edAltura);
    }

    public void calcular(View view){
        string peso = edPeso.getText().toString();
        string altura = edAltura.getText().toString();

        Intent i = new getIntent();
        Bundle b = new Bundle();

        b.putString("peso", peso);
        b.putString("Altura", altura);
        i.putExtras(b);
        startActivity(i);

        //imc = peso/(altura * altura);

        //String imcS = imc.toString();

        //Log.d(tag:"i", imcS);
        //Toast.makeText(context this, imcS, Toast.LENGTH_SHORT).show();
    }

}