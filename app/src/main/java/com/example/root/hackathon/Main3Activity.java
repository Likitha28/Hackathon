package com.example.root.hackathon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessaging;

public class Main3Activity extends AppCompatActivity {
    SharedPreferences sp;
   BroadcastReceiver mRegistrationBroadcastReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        sp = getApplicationContext().getSharedPreferences("login", 0);
        if (sp.contains("user_id")) {
            Intent i = new Intent();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();   //finish current activity
        }
        final Button button1 = (Button) findViewById(R.id.register);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i1 = new Intent(getBaseContext(), Register.class);
                startActivity(i1);

                //Remove activity
                //finish();


            }
            // Perform action on click
        });


        final Button button2 = (Button) findViewById(R.id.login);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i2 = new Intent(getBaseContext(), LoginActivity.class);
                startActivity(i2);

                //Remove activity
                finish();

            }
            // Perform action on click
        });

    }
            }

            // sendRegistrationToServer: cQy6IEA2KSc:APA91bEjieEXXPgyX9iDCrFh0qpyXydJ9ba1mWUAkxBVEJc35u0kmgIxoW8jAYe9hiZQ49cZEI0Txgs9ZNEF574f6EecnBINJxZzTFUP-grdSUmeduNCq0ZzuRsl3aMoQguoc5ljyDlw
