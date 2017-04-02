package com.example.root.hackathon;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

/**
 * Created by Manish on 27-Mar-17.
 */

public class Notificationrec extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {
        String message=intent.getStringExtra("message");
        createnotification(context, "Tip Of The Day", "Check now", message);
    }
    private void createnotification(Context context, String s, String s1, String alert) {

        PendingIntent pintent = PendingIntent.getActivity(context, 0, new Intent(context, Recevie.class), 0);
        NotificationCompat.Builder mbuilder = new NotificationCompat.Builder(context)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(s)
                .setTicker(s1)
                .setContentText(alert);

        mbuilder.setContentIntent(pintent);

        mbuilder.setDefaults(NotificationCompat.DEFAULT_LIGHTS | NotificationCompat.DEFAULT_VIBRATE | NotificationCompat.DEFAULT_SOUND);
        //     mbuilder.setDefaults(NotificationCompat.DEFAULT_LIGHTS);
        //   mbuilder.setDefaults(NotificationCompat.DEFAULT_SOUND);
        mbuilder.setAutoCancel(true);

        NotificationManager mnotify = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        mnotify.notify(1, mbuilder.build());
        // Toast.makeText(context, "Alarm worked.", Toast.LENGTH_LONG).show();

    }
}