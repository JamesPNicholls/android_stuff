package com.example.not_an_exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    String str_first = null;
    String str_second = null;
    String str_oper = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText _first  =  findViewById(R.id.editTextTextNum1);
        EditText _second =  findViewById(R.id.editTextTextNum2);
        Spinner _oper    =  findViewById((R.id.spinner));
        Button _button   =  findViewById(R.id.button);


        _button.setOnClickListener(view -> {
            str_first = _first.getText().toString();
            str_second = _second.getText().toString();
            str_oper = _oper.getSelectedItem().toString();

            int f;
            int s;
            //checks to see if anything is present
            if(str_first.isEmpty() || str_second.isEmpty()){
                Toast.makeText(getApplicationContext(),"Please enter two numbers",Toast.LENGTH_SHORT).show();
            }
            else{
                try {
                    f = Integer.parseInt(str_first);
                    s = Integer.parseInt(str_second);
                    }
                    catch (NumberFormatException nfe){
                        Toast.makeText(getApplicationContext(),"Please enter numeric values only",Toast.LENGTH_SHORT).show();
                        return;
                    }

                if( (f > 1000) || (f < 0) ){
                    Toast.makeText(getApplicationContext(),"First num not between 0-1000",Toast.LENGTH_SHORT).show();
                }

                else if((s > 1000) || (s < 0)){
                    Toast.makeText(getApplicationContext(),"Second num not between 0-1000",Toast.LENGTH_SHORT).show();
                }
                else if( str_oper.equals("/") && (s == 0)){
                    Toast.makeText(getApplicationContext(),"Cannot devide by 0",Toast.LENGTH_SHORT).show();
                }
                else{
                    // Pass the values out if all conditions pass

                    Intent send = new Intent(getBaseContext(), page2.class);
                    send.putExtra("first", str_first);
                    send.putExtra("second", str_second);
                    send.putExtra("oper", str_oper);
                    startActivity(send);
                }
            }
        });



    }


}