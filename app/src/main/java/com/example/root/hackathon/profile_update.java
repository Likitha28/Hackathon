package com.example.root.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profile_update extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_update);

        final Button button1 = (Button) findViewById(R.id.login);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i1=new Intent(getBaseContext(),LoginActivity.class);
                startActivity(i1);

                //Remove activity
                finish();




            }
            // Perform action on click
        });

    }
}
