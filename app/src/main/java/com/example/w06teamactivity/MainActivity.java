package com.example.w06teamactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Method to count even Numbers with the Runnable.java
    public void evenNumbers (View view) {
        System.out.println("Executing program...");
        //Creating the Runnable instance
        //Creating the Thread instance
        Runnable r = new Runnable(getApplicationContext());
        runOnUiThread(new Thread(r));
    }

    //Method to count even Numbers with the Runnable2.java
    public void oddNumbers (View view) {
        System.out.println("Executing program...");
        //Creating the Runnable instance
        //Creating the Thread instance
        Runnable2 r = new Runnable2(getApplicationContext());
        runOnUiThread(new Thread(r));
    }
}