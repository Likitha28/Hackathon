package com.example.root.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
<<<<<<< HEAD

import org.json.JSONException;
import org.json.JSONObject;
import android.app.AlertDialog;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
=======
import android.widget.Toast;
>>>>>>> df1a20c0293db8151dda44dde33e7bac1a39a8ce

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final EditText etname = (EditText) findViewById(R.id.name);
        final EditText etemail = (EditText) findViewById(R.id.email);
        final EditText etmobile = (EditText) findViewById(R.id.mobile);
        final EditText etpassword=(EditText) findViewById(R.id.password);

<<<<<<< HEAD
        final Button button = (Button) findViewById(R.id.login);
=======
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        EditText ed1;
        ed1 = (EditText)findViewById(R.id.editText4 );

        final String email = ed1.getText().toString().trim();

        final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        ed1 .addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {

                if (email.matches(emailPattern) && s.length() > 0)
                {
                    Toast.makeText(getApplicationContext(),"valid email address",Toast.LENGTH_SHORT).show();
                    // or
                    // textView.setText("valid email");
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid email address",Toast.LENGTH_SHORT).show();
                    //or
                    // textView.setText("invalid email");
                }
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // other stuffs
            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // other stuffs
            }
        });

>>>>>>> df1a20c0293db8151dda44dde33e7bac1a39a8ce


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
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
=======

                Intent i1=new Intent(getBaseContext(),Success_registeration.class);
                startActivity(i1);

                //Remove activity
               finish();




>>>>>>> df1a20c0293db8151dda44dde33e7bac1a39a8ce
            }
        });
    }
}