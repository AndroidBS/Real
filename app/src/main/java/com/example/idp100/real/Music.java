package com.example.idp100.real;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Music extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        MyApplication.getInstance().setupBluetoothConnection();
        MyApplication.getInstance().getCurrentBluetoothConnection();
    }
}
