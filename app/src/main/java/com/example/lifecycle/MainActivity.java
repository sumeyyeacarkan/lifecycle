package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("mesaj","create");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("mesaj","start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("mesaj","stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("mesaj","destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("mesaj","pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("mesaj","resume");
    }
}
