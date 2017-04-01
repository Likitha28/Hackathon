package com.example.root.hackathon;

import android.content.Context;
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
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

<<<<<<< HEAD
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.ArrayList;
=======
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
>>>>>>> afcc0c0ac257196056b780e0d8d56ba7daffdcad

public class Addactivity extends AppCompatActivity {


<<<<<<< HEAD
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
=======
                //  i1.putExtra ( "TextBox", e1.getText().toString() );
                startActivity(i1);
                //Remove activity
                //finish();
>>>>>>> afcc0c0ac257196056b780e0d8d56ba7daffdcad

    private Button addButton;
    private ArrayList<ProductData> al;

    private EditText typeView;
    private EditText nameView;
    private EditText countView;

    private Context context;

<<<<<<< HEAD

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addactivity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       final Spinner spinner=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(Addactivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.names));
arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(arrayAdapter);
        addButton = (Button) findViewById(R.id.add_activity_submitbt);

        typeView = (EditText) findViewById(R.id.add_activity_type_field);
    //    nameView = (EditText) findViewById(R.id.add_activity_name_field);
        countView = (EditText) findViewById(R.id.add_activity_count_field);

        mRecyclerView = (RecyclerView) findViewById(R.id.request_recycler_view);
=======
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
>>>>>>> afcc0c0ac257196056b780e0d8d56ba7daffdcad

        //Manish was here
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());


        ProductData p1 = new ProductData("ff" , "Laptop", "2");
        ProductData p2 = new ProductData("Lenovo" , "Laptop", "2");
        ProductData p3 = new ProductData("Lenovo" , "Laptop", "2");

        al = new ArrayList<>();
     //   al.add(p1);
       // al.add(p2);
        //l.add(p3);

        // specify an adapter (see also next example)
        mAdapter = new ProductAdapter(al, this);
        mRecyclerView.setAdapter(mAdapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProductData p4 = new ProductData(spinner.getSelectedItem().toString() , typeView.getText().toString(), countView.getText().toString());
                al.add(0, p4);
                mAdapter = new ProductAdapter(al, context);
                mRecyclerView.setAdapter(mAdapter);
            }
        });



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
