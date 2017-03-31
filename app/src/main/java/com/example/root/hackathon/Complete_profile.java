package com.example.root.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Complete_profile extends AppCompatActivity {
    EditText edtAddr,edtPin, edtAccnum, edtIfsc, edtBank , edtAccholder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);

        edtAddr=(EditText)findViewById(R.id.editText2);
        edtPin=(EditText)findViewById(R.id.editText3);
        edtAccnum=(EditText)findViewById(R.id.editText8);
        edtIfsc=(EditText)findViewById(R.id.editText9);
        edtBank=(EditText)findViewById(R.id.editText10);
        edtAccholder=(EditText)findViewById(R.id.editText12);

        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {



                if((edtAddr.getText().toString().length()==0) || (edtPin.getText().toString().length()==0) ||
                        (edtBank.getText().toString().length()==0) || (edtAccnum.getText().toString().length()==0)
                        || (edtIfsc.getText().toString().length()==0) || (edtAccholder.getText().toString().length()==0)  )

                {
                    Toast.makeText(getApplicationContext(), "Enter all the fields", Toast.LENGTH_LONG).show();
                    //edtAddr.setError("Enter all the fields ");
                   // edtAddr.requestFocus();
                    //  Register.this.finish();

                }


                else {
                    Toast.makeText(getApplicationContext(), "Profile Updated", Toast.LENGTH_LONG).show();
                    Intent i1=new Intent(getBaseContext(),profile_update.class);
                    startActivity(i1);
                    //Remove activity
                    finish();

                }


                //Remove activity
                //finish();




            }
            // Perform action on click
        });

    }
}
