package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String [] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn"};
    Planet [] planetas = new Planet[]{
            new Planet("Mercury", R.drawable.mercurio),
            new Planet("Venus", R.drawable.venus),
            new Planet("Earth", R.drawable.terra),
            new Planet("Mars", R.drawable.marte),
            new Planet("Jupiter", R.drawable.jupiter),
            new Planet("Saturn", R.drawable.saturno)
    };
    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = findViewById(R.id.listView);
        AdapterPlanetas adapter = new AdapterPlanetas(this, R.layout.item_lista_planeta, planetas);
        //ArrayAdapter<String>  adapter = new ArrayAdapter<>(
        //        this,
        //        android.R.layout.simple_list_item_1,
        //        android.R.id.text1,
        //        planetas
        //);
        lv.setAdapter(adapter);




        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                Bundle bundle = new Bundle();
                bundle.putString("planet", planets[i]);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}