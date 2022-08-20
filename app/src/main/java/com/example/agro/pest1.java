package com.example.agro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class pest1 extends AppCompatActivity {
    private ImageView warm;
    private ImageView grass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pest1);


        warm=(ImageView) findViewById(R.id.imageButton2);
        warm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(pest1.this,RicecauseWorm.class);
                startActivity(intent);
            }
        });
        grass=(ImageView) findViewById(R.id.imageButton3);
        grass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(pest1.this,Grasshopper.class);
                startActivity(intent);
            }
        });

    }
}