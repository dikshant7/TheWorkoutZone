package com.codeck.gym;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class dumbbells extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    Button btn,tri,frm,leg,back,abd,shdr,cht;
    public void opendbicepsactivity()
    {
        Intent intent=new Intent(this,dbiceps.class);
        startActivity(intent);
    }
    public void opendtricepsactivity()
    {
        Intent intent=new Intent(this,dtriceps.class);
        startActivity(intent);
    }
    public void opendforearmactivity()
    {
        Intent intent=new Intent(this,dforearm.class);
        startActivity(intent);
    }
    public void opendlegsactivity()
    {
        Intent intent=new Intent(this,dlegs.class);
        startActivity(intent);
    }
    public void opendbackactivity()
    {
        Intent intent=new Intent(this,dback.class);
        startActivity(intent);

    }public void opendabdominalactivity()
    {
        Intent intent=new Intent(this,dabdominal.class);
        startActivity(intent);
    }
    public void opendshoulderactivity()
    {
        Intent intent=new Intent(this,dshoulder.class);
        startActivity(intent);
    }
    public void opendchestactivity()
    {
        Intent intent=new Intent(this,dchest.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumbbells);
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
                if (mInterstitialAd.isLoaded()
                ) {

                    mInterstitialAd.show();
                }
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
                if (mInterstitialAd.isLoaded()
                ) {

                    mInterstitialAd.show();
                }
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
                if (mInterstitialAd.isLoaded()
                ) {

                    mInterstitialAd.show();
                }
            }
        });
        cht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()
                ) {

                    mInterstitialAd.show();
                }

                opendchestactivity();

            }
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2745051996532101/9560925596");//i2
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }

}