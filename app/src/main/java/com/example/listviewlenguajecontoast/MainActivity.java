package com.example.listviewlenguajecontoast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    ArrayList<String> lenguajes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista= findViewById(R.id.lista);
        lenguajes= new ArrayList<>();
        lenguajes.add("PHP");
        lenguajes.add("Java");
        lenguajes.add("Go");
        lenguajes.add("Kotlin");
        lenguajes.add("Javascript");
        lenguajes.add("C#");
        lenguajes.add("Visual Basic");
        ArrayAdapter<String> wea= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,lenguajes);
        lista.setAdapter(wea);
        lista.setLongClickable(true);
        lista.setOnItemLongClickListener((parent, view, position, id) -> {
            if(position==0){
                Toast.makeText(this,"PHP fue Creado en 1994 por Rasmus Lerdorf.",Toast.LENGTH_SHORT).show();
            }
            if(position==1){
                Toast.makeText(this,"El lenguaje Java fue desarrollado en sus inicios por James Gosling, en el año 1991.",Toast.LENGTH_SHORT).show();
            }
            if(position==2){
                Toast.makeText(this,"Go fue creado en el 2009 y desarrollado pro Robert Griesemer,Rob pike y Ken Thompson",Toast.LENGTH_SHORT).show();
            }
            if(position==3){
                Toast.makeText(this,"Kotlin fue creado en el 2016 y desarrollado por Jetbrains",Toast.LENGTH_SHORT).show();
            }
            if(position==4){
                Toast.makeText(this,"Javascript fue creado en el 1995 y desarrollado Brendan Eich",Toast.LENGTH_SHORT).show();
            }
            if(position==5){
                Toast.makeText(this,"C# fue creado en el 1999 y desarrollado por Anders Hejlsberg",Toast.LENGTH_SHORT).show();
            }
            if(position==6){
                Toast.makeText(this,"Visual basic fue creado en 1992 y desarrollado por Alan Cooper",Toast.LENGTH_SHORT).show();
            }
            return false;
        });

        }
}