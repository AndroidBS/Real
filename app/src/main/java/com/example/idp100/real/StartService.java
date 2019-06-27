package com.example.idp100.real;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class StartService extends Service {
    private static final String TAG = "BluetoothService";
    BluetoothAdapter btAdapter;
    BluetoothDevice device;

    Context serviceContext;
    public StartService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onStart(Intent intent, int startid){
        Toast.makeText(this, "Bluetooth Service Started", Toast.LENGTH_LONG).show();
        Log.d(TAG, "OnStart");

        BluetoothAdapter.getDefaultAdapter().enable();
        //Intent btIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        //btIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //serviceContext.startActivity(btIntent);

        registerReceiver(bcReceiver, new IntentFilter(BluetoothDevice.ACTION_FOUND));

        btAdapter.startDiscovery();

    }

    @Override
    public void onDestroy(){
        BluetoothAdapter.getDefaultAdapter().disable();
        unregisterReceiver(bcReceiver);
        btAdapter.cancelDiscovery();
    }

    private final BroadcastReceiver bcReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            String action = intent.getAction();
            if(BluetoothDevice.ACTION_FOUND.equals(action)){

                //Do Something
            }
        }
    };
}
