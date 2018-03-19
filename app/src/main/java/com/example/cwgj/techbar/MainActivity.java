package com.example.cwgj.techbar;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.example.cwgj.library.Sofia;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statusbar_white_toolbar);
        Sofia.with(this)
                .statusBarDarkFont()
                .statusBarBackground(ContextCompat.getColor(this, R.color.white));
    }
}
