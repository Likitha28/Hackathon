package com.example.root.hackathon;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Complete_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);
        final EditText etaddress = (EditText) findViewById(R.id.editText2);
        final EditText etpincode = (EditText) findViewById(R.id.editText3);
        final EditText etaccount = (EditText) findViewById(R.id.editText8);
        final EditText etifsc = (EditText) findViewById(R.id.editText9);
        final EditText etbankname = (EditText) findViewById(R.id.editText10);
        final EditText etacountholdername = (EditText) findViewById(R.id.editText12);


        final Button button1 = (Button) findViewById(R.id.login);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                final String address = etaddress.getText().toString();
                final String pincode = etpincode.getText().toString();
                final String accountno = etaccount.getText().toString();
                final String ifsc = etifsc.getText().toString();
                final String bankname = etbankname.getText().toString();
                final String accountholder = etacountholdername.getText().toString();

                // Response received from the server
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if (success) {

                                //  int user_id=jsonResponse.getInt("user_id");
                                int user_id = jsonResponse.getInt("user_id");
                                String name = jsonResponse.getString("name");
                                // int age = jsonResponse.getInt("age");

                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                intent.putExtra("name", name);
                                startActivity(intent);

                                //LoginActivity.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Complete_profile.this);
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

                Complete_ProfileRequest loginRequest = new Complete_ProfileRequest(address, pincode,bankname,accountno,accountholder,ifsc ,responseListener);
                RequestQueue queue = Volley.newRequestQueue(Complete_profile.this);
                queue.add(loginRequest);
            }
        });
    }
}