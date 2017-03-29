package com.example.root.hackathon;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import static com.example.root.hackathon.R.id.email;

public class LoginActivity extends AppCompatActivity {

    SharedPreferences sp;
    String email;
    String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = (EditText) findViewById(R.id.email);
        final EditText etPassword = (EditText) findViewById(R.id.password);
        final Button login = (Button) findViewById(R.id.login);

<<<<<<< HEAD
        login.setOnClickListener(new View.OnClickListener() {
=======
        b1 = (Button)findViewById(R.id.button1);
        ed1 = (EditText)findViewById(R.id.editText13);
        ed2 = (EditText)findViewById(R.id.editText14);


        tx1 = (TextView)findViewById(R.id.textView16);
        tx2 = (TextView)findViewById(R.id.textView17);

       // tx1.setVisibility(View.GONE);

       // tx1.setVisibility(View.GONE);


       // final EditText emailValidate = (EditText)findViewById(R.id.textMessage);

       // final TextView textView = (TextView)findViewById(R.id.text);



        b1.setOnClickListener(new View.OnClickListener() {
>>>>>>> df1a20c0293db8151dda44dde33e7bac1a39a8ce
            @Override
            public void onClick(View v) {
                email = etUsername.getText().toString();
                password = etPassword.getText().toString();

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

                                loginCheck(user_id);
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                intent.putExtra("name", name);
                                startActivity(intent);

                                //LoginActivity.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
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


                LoginRequest loginRequest = new LoginRequest(email, password, responseListener);
                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                queue.add(loginRequest);
            }

        });
    }
        void loginCheck(int user_id){

                SharedPreferences.Editor e=sp.edit();
                e.putInt("user_id",user_id);
                e.commit();
        }
    }
