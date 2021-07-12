package com.codeck.gym;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class abenchandrod extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    Button btn,tri,frm,leg,back,abd,shdr,cht;
    public void opendbicepsactivity()
    {
        Intent intent=new Intent(this,rabbiceps.class);
        startActivity(intent);
    }
    public void opendtricepsactivity()
    {
        Intent intent=new Intent(this,rabtriceps.class);
        startActivity(intent);
    }
    public void opendforearmactivity()
    {
        Intent intent=new Intent(this,rabforearms.class);
        startActivity(intent);
    }
    public void opendlegsactivity()
    {
        Intent intent=new Intent(this,rablegs.class);
        startActivity(intent);
    }
    public void opendbackactivity()
    {
        Intent intent=new Intent(this,rabback.class);
        startActivity(intent);

    }public void opendabdominalactivity()
    {
        Intent intent=new Intent(this,rababdomials.class);
        startActivity(intent);
    }
    public void opendshoulderactivity()
    {
        Intent intent=new Intent(this,rabshoulders.class);
        startActivity(intent);
    }
    public void opendchestactivity()
    {
        Intent intent=new Intent(this,rabchest.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abenchandrod);
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
                if (mInterstitialAd.isLoaded()
                ) {

                    mInterstitialAd.show();
                }
            }
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2745051996532101/2915626198");//i10
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }
}