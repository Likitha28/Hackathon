package com.example.root.hackathon;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.example.root.hackathon.R;

public class Notification extends AppCompatActivity {
    int hour,min;
    java.util.Calendar cal1 = java.util.Calendar.getInstance();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button butt;
        butt = (Button) findViewById(R.id.butt);

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   hour=cal1.get(java.util.Calendar.HOUR);
                //   min=cal1.get(java.util.Calendar.MINUTE);
                //  hour=10;min=15;
                String[] m=new String[]{"manish","kaustubh","vishal"};
                java.util.Calendar cal = java.util.Calendar.getInstance();

                cal.set(java.util.Calendar.HOUR_OF_DAY, 4);
                cal.set(java.util.Calendar.MINUTE, 11);

                //  cal.set(java.util.Calendar.SECOND, 1);
                Intent intent= new Intent(getApplicationContext(),Notificationrec.class);
                intent.putExtra("message",m[0]);
                PendingIntent pi=PendingIntent.getBroadcast(getApplicationContext(),100,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                AlarmManager alarmManager= (AlarmManager)getSystemService(ALARM_SERVICE);
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,cal.getTimeInMillis(),AlarmManager.INTERVAL_DAY,pi);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
