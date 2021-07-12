package com.codeck.gym;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class begineer extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    private AdView mAdView;
    Button btn1;
    public void openabenchanddumbbellsacitvity()//for abench and dumbbells
    {
        Intent intent=new Intent(this,abenchanddumbell.class);
        startActivity(intent);
    }
    public void openabenchandrodacitvity()//for abench and rod
    {
        Intent intent=new Intent(this,abenchandrod.class);
        startActivity(intent);
    }
    public void openabenchandbenchactivity()//for abench and bench//show error
    {
        Intent intent=new Intent(this,errorbenchabench.class);
        startActivity(intent);
    }
    public void openabenchandrodandbenchactivity()//for abench rod bench//show error
    {
        Intent intent =new Intent(this,errorbenchabench.class);
        startActivity(intent);
    }
    public void opendumbbellsandabenchandrodactivity()//for dumbbells abench and rod
    {
        Intent intent =new Intent(this,dumbbellsandabenchandrod.class);
        startActivity(intent);
    }
    public void opendumbbelsandbenchandabenchactivity()//for dumbbells bench and a bench//show error
    {
        Intent intnet =new Intent(this,errorbenchabench.class);
        startActivity(intnet);
    }
    public void opendumbbellsandbenchandrodandabenchactivity()//for dumbbells rod bench and abench//show error
    {
        Intent intent=new Intent(this,errorbenchabench.class);//

        startActivity(intent);
    }
    public void  opendumbbellsactivity()//for only dumbells
    {
        Intent intent=new Intent(this,dumbbells.class);
        startActivity(intent);
    }
    public void openrodactivity()//for only rod
    {Intent intent=new Intent(this,rod.class);
        startActivity(intent);
    }
    public void openbenchactivity()//for bench only
    {
        Intent intent=new Intent(this,errorbench.class);
        startActivity(intent);
    }
    public void openabenchactivity()//for abench only
    {
        Intent intent=new Intent(this, errorbench.class);
        startActivity(intent);
    }
    public void opendumbbellsandrodactivity()//for dumbbells and rod
    {
        Intent intent=new Intent(this,dumbbellandrods.class);
        startActivity(intent);

    }
    public void opendumbbellsandbenchactivity()//for dumbbells and bench
    {
        Intent intent =new Intent(this,dumbbellsandflatbench.class);
        startActivity(intent);

    }
    public void openrodandbenchactivity()//for rod and bench
    {
        Intent intnet =new Intent(this,rodandflatbench.class);
        startActivity(intnet);
    }
    public void opendumbbellsandrodandbenchactivuty()//for dumbbells , rod and bench
    {
        Intent intent=new Intent(this,dumbellrodflatbench.class);
        startActivity(intent);
    }
    public void opennoEquipmentactivity()
    {
        Intent intent =new Intent(this,noequipment.class);
        startActivity(intent);
    }
    CheckBox dumbbells,rod,bench,abench;
    RadioButton noequipment;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begineer);
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
        bench=(CheckBox)findViewById(R.id.bench);
        btn=(Button)findViewById(R.id.showresult);
        abench=(CheckBox)findViewById(R.id.abench);
        btn1=(Button)findViewById(R.id.noequipment);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennoEquipmentactivity();
            }
        });
//code for checkbox starts
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dumbbells.isChecked()&&bench.isChecked()&&rod.isChecked()&&abench.isChecked())
                {
                    if (mInterstitialAd.isLoaded()
                    ) {

                        mInterstitialAd.show();
                    }
                    opendumbbellsandbenchandrodandabenchactivity();//error
                }
                else  if(dumbbells.isChecked()&&bench.isChecked()&&abench.isChecked())
                {
                    if (mInterstitialAd.isLoaded()
                    ) {

                        mInterstitialAd.show();
                    }
                    opendumbbelsandbenchandabenchactivity();//error
                }
                else if(dumbbells.isChecked()&&abench.isChecked()&&rod.isChecked())
                {
                    opendumbbellsandabenchandrodactivity();
                }

                else if(abench.isChecked()&&bench.isChecked()&&rod.isChecked())
                {
                    if (mInterstitialAd.isLoaded()
                    ) {

                        mInterstitialAd.show();
                    }
                    openabenchandrodandbenchactivity();//error
                }
                else if(dumbbells.isChecked()&&bench.isChecked()&&rod.isChecked())
                {
                    opendumbbellsandrodandbenchactivuty();
                }
                else if(abench.isChecked()&&bench.isChecked())
                {
                    if (mInterstitialAd.isLoaded()
                    ) {

                        mInterstitialAd.show();
                    }
                    openabenchandbenchactivity();

                }
                else if(abench.isChecked()&&rod.isChecked())
                {
                    openabenchandrodacitvity();
                }
                else if(abench.isChecked()&&dumbbells.isChecked())
                {
                    openabenchanddumbbellsacitvity();
                }
                else  if(rod.isChecked()&&bench.isChecked())
                {
                    openrodandbenchactivity();
                }
                else if(dumbbells.isChecked()&&bench.isChecked())
                {
                    opendumbbellsandbenchactivity();
                }
                else if(dumbbells.isChecked()&&rod.isChecked())
                {
                    opendumbbellsandrodactivity();
                }

                else  if(dumbbells.isChecked())
                {
                    opendumbbellsactivity();

                }
                else if(rod.isChecked())
                {
                    openrodactivity();
                }
                else if(bench.isChecked())
                {
                    if (mInterstitialAd.isLoaded()
                    ) {

                        mInterstitialAd.show();
                    }
                    openbenchactivity();
                }
                else if(abench.isChecked())
                {
                    if (mInterstitialAd.isLoaded()
                    ) {

                        mInterstitialAd.show();
                    }
                    openabenchactivity();
                }



            }

        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2745051996532101/1342350766");//i11
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        //code for checkbox ends
    }
}
