package com.graceland.curso.musicmix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


       ListView listView;
       AppCompatActivity context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Artista> list = FabricaDeArtistas.gerarArtistas();
        String [] nomesArtistas = new String[list.size()];

        for (int i=0; i<list.size();i++){
            nomesArtistas[i] = list.get(i).getNome();
        }

        ListView listView = (ListView) findViewById(R.id.lista);
        final ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(this, android.R.layout.simple_list_item_1,nomesArtistas);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent detailedActivity = new Intent();
                detailedActivity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                detailedActivity.setClass(context, DetailedArtistActivity.class);
                startActivity(detailedActivity);
            }
        });

    }
}
