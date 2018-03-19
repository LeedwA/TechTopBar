package com.example.cwgj.techbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statusbar_white_toolbar);
//        BarUtil.setStatusBarLightMode(this, Color.WHITE);
//        BarUtil.setStatusBarColor(this, ContextCompat.getColor(this, R.color.colorAccent));
    }
}
