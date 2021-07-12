package com.codeck.gym;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class dumbbellsandabenchandrod extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    Button btn,tri,frm,leg,back,abd,shdr,cht;
    public void opendbicepsactivity()
    {
        Intent intent=new Intent(this,dabrbiceps.class);
        startActivity(intent);
    }
    public void opendtricepsactivity()
    {
        Intent intent=new Intent(this,dabrtriceps.class);
        startActivity(intent);
    }
    public void opendforearmactivity()
    {
        Intent intent=new Intent(this,dabrforearms.class);
        startActivity(intent);
    }
    public void opendlegsactivity()
    {
        Intent intent=new Intent(this,dabrlegs.class);
        startActivity(intent);
    }
    public void opendbackactivity()
    {
        Intent intent=new Intent(this,dabrback.class);
        startActivity(intent);

    }public void opendabdominalactivity()
    {
        Intent intent=new Intent(this,dabrabdominals.class);
        startActivity(intent);
    }
    public void opendshoulderactivity()
    {
        Intent intent=new Intent(this,dabrshoulders.class);
        startActivity(intent);
    }
    public void opendchestactivity()
    {
        Intent intent=new Intent(this,dabrchest.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumbbellsandabenchandrod);
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
                if (mInterstitialAd.isLoaded()
                ) {

                    mInterstitialAd.show();
                }
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
        mInterstitialAd.setAdUnitId("ca-app-pub-2745051996532101/2612373860");//i7
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }
}