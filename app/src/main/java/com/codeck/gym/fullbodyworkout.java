package com.codeck.gym;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class fullbodyworkout extends AppCompatActivity {
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    public void openfbwnoequipmentexercises()
    {
        Intent intent=new Intent(this,fbwnoequipment.class);
        startActivity(intent);
    }
    public void openrodactivity()//for rod
    {
        Intent intent=new Intent(this,fbwrod.class);
        startActivity(intent);
    }
    public void openflatbenchactivbity()//for fbench//error
    {
        Intent intent=new Intent(this,errorbench.class);
        startActivity(intent);
    }
    public void openflatbenchactivity()//for abench//error
    {
        Intent intent=new Intent(this,errorbench.class);
        startActivity(intent);
    }

    public void opendumbellsactivity()
    {
        Intent intent=new Intent(this,fbwdumbells.class);//for dumbbells
        startActivity(intent);
    }
    public void openflatbenchandabenchactivity()
    {
        Intent intent=new Intent(this,errorbenchabench.class);//for fbench and a bench//error
        startActivity(intent);
    }
    public void  openrodandabenchactivity()//for rod and abench
    {
        Intent intent=new Intent(this,fbwrodandabench.class);
        startActivity(intent);
    }
    public void openrodandflatbenchactivity()//for rod and flat bench
    {
        Intent intent=new Intent(this,fbwrodandfbench.class);
        startActivity(intent);
    }
    public void opendumbellsandabenchactivity()//for dumbells and abench
    {
        Intent intent=new Intent(this,fbwdumbellsandabench.class);
        startActivity(intent);
    }
    public void opendumbellsandflatbenchactivity()//for dumbells and flatbench
    {
        Intent intent=new Intent(this,fbwdumbellsandfkatbench.class);
        startActivity(intent);
    }
    public void opendumbellsrodactivity()//for dumbells and rod
    {
        Intent intent=new Intent(this,fbwdumbellsandrod.class);
        startActivity(intent);
    }
    public void openrodfbenchabenchactivity()//for rod fbench abench
    {
        Intent intent=new Intent(this,errorbenchabench.class);
        startActivity(intent);
    }
    public void opendumbellsflatbenchadjustablebenchactivity()//for dumbells flatbench and abench//error
    {
        Intent intent=new Intent(this,errorbenchabench.class);
        startActivity(intent);
    }
    public void opendumbellsrodabenchactivity()//for dumbells rod abench
    {
        Intent intent=new Intent(this,fbwdumbellsrodabench.class);
        startActivity(intent);
    }
    public void opendumbellsrodflatbenchactivity()//for dumbells rod fbench
    {
        Intent intent=new Intent(this,fbwdumbellsrodfbench.class);
        startActivity(intent);
    }
    public void opendumbbellsrodflatbenchadjustableactivity()//for dumbells rod fbench abench//error
    {
        Intent intent=new Intent(this,errorbenchabench.class);
        startActivity(intent);
    }
    CheckBox dumbbells,rod,flatbench,adhustablebench;
    Button btn,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullbodyworkout);
        // code for admob starts
        MobileAds.initialize(this, new OnInitializationCompleteListener() {        //for admob
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);// for banner
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        dumbbells=(CheckBox)findViewById(R.id.dumbbells);
        rod=(CheckBox)findViewById(R.id.rod);
        flatbench=(CheckBox)findViewById(R.id.flatbench);
        adhustablebench=(CheckBox)findViewById(R.id.adjustablebench);
        btn=(Button)findViewById(R.id.result);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dumbbells.isChecked()&&rod.isChecked()&&flatbench.isChecked()&&adhustablebench.isChecked())//error
                {
                    opendumbbellsrodflatbenchadjustableactivity();
                }
                //3 at a time
                else   if(dumbbells.isChecked()&&rod.isChecked()&&flatbench.isChecked())
                {
                    opendumbellsrodflatbenchactivity();
                }
                else  if(dumbbells.isChecked()&&rod.isChecked()&&adhustablebench.isChecked())
                {
                    opendumbellsrodabenchactivity();
                }
                else   if(dumbbells.isChecked()&&flatbench.isChecked()&&adhustablebench.isChecked())//error
                {
                    if (mInterstitialAd.isLoaded()
                    ) {

                        mInterstitialAd.show();
                    }
                    opendumbellsflatbenchadjustablebenchactivity();
                }
                else   if(rod.isChecked()&&flatbench.isChecked()&&adhustablebench.isChecked())//error
                {
                    if (mInterstitialAd.isLoaded()
                    ) {

                        mInterstitialAd.show();
                    }
                    openrodfbenchabenchactivity();
                }
                //two at a time cases
                else  if(dumbbells.isChecked()&&rod.isChecked())
                {
                    opendumbellsrodactivity();
                }
                else if(dumbbells.isChecked()&&flatbench.isChecked())
                {
                    opendumbellsandflatbenchactivity();
                }
                else if(dumbbells.isChecked()&&adhustablebench.isChecked())
                {
                    opendumbellsandabenchactivity();
                }
                else if(rod.isChecked()&&flatbench.isChecked())
                {
                    openrodandflatbenchactivity();
                }
                else if(rod.isChecked()&&adhustablebench.isChecked())
                {
                    openrodandabenchactivity();
                }
                else if(flatbench.isChecked()&&adhustablebench.isChecked())
                {
                    if (mInterstitialAd.isLoaded()
                    ) {

                        mInterstitialAd.show();
                    }
                    openflatbenchandabenchactivity();
                }
                //one at a time
                else  if(dumbbells.isChecked())
                {
                    opendumbellsactivity();
                }
                else if(adhustablebench.isChecked())
                {
                    if (mInterstitialAd.isLoaded()
                    ) {

                        mInterstitialAd.show();
                    }
                    openflatbenchactivity();
                }
                else if(flatbench.isChecked())
                { if (mInterstitialAd.isLoaded()
                ) {

                    mInterstitialAd.show();
                }
                    openflatbenchactivbity();
                }
                else  if(rod.isChecked())
                {
                    openrodactivity();
                }
            }
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2745051996532101/9289462854");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        btn2=(Button)findViewById(R.id.fbwnoequipment);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openfbwnoequipmentexercises();
                {

                    mInterstitialAd.show();
                }
            }

        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2745051996532101/9289462854");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }

}
