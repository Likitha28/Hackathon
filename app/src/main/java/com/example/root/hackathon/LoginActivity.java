package com.example.root.hackathon;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    Button b1;
    EditText ed1,ed2;

    TextView tx1,tx2;
    int counter = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


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
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show();


                    Intent i1=new Intent(getBaseContext(),MainActivity.class);
                    startActivity(i1);

                    //Remove activity
                    finish();

                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0) {
                        b1.setEnabled(false);
                    }






                }
            }



        });










    }
}
