package com.example.idp100.real;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Voi_Top extends AppCompatActivity {

    ImageView img,img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voi__top);
        img=(ImageView)findViewById(R.id.voi);
        img1=(ImageView)findViewById(R.id.tb);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blue = new Intent(Voi_Top.this,Voice.class);
                startActivity(blue);
            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(Voi_Top.this,Talkback.class);
                startActivity(b);
            }
        });
    }
}
