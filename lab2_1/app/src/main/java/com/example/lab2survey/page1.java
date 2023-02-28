package com.example.lab2survey;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        RadioGroup radio_group  = (RadioGroup) findViewById(R.id.radioGroup);
        Button button_submit    = (Button) findViewById(R.id.button_p1);
        Spinner spinner_nation  = (Spinner) findViewById(R.id.coutnry_spinner);

        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nation_str = spinner_nation.getSelectedItem().toString();
                String box_id = null;

                int checked_box = radio_group.getCheckedRadioButtonId();
                switch(checked_box){
                    case R.id._under18:
                        box_id = "Under 18";
                        break;
                    case R.id._18to30:
                        box_id = "18 to 30";
                        break;
                    case R.id._31to50:
                        box_id = "31 to 50";
                        break;
                    case R.id._51to65:
                        box_id = "51 to 65";
                        break;
                    case R.id._over65:
                        box_id = "Over 65";
                        break;
                    default:
                        box_id = "nope";
                }
                Intent send_data = new Intent(getBaseContext(), page2.class);

                send_data.putExtra("nat",   nation_str);
                send_data.putExtra("age_r", box_id);
                startActivity(send_data);
            }
        });

    }


}