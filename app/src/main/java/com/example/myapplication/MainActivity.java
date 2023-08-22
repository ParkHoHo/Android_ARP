package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        EditText ipField1 = findViewById(R.id.ipAddressField1);
        EditText ipField2 = findViewById(R.id.ipAddressField2);
        // String result = processIPAddresses(ipField1.getText().toString(), ipField2.getText().toString());
        // Do something with the result, e.g., display it
        Log.d("Tag","submit");
    }
}