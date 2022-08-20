package com.example.agro;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Rice extends AppCompatActivity {
    private TextView culR;
    private TextView pestR;
    private TextView cal;

    private Toolbar mtoolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice);
        mtoolbar = findViewById(R.id.main_toolbar);

        culR=(TextView) findViewById(R.id.textView6);
        culR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Rice.this,Cul1.class);
                startActivity(intent);
            }
        });

        pestR=(TextView) findViewById(R.id.textView5);
        pestR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           Intent intent=new Intent(Rice.this,pest1.class);
           startActivity(intent);
            }
        });

        cal=(TextView) findViewById(R.id.calculator);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Rice.this,Calculator1.class);
                startActivity(intent);
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menua,menu);
        return true;
    }

}