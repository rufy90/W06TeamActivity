package com.example.w06teamactivity;

import android.content.Context;
import android.widget.Toast;
import java.lang.ref.WeakReference;

public class Runnable2 implements java.lang.Runnable {
    private WeakReference<Context> contextRef;

    public Runnable2(Context context) {
        this.contextRef = new WeakReference<Context>(context);
    }

    @Override
    public void run() {
        try {
            final Context context = contextRef.get();
            if (context != null) {
                //Creating the loop to count the odd numbers
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + "\twith Runnable2: Counting odds... " + i);
                        //Setting the pause to simulate the contact with the server
                        Thread.sleep(250);
                    }
                }
                Toast.makeText(context, "Evens counting is finished!", Toast.LENGTH_SHORT).show();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
