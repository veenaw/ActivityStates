package com.example.android.activitystates;

/**
 * Created by BITS9 on 12-09-2016.
 */
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends Activity {
    final String TAG = "States";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Second: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Second: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Second: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Second: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Second: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Second: onDestroy()");
    }

}

