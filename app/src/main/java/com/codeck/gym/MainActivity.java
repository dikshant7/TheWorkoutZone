package com.codeck.gym;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class MainActivity extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private AdView mAdView;
    //dfb=dumbellandflatbench
    //abd=abenchandDumbell
    //dfbr=dumbellFlatbenchRod
    //dabr=dumbellAbenchRod
    //dr=dumbellandrod

    public void  openbeginneractivity()//for beginner.java
    {
        Intent intent=new Intent(this,begineer.class);
        startActivity(intent);
    }
    public void openfullbodyworkout()//for fbw
    {
        Intent intent = new Intent(this, fullbodyworkout.class);
        startActivity(intent);
    }
    public void openwarmupactivity()//for warmup exercise
    {
        Intent intent=new Intent(this,warmupexercises.class);
        startActivity(intent);
    }
    Button btn,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {        //for admob
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);// for banner
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        btn = (Button) findViewById(R.id.bg);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbeginneractivity();
            }

        });
        // code for interstial add

        //code for fbd starts
        btn2=(Button)findViewById(R.id.it);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfullbodyworkout();
            }
        });
        //for warm up starts
        btn3=(Button)findViewById(R.id.ad);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwarmupactivity();
                if (mInterstitialAd.isLoaded()
                ) {

                    mInterstitialAd.show();
                }
            }
        });
mInterstitialAd = new InterstitialAd(this);
mInterstitialAd.setAdUnitId("ca-app-pub-2745051996532101/9752497286");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);


    }

}
