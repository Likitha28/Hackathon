package com.example.root.hackathon;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    SharedPreferences sp;
    Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        sp = getApplicationContext().getSharedPreferences("login", 0);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        TextView name1 = (TextView) findViewById(R.id.name);

        // Display user details
        //  String message =  "Welcome" +"   "+ name ;
        //  name1.setText(message);

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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_request) {

   final HashMap<String, String> map = new HashMap<String, String>();

            Response.Listener<String> responseListener = new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        int count = 0;

                        JSONObject jsonResponse = new JSONObject(response);
                        if (jsonResponse.getBoolean("success")) {
                            for (int i = 0; i < jsonResponse.length() - 1; i++) {
                                map.put(jsonResponse.getJSONObject("" + i).getString("prod_id"), jsonResponse.getJSONObject("" + i).getString("prod_type"));

                            }

                            Intent i=new Intent(context,Addactivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putSerializable("value", map);
                            i.putExtras(bundle);
                            startActivity(i);
                            for (String s : map.keySet()) {
                                Log.e("MainActivity", s + " " + map.get(s));
                            }

                        } else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
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


            //   String collectorId = pref.getString("collector_id", null);
            //RequestFetch productRequest = new RequestFetch(collectorId, responseListener);
            RequestFetch productRequest = new RequestFetch("", responseListener);
            RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
            queue.add(productRequest);


        } else if (id == R.id.nav_track) {

            Intent i1 = new Intent(getBaseContext(), Track.class);
            startActivity(i1);

            //Remove activity
            finish();


        } else if (id == R.id.nav_hazards) {
            Intent i2 = new Intent(getApplicationContext(), MainHazard.class);
            startActivity(i2);


        } else if (id == R.id.nav_learn) {
            Intent intent5 = new Intent(getApplicationContext(), Learn.class);
            startActivity(intent5);

        } else if (id == R.id.nav_legal) {
            Intent i3 = new Intent(getBaseContext(), Policies.class);
            startActivity(i3);
        } else if (id == R.id.nav_notification) {
            Intent i10 = new Intent(getBaseContext(), Notification.class);
            startActivity(i10);

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_profile) {

            Intent i5 = new Intent(getBaseContext(), Success_registeration.class);
            startActivity(i5);

        } else if (id == R.id.nav_send) {

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}



