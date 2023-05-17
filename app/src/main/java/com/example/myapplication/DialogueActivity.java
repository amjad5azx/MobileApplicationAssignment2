package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DialogueActivity extends AppCompatActivity {

    private Button okButton,cancelButton ;

    private String data="";
    StringBuilder stringBuilder=new StringBuilder(data);

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue);
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);

        okButton = findViewById(R.id.exitButton);
        cancelButton = findViewById(R.id.continueButton);

        AlertDialog exitDialog = dialogBuilder.create();

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Log.d("DialogActivity","onCreate()");
        stringBuilder.append("\nDialogActivity.onCreate()");
        System.out.println("ST:"+stringBuilder.toString());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("DialogActivity","onStart()");
        stringBuilder.append("\nDialogActivity.onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DialogActivity","onResume()");
        stringBuilder.append("\nDialogActivity.onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("DialogActivity","onPause()");
        stringBuilder.append("\nDialogActivity.onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("DialogActivity","onRestart()");
        stringBuilder.append("\nDialogActivity.onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("DialogActivity","onStop()");
        stringBuilder.append("\nDialogActivity.onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("DialogActivity","onDestroy()");
        stringBuilder.append("\nDialogActivity.onDestroy()");
    }
    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    @Override
    public void finish() {
        Log.d("DialogActivity","onFinish()");
        stringBuilder.append("\nDialogActivity.onFinish()");
        data=stringBuilder.toString();
        setResult(RESULT_OK, new Intent().putExtra("data", stringBuilder.toString()));
        super.finish();
    }
}