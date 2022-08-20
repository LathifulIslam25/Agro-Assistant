package com.example.agro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class login extends AppCompatActivity {

    DatabaseReference myRef = FirebaseDatabase.getInstance().getReferenceFromUrl("https://agro-26084-default-rtdb.firebaseio.com/");


    //private Button login;
    private TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText email = findViewById(R.id.email);
        final EditText  pass = findViewById(R.id.pass);
        final Button login =findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String emailTxt = email.getText().toString();
                final String passTxt = pass.getText().toString();
                if (emailTxt.isEmpty() || passTxt.isEmpty()){

                    Toast.makeText(login.this,"please enter your Number and password",Toast.LENGTH_SHORT ).show();

                }
                else {

                    myRef.child("users").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {

                          if (snapshot.hasChild(emailTxt)){

                              final String getPassword = snapshot.child(emailTxt).child("pass").getValue(String.class);

                              if(getPassword.equals(passTxt)){


                                  Toast.makeText(login.this,"Successfully Logged in",Toast.LENGTH_SHORT ).show();

                                  Intent intent= new Intent(login.this,Homepage.class);
                                  startActivity(intent);
                                  finish();

                              }
                              else{

                                  Toast.makeText(login.this,"Wrong Password",Toast.LENGTH_SHORT ).show();

                              }

                          }
                          else{

                              Toast.makeText(login.this,"Wrong Password",Toast.LENGTH_SHORT ).show();

                          }


                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });


                }



            }
        });
        signup =findViewById(R.id.signUp);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                startActivity(new Intent(login.this,Register.class));

            }
        });
    }
}