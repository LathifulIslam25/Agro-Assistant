package com.example.agro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class startup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);

        Thread thread = new Thread(){
            public void run(){

                try {
                    sleep(4000);

                }
                catch (Exception e){
                    e.printStackTrace();

                }
                finally {
                    Intent intent = new Intent(startup.this,Register.class);
                    startActivity(intent);

                }
            }



        };thread.start();
    }
}