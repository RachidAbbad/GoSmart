package com.rachid_abbad.gosmart.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.rachid_abbad.gosmart.R;
import com.rachid_abbad.gosmart.utils.StaticData;
import com.rachid_abbad.gosmart.utils.WebServiceCnx;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        try {
            StaticData.initStaticData();
            new Timer().schedule(new TimerTask() {

                public void run() {
                    if(WebServiceCnx.isNetworkAvailable()){
                        Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(SplashActivity.this, NoConnectionActivity.class);
                        startActivity(intent);
                    }
                    finish();

                }
            }, 2000);
        }catch (Exception ex){
            //ToDO display exception message here
        }

    }
}