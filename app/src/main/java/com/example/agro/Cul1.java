package com.example.agro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Cul1 extends AppCompatActivity {
private ImageView plantv;
private ImageView planta;
private ImageView monitor;
private ImageView site;
private ImageView filde;
private ImageView ire;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cul1);

        plantv = (ImageView) findViewById(R.id.plant);


        plantv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Cul1.this,Plantselection1.class);
                startActivity(intent);
            }
        });
        planta=(ImageView) findViewById(R.id.planting2);
        planta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Cul1.this,Planting1.class);
                startActivity(intent);
            }
        });
        monitor=(ImageView) findViewById(R.id.moni);
        monitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Cul1.this,Monitoring1.class);
                startActivity(intent);
            }
        });
        site=(ImageView) findViewById(R.id.sit);
        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Cul1.this,Site1.class);
                startActivity(intent);
            }
        });
        filde=(ImageView) findViewById(R.id.fild);
        filde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Cul1.this,Fild1.class);
                startActivity(intent);
            }
        });
        ire=(ImageView) findViewById(R.id.irri);
        ire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Cul1.this,Irrigation1.class);
                startActivity(intent);
            }
        });
    }
}