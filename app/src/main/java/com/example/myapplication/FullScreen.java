package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class FullScreen extends AppCompatActivity {

    private String data="";
    StringBuilder stringBuilder=new StringBuilder(data);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
        Log.d("FullScreenActivity","onCreate()");
        stringBuilder.append("\nFullScreenActivity.onCreate()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("FullScreenActivity","onStart()");
        stringBuilder.append("\nFullScreenActivity.onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("FullScreenActivity","onResume()");
        stringBuilder.append("\nFullScreenActivity.onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("FullScreenActivity","onPause()");
        stringBuilder.append("\nFullScreenActivity.onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("FullScreenActivity","onRestart()");
        stringBuilder.append("\nFullScreenActivity.onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("FullScreenActivity","onStop()");
        stringBuilder.append("\nFullScreenActivity.onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("FullScreenActivity","onDestroy()");
        stringBuilder.append("\nFullScreenActivity.onDestroy()");
    }
    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    @Override
    public void finish() {
        Log.d("FullScreenActivity","onFinish()");
        stringBuilder.append("\nFullScreenActivity.onFinish()");
        data=stringBuilder.toString();
        setResult(RESULT_OK, new Intent().putExtra("data", stringBuilder.toString()));
        super.finish();
    }
}