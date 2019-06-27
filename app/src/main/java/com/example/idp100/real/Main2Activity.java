package com.example.idp100.real;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import app.akexorcist.bluetotohspp.library.*;

import static com.example.idp100.real.R.drawable.bluetooth;

public class Main2Activity extends AppCompatActivity {

    Button bt,bt1,bt2,bt3;
    Context serviceContext;
   // final String CONTROL= "A";
    //final String VOICE="B";
    //final String MUSIC="C";
//   BluetoothSPP bt5;
//    BluetoothAdapter  mBluetoothAdapter;
//    public String Device_ID = "A3:1A:00:C2:05:B5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt=(Button)findViewById(R.id.button);
        bt1=(Button)findViewById(R.id.button3);
        bt2=(Button)findViewById(R.id.button1);
        bt3=(Button)findViewById(R.id.button2);

//        try {
//            //Log.e("address", trapReceiver.getLocalIpAddress());
//            startService(new Intent(this, MyService.class));
//
//            Log.e("", "Succeeded");
//        } catch (Exception e) {
//            Log.e("", "failed");
//            e.printStackTrace();
//        }


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  startService(new Intent(Main2Activity.this, StartService.class));
               // bindService(Intent,mBluetoothAdapter,0);
              Intent bx = new Intent(Main2Activity.this,Control.class);
                startActivity(bx);
             //  startService(new Intent(Main2Activity.this, MyService.class));
                //   bluetooth.send(CONTROL, true);
            }
        });

//         mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
//       startService(new Intent(this, MyService.class));

 // startService(new Intent(this, MyService.class));


//       Intent btIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//       btIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        serviceContext.startActivity(btIntent);



bt1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent blu = new Intent(Main2Activity.this,DeviceList.class);
        startActivity(blu);

       // startService(new Intent(Main2Activity.this, MyService.class));
    }
});
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bl = new Intent(Main2Activity.this,Voi_Top.class);
                startActivity(bl);
               // startService(new Intent(Main2Activity.this, MyService.class));
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
