package com.example.root.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Addactivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private static final String[]paths = {"Laptop", "Computer", "Refrigerator","Mobile phones","Camera","Batteries","Answering Machines","Automotive Electronics","Lead Acid Batteries","Routers",
            "Televisions","Servers","Scanners","Chargers","Video game systems","Printers","Keyboards","Air conditioners" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addactivity);
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


        //Manish was here

        final Button button1 = (Button) findViewById(R.id.login);
        //final EditText e1 = (EditText) findViewById(R.id.editText18) ;

      //  final Button button1 = (Button) findViewById(R.id.button1);
        //final EditText e1 = (EditText) findViewById(R.id.editText18) ;

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i1=new Intent(getBaseContext(),Edititem.class);

              //  i1.putExtra ( "TextBox", e1.getText().toString() );
                startActivity(i1);
                //Remove activity
                //finish();




            }
            // Perform action on click
        });


      //  spinner = (Spinner)findViewById(R.id.spinner);
            ArrayAdapter<String>adapter = new ArrayAdapter<String>(Addactivity.this,
                    android.R.layout.simple_spinner_item,paths);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(this);

        }

        public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

            switch (position) {
                case 0:
                    // Whatever you want to happen when the first item gets selected


                    String text = spinner.getSelectedItem().toString();
             //       TextView t1 = (TextView) findViewById(R.id.textView18) ;
                   // t1.setText(text);
                    break;
                case 1:
                    // Whatever you want to happen when the second item gets selected
                    String text1 = spinner.getSelectedItem().toString();
               //     t1 = (TextView) findViewById(R.id.textView18);
                    //t1.setText(text1);
                    break;
                case 2:
                    // Whatever you want to happen when the thrid item gets selected
                    break;


        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
