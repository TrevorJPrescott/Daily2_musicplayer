package com.trevorpc.myapplication;

import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.trevorpc.myapplication.Services.PlayerService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
        mBuilder.setSmallIcon(R.drawable.ic_launcher_foreground);
        mBuilder.setContentTitle("Notification Alert, Click Me!");
        mBuilder.setContentText("Hi, This is Android Notification Detail!");




    }

    public void PlayerService(View view) {

        Intent intent = new Intent(getApplicationContext(),PlayerService.class);

        switch(view.getId())
        {
            case R.id.btnStart:
                startService(intent);
                break;
            case R.id.btnStop:
                stopService(intent);
                break;
            case R.id.btnPause:
        //        pauseService(intent);



//
//                Intent resultIntent = new Intent(this, ResultActivity.class);
//                TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
//                stackBuilder.addParentStack(ResultActivity.class);
//
//// Adds the Intent that starts the Activity to the top of the stack
//                stackBuilder.addNextIntent(resultIntent);
//                PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
//                mBuilder.setContentIntent(resultPendingIntent);

        }
    }
//    public void PlayerService(View view) {
//
//        Intent intent = new Intent(getApplicationContext(), PlayerService.class);
//
//        switch (view.getId()) {
////
////            case R.id.btnStartNormal:
////                startService(intent);
////
////                break;
////
////            case R.id.btnStopNormal:
////                stopService(intent);
////
////                break;
//        }
//    }
}
