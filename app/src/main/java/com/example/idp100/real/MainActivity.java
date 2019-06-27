package com.example.idp100.real;

import android.bluetooth.BluetoothClass;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3;
    ImageView img;
    Animation fhelper,fleft,smalltobig;

    String Device_ID="A3:1A:00:C2:05:B5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);
        fleft = AnimationUtils.loadAnimation( this, R.anim.fleft);
        fhelper = AnimationUtils.loadAnimation(this, R.anim.fhelper);

        tv1 = (TextView)findViewById(R.id.logo);
        tv2 = (TextView)findViewById(R.id.subtitle);
        tv3 = (TextView)findViewById(R.id.btn);

        img = (ImageView)findViewById(R.id.splash);

        img.startAnimation(smalltobig);
        tv1.setTranslationX(400);
        tv2.setTranslationX(400);
        tv3.setTranslationX(400);

        tv1.setAlpha(0);
        tv2.setAlpha(0);
        tv3.setAlpha(0);

        tv1.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        tv2.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        tv3.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(900).start();
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ax = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(ax);
                overridePendingTransition(R.anim.fleft,R.anim.fhelper);
                //startService(new Intent(MainActivity.this, MyService.class));



            }
        });

    }
}










