package com.fji.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random ran = new Random();
    int i1 = ran.nextInt(10)+1;
    int min,max;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      Button bSend = (Button)findViewById(R.id.b_send);
    }


    public void guess(View view) {

        EditText ednumber = (EditText) findViewById(R.id.ed_number);
        int i2 = Integer.parseInt(ednumber.getText().toString());
        if(i1<i2){
            Toast.makeText(MainActivity.this, "小一點~~", Toast.LENGTH_SHORT).show();
        }
        if(i1>i2){
            Toast.makeText(MainActivity.this, "大一點~~", Toast.LENGTH_SHORT).show();
        }
        if(i1==i2){
            Toast.makeText(MainActivity.this, "答對了~~", Toast.LENGTH_SHORT).show();
        }


    }

}


