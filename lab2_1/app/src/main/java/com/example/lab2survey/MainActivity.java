package com.example.lab2survey;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    String entry = "";
    String password = "COMP1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText main_edit = (EditText) findViewById(R.id.main_edit);
        Button button_submit = (Button) findViewById(R.id.button_mp);

        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entry = main_edit.getText().toString();
                if(entry.equals(password)){
                    go_to_page1(v);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Incorrect",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void go_to_page1(View view){
            Intent intent_page1 = new Intent(this, page1.class);
            startActivity(intent_page1);

    }

}
