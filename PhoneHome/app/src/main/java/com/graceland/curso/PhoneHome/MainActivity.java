package com.graceland.curso.PhoneHome;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context context = this;
    ListView contacts;
    AppCompatActivity appCompatActivity = this;
    private String[] people = new String[]{"Pai", "Dotor Fernando", "Carlos Fonseca"};
    private String[] phoneNumbers = new String[]{"995582822", "912852987", "932866921", "922587789"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contacts = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,  people);
        contacts.setAdapter(adapter);

        contacts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                prepareCallPermissions(phoneNumbers[position]);

            }
        });
    }


    public void initiateCall(String telefoneNumber) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + telefoneNumber ));
        try {
            startActivity(intent);
        } catch (SecurityException e) {
            Toast.makeText(context, "é necessário as permissóes correctas para continar", Toast.LENGTH_SHORT).show();
        }
    }


    /***
     * Metodo usando para verificar se o app tem permissão para fazer chamadas
     */
    public void prepareCallPermissions(String telefoneNumber){
        if(ActivityCompat.checkSelfPermission(context, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            // Permissão já foi aceitado
            initiateCall(telefoneNumber);
        } else {
            // Permissão não foi aceitado
            // Apresentado uma Dialog para o usuario decidir se dá ou náo permissáo
            if(ActivityCompat.shouldShowRequestPermissionRationale(appCompatActivity, Manifest.permission.CALL_PHONE)) {
                Toast.makeText(context, "È necessário este permissão para fazer chamadas.", Toast.LENGTH_SHORT).show();
            } else {
                ActivityCompat.requestPermissions(appCompatActivity, new String[]{Manifest.permission.CALL_PHONE}, 0);
            }
        }
    }

}
