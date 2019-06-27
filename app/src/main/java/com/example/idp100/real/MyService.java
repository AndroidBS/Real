package com.example.idp100.real;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

import static android.content.ContentValues.TAG;

public class MyService extends Service {
//    public int counter=0;
    public MyService() {
    }
//    @Override
//    public void onCreate() {
//        // Toast.makeText(this, "The new Service was Created", Toast.LENGTH_LONG).show();
//
//    }

    @Override
    @Deprecated
    public void onStart(Intent intent, int startId) {
        // For time consuming an long tasks you can launch a new thread here...
        // Do your Bluetooth Work Here
        // Toast.makeText(this, " Service Started", Toast.LENGTH_LONG).show();
       // super.onStart(intent, startId);

    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
       // throw new UnsupportedOperationException("Not yet implemented");
       return null;
    }
//
//    @Override
//    public int onStartCommand(Intent intent, int flags, int startId) {
//
//       // String deviceg = intent.getStringExtra("bluetooth_device");
//        super.onStartCommand(intent, flags, startId);
//      //  mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
//
//       // connectToDevice(deviceg);
//
//        return START_STICKY;
//    }





    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();

    }
}

