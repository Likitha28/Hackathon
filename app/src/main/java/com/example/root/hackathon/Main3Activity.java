package com.example.root.hackathon;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        sp = getSharedPreferences("login", MODE_PRIVATE);
        if (sp.contains("user_id") ) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();   //finish current activity
        }




        final Button button1 = (Button) findViewById(R.id.register);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i1=new Intent(getBaseContext(),Register.class);
                startActivity(i1);

                //Remove activity
                finish();




            }
                // Perform action on click
            });




        final Button button2 = (Button) findViewById(R.id.login);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i2=new Intent(getBaseContext(),LoginActivity.class);
                startActivity(i2);

                //Remove activity
                finish();




            }
            // Perform action on click
        });


        }
}
