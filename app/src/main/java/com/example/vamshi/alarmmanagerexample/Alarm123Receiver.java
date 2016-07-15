package com.example.vamshi.alarmmanagerexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;


/**
 * Created by srava on 7/9/2016.
 */
public class Alarm123Receiver extends BroadcastReceiver {



      //  final Handler handler=new Handler();

       // handler.post(new Runnable() {
       //     @Override
       //     public void run() {


    @Override
    public void onReceive(Context context, Intent intent) {


        Log.v("HEre","Received");
        Toast.makeText(context,"hELLO",Toast.LENGTH_SHORT).show();
    }
    //  }
       // });


}
