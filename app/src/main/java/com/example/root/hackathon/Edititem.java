package com.example.root.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Edititem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edititem);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final TextView t1 = (TextView) findViewById(R.id.textView27) ;

        Intent i2 = getIntent();
        String text = i2.getStringExtra ( "TextBox" );
// Now set this value to EditText
        t1.setText ( text );



        final Button button1 = (Button) findViewById(R.id.button7);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i1=new Intent(getBaseContext(),ViewItem.class);
                startActivity(i1);

                //Remove activity
                finish();




            }
            // Perform action on click
        });


    }

}
