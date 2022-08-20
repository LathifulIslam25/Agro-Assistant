package com.example.agro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Apple extends AppCompatActivity {

private TextView cv;
private TextView p9;
private TextView cu9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);

 cv=(TextView) findViewById(R.id.vul);
 cv.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         Intent intent=new Intent(Apple.this,Culv.class);
         startActivity(intent);
     }
 });

        p9=(TextView) findViewById(R.id.pest9);
        p9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Apple.this,Pest10.class);
                startActivity(intent);
            }
        });

        cu9=(TextView) findViewById(R.id.calculator9);
        cu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Apple.this,Calculator2.class);
                startActivity(intent);
            }
        });

    }
}