package com.example.root.hackathon;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;


public class Complete_profile extends AppCompatActivity {
    EditText edtAddr,edtPin, edtAccnum, edtIfsc, edtBank , edtAccholder;

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);
        sp = getSharedPreferences("login", MODE_PRIVATE);


       /* edtAddr=(EditText)findViewById(R.id.editText2);
        edtPin=(EditText)findViewById(R.id.editText3);
        edtAccnum=(EditText)findViewById(R.id.editText8);
        edtIfsc=(EditText)findViewById(R.id.editText9);
        edtBank=(EditText)findViewById(R.id.editText10);
        edtAccholder=(EditText)findViewById(R.id.editText12); */

        //final Button button1 = (Button) findViewById(R.id.button1);

        final EditText etaddress = (EditText) findViewById(R.id.editText11);
        final EditText etpincode = (EditText) findViewById(R.id.editText12);
        final EditText etaccount = (EditText) findViewById(R.id.editText13);
        final EditText etifsc = (EditText) findViewById(R.id.editText17);
        final EditText etbankname = (EditText) findViewById(R.id.editText18);
        final EditText etacountholdername = (EditText) findViewById(R.id.editText19);

        final Button button1 = (Button) findViewById(R.id.save);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String address = etaddress.getText().toString();
                final String pincode = etpincode.getText().toString();
                final String accountno = etaccount.getText().toString();
                final String ifsc = etifsc.getText().toString();
                final String bankname = etbankname.getText().toString();
                final String accountholder = etacountholdername.getText().toString();




              /*  else {
                    Toast.makeText(getApplicationContext(), "Profile Updated", Toast.LENGTH_LONG).show();
                    Intent i1=new Intent(getBaseContext(),MainActivity.class);
                    startActivity(i1);
                    //Remove activity
                    finish();

                } */



                int user_id= sp.getInt("user_id",0);
                // Response received from the server
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                //Remove activity
                //finish();


                            if (success) {

                                //  int user_id=jsonResponse.getInt("user_id");
                              //  int user_id = jsonResponse.getInt("user_id");
                                //String name = jsonResponse.getString("name");
                                // int age = jsonResponse.getInt("age");

                                if((address.length()==0) || (pincode.length()==0) ||
                                        (bankname.length()==0) || (accountno.length()==0)
                                        || (ifsc.length()==0) || (accountholder.length()==0)  )

                                {
                                    Toast.makeText(getApplicationContext(), "Enter all the fields", Toast.LENGTH_LONG).show();
                                    //edtAddr.setError("Enter all the fields ");
                                    // edtAddr.requestFocus();
                                    //  Register.this.finish();

                                }
                                else
                                {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                //intent.putExtra("name", name);
                                startActivity(intent);
                                }

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

                Complete_ProfileRequest loginRequest = new Complete_ProfileRequest(user_id ,address, pincode,bankname,accountno,accountholder,ifsc ,responseListener);
                RequestQueue queue = Volley.newRequestQueue(Complete_profile.this);
                queue.add(loginRequest);
            }
        });
    }



    }
