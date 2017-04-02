package com.example.root.hackathon;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class Addactivity extends AppCompatActivity
  implements NavigationView.OnNavigationItemSelectedListener
{


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private Button addButton;
    private ArrayList<ProductData> al;

    private EditText typeView;
    private EditText nameView;
    private EditText countView;
SharedPreferences sp;
    private Context context;
Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addactivity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        sp = getSharedPreferences("login", MODE_PRIVATE);
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        HashMap<String,String> hashMap= (HashMap<String,String>)bundle.getSerializable("value");
      //  Log.v("HashMapTest", hashMap.get("key"));

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Addactivity.this, android.R.layout.simple_list_item_1, new ArrayList<String>());
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        spinner.setAdapter(arrayAdapter);
        for(String s1:hashMap.keySet())
        {
            arrayAdapter.add(hashMap.get(s1));
        }
        arrayAdapter.notifyDataSetChanged();
        addButton = (Button) findViewById(R.id.add_activity_submitbt);
        //typeView = (EditText) findViewById(R.id.add_activity_type_field);
        ///  nameView = (EditText) findViewById(R.id.add_activity_name_field);
        countView = (EditText) findViewById(R.id.add_activity_count_field);

        mRecyclerView = (RecyclerView) findViewById(R.id.request_recycler_view);

        //Manish was here
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());


        ProductData p1 = new ProductData( "Laptop", "2");
        ProductData p2 = new ProductData( "Laptop", "2");
        ProductData p3 = new ProductData( "Laptop", "2");

        al = new ArrayList<>();
        // al.add(p1);
        //al.add(p2);
        //al.add(p3);
        // specify an adapter (see also next example)
        mAdapter = new ProductAdapter(al, this);
        mRecyclerView.setAdapter(mAdapter);
if(countView.toString()!=" ") {
    addButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            ProductData p4 = new ProductData(spinner.getSelectedItem().toString(), countView.getText().toString());
            al.add(0, p4);
            mAdapter = new ProductAdapter(al, context);
            mRecyclerView.setAdapter(mAdapter);
        }
    });
}

        confirm = (Button) findViewById(R.id.confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int user_id= sp.getInt("user_id",0);

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            //Remove activity
                            //finish();
                            if (success) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                //intent.putExtra("name", name);
                                startActivity(intent);

                                //  int user_id=jsonResponse.getInt("user_id");
                                //  int user_id = jsonResponse.getInt("user_id");
                                //String name = jsonResponse.getString("name");
                                // int age = jsonResponse.getInt("age");
                                //LoginActivity.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Addactivity.this);
                                builder.setMessage("Login Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                AddactivityRequest loginRequest = new AddactivityRequest(user_id, al, responseListener);
                RequestQueue queue = Volley.newRequestQueue(Addactivity.this);
                queue.add(loginRequest);
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);

        toggle.syncState();

       // NavigationView navigationView1 = (NavigationView) findViewById(R.id.nav_view);
        //navigationView1.setNavigationItemSelectedListener(this);
    }

    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
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

