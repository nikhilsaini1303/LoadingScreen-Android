package com.example.create_loading_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button btn = (Button) findViewById(R.id.button);
         LoadingAlert loadingAlert = new LoadingAlert(MainActivity.this);

//         Button btn2 = (Button) findViewById(R.id.button2);

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 loadingAlert.startAlertDialog();
             }
         });

//         btn2.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View view) {
//                 loadingAlert.closeAlertDialog();
//             }
//         });
    }
}