package com.example.agro;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Homepage extends AppCompatActivity {
    private ImageView img_rice;
    private ImageView img_wheat;
    private ImageView img_con;
    private ImageView img_beg;
    private ImageView img_pot;
    private ImageView img_one;
    private ImageView img_cii;
    private ImageView img_bin;
    private ImageView img_amm;
    private ImageView img_apl;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);






        img_rice=(ImageView) findViewById(R.id.rice);
        img_rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Homepage.this,Rice.class);
                startActivity(intent);
            }
        });

        img_wheat=(ImageView) findViewById(R.id.Wheat);
        img_wheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Homepage.this,Wheat.class);
                startActivity(intent);
            }
        });

        img_con=(ImageView) findViewById(R.id.corn);
        img_con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Homepage.this,Corn.class);
                startActivity(intent);
            }
        });

        img_beg=(ImageView) findViewById(R.id.brinjal);
        img_beg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Homepage.this,Brinjal.class);
                startActivity(intent);
            }
        });

        img_pot=(ImageView) findViewById(R.id.potato);
        img_pot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Homepage.this,Potato.class);
                startActivity(intent);
            }
        });

        img_one=(ImageView) findViewById(R.id.nion);
        img_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Homepage.this,Onion.class);
                startActivity(intent);
            }
        });

        img_cii=(ImageView) findViewById(R.id.Chilipaper);
        img_cii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Homepage.this,Chilli.class);
                startActivity(intent);
            }
        });

        img_bin=(ImageView) findViewById(R.id.Ben);
        img_bin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Homepage.this,Been.class);
                startActivity(intent);
            }
        });

        img_amm=(ImageView) findViewById(R.id.mango);
        img_amm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Homepage.this,Mango.class);
                startActivity(intent);
            }
        });

        img_apl=(ImageView) findViewById(R.id.apple);
        img_apl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Homepage.this,Apple.class);
                startActivity(intent);
            }
        });



    }


}