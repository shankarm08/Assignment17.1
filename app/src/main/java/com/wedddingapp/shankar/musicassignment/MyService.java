package com.wedddingapp.shankar.musicassignment;

/**
 * Created by shan on 12/27/2017.
 */

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MyService extends Service {

   // public static final String ACTION_STOP = "stop_music_service";
    MediaPlayer player;



    @Override
    public IBinder onBind(Intent args0) {
        return null;

    }


    public void onCreate() {
        super.onCreate();
        player = MediaPlayer.create(this, R.raw.wedding); //storing music file in raw folder
        player.setLooping(true); // Set looping
        player.setVolume(100,100);
        //this.stopSelf();


    }

    public void onStart(Intent intent, int startId) {


        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        player.start();
        // TO DO
    }
    public IBinder onUnBind(Intent arg0) {
        // TO DO Auto-generated method
        return null;
    }

    public void onStop() {

        player.stop();
        // player.stopService()

        this.stopSelf();

    }
    public void onPause() {


        //stopService(new Intent(this, MainActivity.class));
    }
    @Override
    public void onDestroy() {

        Toast.makeText(this, "Service Stopped", Toast.LENGTH_LONG).show();
        player.stop();




        // Intent stopIntent = new Intent(getBaseContext(),MyService.class);
        // intent.setAction(MyService.ACTION_STOP);
        // stopService(stopIntent);

        // Log.d("SERVICE","ONDESTROY");

       //Intent intent = new Intent();
       // intent.setClass(getApplicationContext(), MyService.class);
       // stopService(intent);



        //player.stop();

       // player.release();
    }

    @Override
    public void onLowMemory() {

    }




}



