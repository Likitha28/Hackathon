package com.example.root.hackathon;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AddNew extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


    private PopupWindow pw;
    private boolean expanded; 		//to  store information whether the selected values are displayed completely or in shortened representatn
    public static boolean[] checkSelected;	// store select/unselect information about the values in the list

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new);
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

      //  NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
      //  navigationView.setNavigationItemSelectedListener(this);


        initialize();
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



    /*
     * Function to set up initial settings: Creating the data source for drop-down list, initialising the checkselected[], set the drop-down list
     * */
    private void initialize(){
        //data source for drop-down list
        final ArrayList<String> items = new ArrayList<String>();
        items.add("Laptop");
        items.add("Computer");
        items.add("Keyboard");
        items.add("Mobile Phones");
        items.add("Refrigerator");

        checkSelected = new boolean[items.size()];
        //initialize all values of list to 'unselected' initially
        for (int i = 0; i < checkSelected.length; i++) {
            checkSelected[i] = false;
        }

	/*SelectBox is the TextView where the selected values will be displayed in the form of "Item 1 & 'n' more".
    	 * When this selectBox is clicked it will display all the selected values
    	 * and when clicked again it will display in shortened representation as before.
    	 * */
        final TextView tv = (TextView) findViewById(R.id.SelectBox);
        tv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(!expanded){
                    //display all selected values
                    String selected = "";
                    int flag = 0;
                    for (int i = 0; i < items.size(); i++) {
                        if (checkSelected[i] == true) {
                            selected += items.get(i);
                            selected += ", ";
                            flag = 1;
                        }
                    }
                    if(flag==1)
                        tv.setText(selected);
                    expanded =true;
                }
                else{
                    //display shortened representation of selected values
                    tv.setText(DropDownListAdapter.getSelected());
                    expanded = false;
                }
            }
        });

        //onClickListener to initiate the dropDown list
        Button createButton = (Button)findViewById(R.id.create);
        createButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                initiatePopUp(items,tv);
            }
        });
    }

    /*
     * Function to set up the pop-up window which acts as drop-down list
     * */
    private void initiatePopUp(ArrayList<String> items, TextView tv){
        LayoutInflater inflater = (LayoutInflater)AddNew.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //get the pop-up window i.e.  drop-down layout
        LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.pop_up_window, (ViewGroup)findViewById(R.id.PopUpView));

        //get the view to which drop-down layout is to be anchored
        RelativeLayout layout1 = (RelativeLayout)findViewById(R.id.relativeLayout1);
        pw = new PopupWindow(layout, ActionBar.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);

        //Pop-up window background cannot be null if we want the pop-up to listen touch events outside its window
        pw.setBackgroundDrawable(new BitmapDrawable());
        pw.setTouchable(true);

        //let pop-up be informed about touch events outside its window. This  should be done before setting the content of pop-up
        pw.setOutsideTouchable(true);
        pw.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);

        //dismiss the pop-up i.e. drop-down when touched anywhere outside the pop-up
        pw.setTouchInterceptor(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                if (event.getAction() == MotionEvent.ACTION_OUTSIDE) {
                    pw.dismiss();
                    return true;
                }
                return false;
            }
        });

        //provide the source layout for drop-down
        pw.setContentView(layout);

        //anchor the drop-down to bottom-left corner of 'layout1'
        pw.showAsDropDown(layout1);

        //populate the drop-down list
        final ListView list = (ListView) layout.findViewById(R.id.dropDownList);
        DropDownListAdapter adapter = new DropDownListAdapter(this, items, tv);
        list.setAdapter(adapter);
    }


    @Override
    public boolean onNavigationItemSelected( MenuItem item) {



        int id = item.getItemId();

        if (id == R.id.nav_request) {


            Intent i1=new Intent(getBaseContext(),AddNew.class);
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

