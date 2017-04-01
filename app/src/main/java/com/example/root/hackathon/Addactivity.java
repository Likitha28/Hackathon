package com.example.root.hackathon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.ArrayList;

public class Addactivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private Button addButton;
    private ArrayList<ProductData> al;

    private EditText typeView;
    private EditText nameView;
    private EditText countView;

    private Context context;


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

}
