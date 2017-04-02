package com.example.root.hackathon;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Success_registeration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_registeration);


        final Button button1 = (Button) findViewById(R.id.button3);
        final Button button2 = (Button) findViewById(R.id.button18);
        final Button button3 = (Button) findViewById(R.id.button19);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i1=new Intent(getBaseContext(),Complete_profile.class);
                startActivity(i1);
                //Remove activity
                //finish();

            }
            // Perform action on click
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                SharedPreferences sp=getSharedPreferences("login",MODE_PRIVATE);
                SharedPreferences.Editor e=sp.edit();
                e.clear();
                e.commit();

                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                finish();   //f
            }
            // Perform action on click
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Remove activity
                finish();
            }
            // Perform action on click
        });



    }
}
