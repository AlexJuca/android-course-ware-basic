package com.graceland.curso.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatActivity context = this;
    private int contador = 0;
    String number = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button aumentar = (Button) findViewById(R.id.aumentar);
        final Button diminuir = (Button) findViewById(R.id.diminuir);

        final TextView counter = (TextView) findViewById(R.id.counter);
        counter.setText("" + contador +"");

        aumentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador ++;
                counter.setText("" + contador +"");
                changeColor(counter);

            }

        });


        diminuir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador--;
                counter.setText("" + contador + "");
                changeColor(counter);
            }
        });

        counter.setTextColor(getResources().getColor(R.color.colorAccent));

        changeColor(counter);


    }

    private void changeColor(TextView counter) {
        if (contador <= -1){
            counter.setTextColor(getResources().getColor(R.color.menorqueZero));
        }
        else {
            counter.setTextColor(getResources().getColor(R.color.maiorqueZero));
        }
    }
}
