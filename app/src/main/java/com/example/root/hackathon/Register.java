package com.example.root.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;
import android.app.AlertDialog;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText edtFirst,edtPhone, edtPass, edtConfPass, edtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        //edtFirst=(EditText)findViewById(R.id.editText);
        //edtPhone=(EditText)findViewById(R.id.editText5);
       // edtPass=(EditText)findViewById(R.id.editText6);
       // edtConfPass=(EditText)findViewById(R.id.editText7);
       // edtEmail=(EditText)findViewById(R.id.editText4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final EditText etname = (EditText) findViewById(R.id.name);
        final EditText etemail = (EditText) findViewById(R.id.email);
        final EditText etmobile = (EditText) findViewById(R.id.mobile);
        final EditText etpassword=(EditText) findViewById(R.id.password);

        final Button button = (Button) findViewById(R.id.login);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String name = etname.getText().toString();
                final String email = etemail.getText().toString();
                final String mobile = etmobile.getText().toString();
                final String password = etpassword.getText().toString();
                final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if (success) {

                                if((name.length()==0) || (mobile.length()==0) || (email.length()==0) || (password.length()==0))

                               {
                                    Toast.makeText(getApplicationContext(), "Enter all the fields", Toast.LENGTH_LONG).show();

                                    etname.setError("Enter all the fields ");
                                    etname.requestFocus();
                                    //Register.this.finish();
                                    //startActivity(new Intent(Register.this,Register.class));

                                }

                                else if(!email.trim().matches(emailPattern) ){
                                    etemail.setError("Enter a valid email id");
                                    etemail.requestFocus();
                                    //startActivity(new Intent(Register.this,Register.class));
                                    // Register.this.finish();

                                }
                                else if(mobile.length() != 10){
                                    etmobile.setError("Enter a valid phone number");
                                    etmobile.requestFocus();
                                   // startActivity(new Intent(Register.this,Register.class));
                                    // Register.this.finish();

                                }
                                else if(password.length() < 8 ){
                                    etpassword.setError("Password should be atleast of 8 charactors");
                                    etpassword.requestFocus();
                                   // startActivity(new Intent(Register.this,Register.class));
                                    //Register.this.finish();

                                }


                                else {
                                    Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();

                                    //Intent i1=new Intent(getBaseContext(),Success_registeration.class);
                                    //startActivity(i1);

                                    //Remove activity

                                    // finish();
                                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                                    startActivity(intent);
                                    finish();


                                }




                            }

                            else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Register.this);
                                builder.setMessage("Register Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                RegisterRequest registerRequest = new RegisterRequest(name,email,mobile, password, responseListener);
                RequestQueue queue = Volley.newRequestQueue(Register.this);
                queue.add(registerRequest);

                finish();

            }

        });
    }


}



