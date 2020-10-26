package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> mascotas;
    RecyclerView recycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = (RecyclerView) findViewById(R.id.recyclerMascotas);
        recycler.setLayoutManager(new LinearLayoutManager((this)));
        mascotas = new ArrayList<>();

        mascotas.add("Tommy");
        mascotas.add("Pepe");
        mascotas.add("Pipo");


        AdapterMascotas adapter = new AdapterMascotas(mascotas);
        recycler.setAdapter(adapter);
    }
}