package com.example.root.hackathon;

import android.Manifest;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Dev_N on 23-03-2017.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private ArrayList<ProductData> mDataset;
    private static Context context;
    public static final int CAMERA_REQUEST = 1;
    SharedPreferences sharedPref ;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case

        public TextView nameView;
        public TextView countView;
        public TextView typeView;
        public Button deleteButton;



        public ViewHolder(View v) {
            super(v);
            //mTextView = v;

            nameView = (TextView) v.findViewById(R.id.request_fragment_Name_field);
            countView = (TextView) v.findViewById(R.id.request_fragment_Count_field);
            typeView = (TextView) v.findViewById(R.id.request_fragment_Type_field);
            deleteButton = (Button) v.findViewById(R.id.delete_request_bt);



        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ProductAdapter(ArrayList<ProductData> myDataset, Context context) {
        mDataset = myDataset;
        this.context = context;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                        int viewType) {
        // create a new view
        // set the view's size, margins, paddings and layout parameters
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.data_fragment, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element



        holder.typeView.setText(mDataset.get(position).getType());
        holder.countView.setText(mDataset.get(position).getCount());
        holder.nameView.setText(mDataset.get(position).getName());

        holder.deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDataset.remove(position);
                notifyDataSetChanged();
            }
        });




    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }




}
