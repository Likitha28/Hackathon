package com.example.root.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/*public class Addactivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, NavigationView.OnNavigationItemSelectedListener {
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

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



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

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


        //Manish was here

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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

    @Override
    public boolean onNavigationItemSelected( MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_request) {


            Intent i1=new Intent(getBaseContext(),Addactivity.class);
            startActivity(i1);

            //Remove activity
            //finish();



        } else if (id == R.id.nav_track) {

            Intent i1=new Intent(getBaseContext(),Track.class);
            startActivity(i1);

            //Remove activity
            finish();




        } else if (id == R.id.nav_hazards) {
            Intent i2=new Intent(getBaseContext(),Hazard.class);
            startActivity(i2);




        } else if (id == R.id.nav_learn) {
            Intent intent5=new Intent(getApplicationContext(),Learn.class);
            startActivity(intent5);

        }
        else if (id == R.id.nav_legal) {
            Intent i3=new Intent(getBaseContext(),Policies.class);
            startActivity(i3);
        }

        else if (id == R.id.nav_share) {

        }
        else if (id == R.id.nav_profile) {

            Intent i5=new Intent(getBaseContext(),Success_registeration.class);
            startActivity(i5);

        }
        else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    }
*/
