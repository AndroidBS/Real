package com.example.idp100.real;

import android.app.ProgressDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.util.UUID;

import app.akexorcist.bluetotohspp.library.*;

import static com.example.idp100.real.R.drawable.bluetooth;

public class Main2Activity extends AppCompatActivity {

    Button bt,bt1,bt2,bt3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        bt=(Button)findViewById(R.id.button);
        bt1=(Button)findViewById(R.id.button3);
        bt2=(Button)findViewById(R.id.button1);
        bt3=(Button)findViewById(R.id.button2);



        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


             Intent bx = new Intent(Main2Activity.this,Control.class);
                startActivity(bx);

            }
        });




bt1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent blu = new Intent(Main2Activity.this,DeviceList.class);
        startActivity(blu);

    }
});
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bl = new Intent(Main2Activity.this,Voi_Top.class);
                startActivity(bl);

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bl1 = new Intent(Main2Activity.this,MusicPlayer.class);
                startActivity(bl1);
            }
        });



    }

}
