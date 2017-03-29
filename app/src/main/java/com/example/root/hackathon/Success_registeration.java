package com.example.root.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Success_registeration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_registeration);


        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i1=new Intent(getBaseContext(),Complete_profile.class);
                startActivity(i1);

                //Remove activity
                //finish();




            }
            // Perform action on click
        });


        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
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
