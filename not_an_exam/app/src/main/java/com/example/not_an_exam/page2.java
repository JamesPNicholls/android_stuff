package com.example.not_an_exam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.TextView;
import java.util.Random;
import android.graphics.Color;

import androidx.appcompat.app.ActionBar;


public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Intent get_data = getIntent();
        String first = get_data.getStringExtra("first");
        String second = get_data.getStringExtra("second");
        String oper = get_data.getStringExtra("oper");
        Random rand = new Random();


        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView result =  findViewById(R.id.textView4);

        int value = 0;
        switch (oper){
            case "+"
                value = Integer.parseInt(first) + Integer.parseInt(second);
                break;
            case "-":
                value = Integer.parseInt(first) - Integer.parseInt(second);
                break;
            case "*":
                value = Integer.parseInt(first) * Integer.parseInt(second);
                break;
            case "/":
                value = Integer.parseInt(first) / Integer.parseInt(second);
                break;
        }

        //https://stackoverflow.com/questions/4246351/creating-random-colour-in-java
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        result.setTextColor(Color.rgb(r,g,b));
        result.setText("The result of " + first + " " + oper + " "+ second +" is " + Integer.toString(value));

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}