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
    private EditText editText;
    private EditText editText2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        result = (TextView) findViewById(R.id.result);

        findViewById(R.id.editText).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
            sellingPrice();
            }
        });

        findViewById(R.id.editText2).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                discount();
            }
        });



        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();

            }


        });



    }



    private void calculate() {

        int res = Integer.parseInt(editText.getText().toString()) * Integer.parseInt(editText2.getText().toString())/100;
        int ress = Integer.parseInt(editText.getText().toString()) - res;
        String r = Integer.toString(ress);
        result.setText(r);
    }

    private void discount() {
        final String discount = editText2.getText().toString().trim();


        if(discount.isEmpty()){
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();

        }
    }

    private void sellingPrice() {
    final String price = editText.getText().toString().trim();


    if(price.isEmpty()){
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();
    }
    }
}