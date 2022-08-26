package com.example.discal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText sp;
    private EditText disc;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        sp = (EditText) findViewById(R.id.sellingPrice);
        disc = (EditText) findViewById(R.id.discount);
        result = (TextView) findViewById(R.id.result);

        findViewById(R.id.sellingPrice).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
            sellingPrice();
            }
        });

        findViewById(R.id.discount).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Discount();
            }
        });



        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculate();

            }


        });



    }



    private void Calculate() {

        int res = Integer.parseInt(sp.getText().toString()) * Integer.parseInt(disc.getText().toString())/100;
        int ress = Integer.parseInt(sp.getText().toString()) - res;
        String r = Integer.toString(ress);
        result.setText(r);
    }

    private void Discount() {
        final String discount = disc.getText().toString().trim();


        if(discount.isEmpty()){
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();

        }
    }

    private void sellingPrice() {
    final String price = sp.getText().toString().trim();


    if(price.isEmpty()){
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();
    }
    }
}