package com.codeck.gym;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class rodandflatbench extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    Button btn,tri,frm,leg,back,abd,shdr,cht;
    public void opendbicepsactivity()
    {
        Intent intent=new Intent(this,rfbbiceps.class);
        startActivity(intent);
    }
    public void opendtricepsactivity()
    {
        Intent intent=new Intent(this,rfbtriceps.class);
        startActivity(intent);
    }
    public void opendforearmactivity()
    {
        Intent intent=new Intent(this,rfbforearms.class);
        startActivity(intent);
    }
    public void opendlegsactivity()
    {
        Intent intent=new Intent(this,rfblegs.class);
        startActivity(intent);
    }
    public void opendbackactivity()
    {
        Intent intent=new Intent(this,rfbback.class);
        startActivity(intent);

    }public void opendabdominalactivity()
    {
        Intent intent=new Intent(this,rfbabdomials.class);
        startActivity(intent);
    }
    public void opendshoulderactivity()
    {
        Intent intent=new Intent(this,rfbshoulders.class);
        startActivity(intent);
    }
    public void opendchestactivity()
    {
        Intent intent=new Intent(this,rfbchest.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rodandflatbench);
        btn=(Button)findViewById(R.id.Biceps);
        tri=(Button)findViewById(R.id.Triceps) ;
        frm=(Button)findViewById(R.id.Forearms);
        leg=(Button)findViewById(R.id.Legs);
        back=(Button)findViewById(R.id.Back);
        abd=(Button)findViewById(R.id.Abdominal);
        shdr=(Button)findViewById(R.id.Shoulders);
        cht =(Button)findViewById(R.id.Chest);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendbicepsactivity();
                if (mInterstitialAd.isLoaded()
                ) {

                    mInterstitialAd.show();
                }
            }
        });
        tri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendtricepsactivity();
            }
        });
        frm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendforearmactivity();
                if (mInterstitialAd.isLoaded()
                ) {

                    mInterstitialAd.show();
                }
            }
        });
        leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendlegsactivity();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendbackactivity();
            }
        });
        abd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendabdominalactivity();
                if (mInterstitialAd.isLoaded()
                ) {

                    mInterstitialAd.show();
                }
            }
        });
        shdr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendshoulderactivity();
            }
        });
        cht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendchestactivity();
            }
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2745051996532101/3968514106");//i9
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }
}