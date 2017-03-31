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


        edtFirst=(EditText)findViewById(R.id.editText);
        edtPhone=(EditText)findViewById(R.id.editText5);
        edtPass=(EditText)findViewById(R.id.editText6);
        edtConfPass=(EditText)findViewById(R.id.editText7);
        edtEmail=(EditText)findViewById(R.id.editText4);
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

<<<<<<< HEAD


        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                if((edtFirst.getText().toString().length()==0) || (edtPhone.getText().toString().length()==0) ||
                        (edtEmail.getText().toString().length()==0) || (edtPass.getText().toString().length()==0)
                        || (edtConfPass.getText().toString().length()==0) )

                {
                    Toast.makeText(getApplicationContext(), "Enter all the fields", Toast.LENGTH_LONG).show();

                    //edtFirst.setError("Enter all the fields ");
                    //edtFirst.requestFocus();
                  //  Register.this.finish();

                }
             /*   if(edtFirst.getText().toString().length()==0){
                    edtFirst.setError("First name not entered");
                    edtFirst.requestFocus();
                }
                if(edtPhone.getText().toString().length()==0){
                    edtPhone.setError("Phone number not entered");
                    edtPhone.requestFocus();
                }
                if(edtEmail.getText().toString().length()==0){
                    edtPhone.setError("Email not entered");
                    edtPhone.requestFocus();
                }

                if(edtPass.getText().toString().length()==0){
                    edtPass.setError("Password not entered");
                    edtPass.requestFocus();
                }
                if(edtConfPass.getText().toString().length()==0){
                    edtConfPass.setError("Please confirm password");
                    edtPhone.requestFocus();
                }
                */
                else if(!edtEmail.getText().toString().trim().matches(emailPattern) ){
                    edtPass.setError("Enter a valid email id");
                    edtPass.requestFocus();
                    // Register.this.finish();

                }
                else if(edtPhone.getText().toString().length() != 10){
                    edtPhone.setError("Enter a valid phone number");
                    edtPhone.requestFocus();
                    // Register.this.finish();

                }
=======
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String name = etname.getText().toString();
                final String email = etemail.getText().toString();
                final String mobile = etmobile.getText().toString();
                final String password = etpassword.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                                startActivity(intent);
                            } else {
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

>>>>>>> 943b02455de56c462ae43971f07130bd9b39321c

                else if(edtPass.getText().toString().length() < 8 ){
                    edtPass.setError("Password should be atleast of 8 charactors");
                    edtPass.requestFocus();
                   // Register.this.finish();

                }
                else if(!edtPass.getText().toString().equals(edtConfPass.getText().toString())){
                    edtConfPass.setError("Password Not matched");
                    edtConfPass.requestFocus();
                   // Register.this.finish();
                }

                else {
                Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
                Intent i1=new Intent(getBaseContext(),Success_registeration.class);
                startActivity(i1);

                //Remove activity
<<<<<<< HEAD
                finish();

            }
        }

=======
               finish();

            }
>>>>>>> 943b02455de56c462ae43971f07130bd9b39321c
        });
    }
<<<<<<< HEAD


}
=======
}
>>>>>>> 943b02455de56c462ae43971f07130bd9b39321c
