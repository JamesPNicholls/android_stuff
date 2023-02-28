package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    boolean toggle = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void BtnToggleClick(View view){
        TextView message = findViewById(R.id.TextView);
        if(toggle){
            message.setText(message.getText().toString().toUpperCase(Locale.ROOT));
        }
        else{
            message.setText(message.getText().toString().toLowerCase(Locale.ROOT));
        }
        toggle = !toggle;
    }

}