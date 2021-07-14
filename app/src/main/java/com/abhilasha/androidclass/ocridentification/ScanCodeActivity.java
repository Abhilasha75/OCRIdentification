package com.abhilasha.androidclass.ocridentification;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import com.google.zxing.Result;

public class ScanCodeActivity extends AppCompatActivity {

   // ZXingScannerView ScannerView;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // ScannerView = new ZXingScannerView(this);
       // setContentView(ScannerView);
    }
//
//    @Override
//    public void handleResult (Result result) {
//
//        MainActivity.scanResult.setText(result.getText());
//        onBackPressed();
//
//    }
//
//    @Override
//    protected void onPause () {
//        super.onPause();
//        ScannerView.stopCamera();
//    }
//
//    @Override
//    protected void onResume () {
//        super.onResume();
//        ScannerView.setResultHandler(this);
//        ScannerView.stopCamera();
//    }
}