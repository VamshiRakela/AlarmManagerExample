package com.example.vamshi.alarmmanagerexample;

/**
 * Created by srava on 7/9/2016.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.util.Log;
import android.widget.Toast;

public class MyBroadcast1Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"klo",Toast.LENGTH_SHORT).show();

    }


    // MediaPlayer mp;


}