package com.example.agro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Register extends AppCompatActivity {

 DatabaseReference myRef = FirebaseDatabase.getInstance().getReferenceFromUrl("https://agro-26084-default-rtdb.firebaseio.com/");




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText username = findViewById(R.id.username);
        final EditText email = findViewById(R.id.email);
        final EditText  pass = findViewById(R.id.pass);
        final EditText confirmpass=findViewById(R.id.confirmpass);
        final Button  register =findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String usernameTxt = username.getText().toString();
                final String emailTxt = email.getText().toString();
                final String passTxt = pass.getText().toString();
                final String confirmpassTxt = confirmpass.getText().toString();


                if (usernameTxt.isEmpty() || emailTxt.isEmpty()|| passTxt.isEmpty()|| confirmpassTxt.isEmpty()){

                    Toast.makeText(Register.this,"please field all the field",Toast.LENGTH_SHORT ).show();

                }
                else if(!passTxt.equals(confirmpassTxt)){


                    Toast.makeText(Register.this,"password are not matching",Toast.LENGTH_SHORT ).show();


                }

                else{
                    myRef.child("users").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                            if(dataSnapshot.hasChild(emailTxt)){

                                Toast.makeText(Register.this,"Number is already registered",Toast.LENGTH_SHORT ).show();

                            }
                            else {

                                myRef.child("users").child(emailTxt).child("username").setValue(usernameTxt);
                                myRef.child("users").child(emailTxt).child("pass").setValue(passTxt);
                                myRef.child("users").child(emailTxt).child("confirmpass").setValue(confirmpassTxt);
                                Toast.makeText(Register.this,"User register successfully",Toast.LENGTH_SHORT ).show();

                                startActivity(new Intent(Register.this,login.class));
                                finish();

                            }

                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    });



                }




            }
        });


        TextView btn=findViewById(R.id.alreadyhaveaccount);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(Register.this,login.class));
            }
        });


    }
}