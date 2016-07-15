package com.example.vamshi.alarmmanagerexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by srava on 7/11/2016.
 */
public class RALARM extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,"Helo",Toast.LENGTH_SHORT).show();
    }
}
