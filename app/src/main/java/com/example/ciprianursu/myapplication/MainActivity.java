package com.example.ciprianursu.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    private static boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if(flag) {
            startActivity(new Intent(this, SafeActivity.class));
            flag = false;
        } else {
            flag = true;
        }
    }
}
