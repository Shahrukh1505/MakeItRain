package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import static android.content.ContentValues.TAG;
import static android.graphics.Canvas.EdgeType.AA;

public class MainActivity extends AppCompatActivity {
private Button makeItRain;
private Button showInfo;
private TextView moneyValue;
private int moneyCounter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeItRain = findViewById(R.id.buttonMakeItRain);
        moneyValue = findViewById(R.id.moneyValue);

      // makeItRain.setOnClickListener(v -> Log.d("MainActivity", "onClick: Make it rain "));


    }
//Second method of adding on clicklistener
    public void showMoney(View view) {


        moneyCounter += 1000;
        moneyValue.setText(String.valueOf(moneyCounter)); //parses from one format to int
if(moneyCounter >= 20000){
    moneyValue.setBackgroundResource(R.color.cool);
    moneyValue.setTextColor(getResources().getColor(R.color.warm));
}
        Log.d("MIR", "onClick: Make it rain" + moneyCounter);
    }
    public void Info(View view){
        Toast.makeText(MainActivity.this, R.string.app_info, Toast.LENGTH_SHORT).show();
    }


}