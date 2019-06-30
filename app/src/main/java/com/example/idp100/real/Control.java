package com.example.idp100.real;

import android.app.Fragment;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import app.akexorcist.bluetotohspp.library.*;

import static java.security.AccessController.getContext;

public class Control extends AppCompatActivity {
    ImageView image,image1,image2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);


        MyApplication.getInstance().setupBluetoothConnection();
        MyApplication.getInstance().getCurrentBluetoothConnection();

        image =(ImageView)findViewById(R.id.control);
        image1 =(ImageView)findViewById(R.id.line);
        image2=(ImageView)findViewById(R.id.auto);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cx= new Intent(Control.this,Manual.class);
                startActivity(cx);
            }
        });
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dx= new Intent(Control.this,Music.class);
                startActivity(dx);
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gx= new Intent(Control.this,Auto.class);
                startActivity(gx);
            }
        });

    }
}
