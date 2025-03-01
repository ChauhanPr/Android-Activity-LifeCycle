package com.example.myapplication1;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity_LifeCycle","onCreate invoked");
        Toast.makeText(MainActivity.this,"Created",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity_LifeCycle","onSrart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity_LifeCycle","onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity_LifeCycle","onPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity_LifeCycle","onStop invoked");
    }@Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity_LifeCycle","onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity_LifeCycle","onDestroy invoked");
    }
}
