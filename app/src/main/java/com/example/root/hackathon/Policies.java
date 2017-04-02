package com.example.root.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Policies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policies);

        Button b1,b2,b3,b4,b5,b6,b7;
        b1=(Button)findViewById(R.id.button11);
        b2=(Button)findViewById(R.id.button12);
        b3=(Button)findViewById(R.id.button13);
        b4=(Button)findViewById(R.id.button14);
        b5=(Button)findViewById(R.id.button15);
        b6=(Button)findViewById(R.id.button16);
        b7=(Button)findViewById(R.id.button17);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),Definitions.class);
                startActivity(i);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getApplicationContext(),Collectioncenter.class);
                startActivity(i2);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(getApplicationContext(),Manufacturer.class);
                startActivity(i3);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(getApplicationContext(),Responsibiltyofproducer.class);
                startActivity(i3);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent i3=new Intent(getApplicationContext(),ResponsibiltyofCollector.class);
                        startActivity(i3);

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i6=new Intent(getApplicationContext(),Dealer.class);
                startActivity(i6);

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i7=new Intent(getApplicationContext(),Recycler.class);
                startActivity(i7);

            }
        });




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
