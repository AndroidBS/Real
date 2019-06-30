package com.example.idp100.real;

import android.app.Application;
import android.bluetooth.BluetoothSocket;

/**
 * Created by IDP100 on 6/28/2019.
 */

public class MyApplication extends Application{


  private static MyApplication instance;


    public static MyApplication getInstance() {
        return instance;
    }
    BluetoothSocket btSocket = null;



    public void onCreate() {
        super.onCreate();

        instance = this;
    }

    public void setupBluetoothConnection()
    {
        // Either setup your connection here, or pass it in
    }

    public BluetoothSocket getCurrentBluetoothConnection()
    {
        return btSocket;
    }
}