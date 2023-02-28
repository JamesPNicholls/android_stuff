package com.example.lab2survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RatingBar;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        RatingBar rating_bar = findViewById(R.id.ratingBar);
        Button next_button   = findViewById(R.id.button_p2);
        CheckBox check_box_1 = findViewById(R.id.checkBox1);
        CheckBox check_box_2 = findViewById(R.id.checkBox2);
        CheckBox check_box_3 = findViewById(R.id.checkBox3);
        CheckBox check_box_4 = findViewById(R.id.checkBox4);
        CheckBox check_box_5 = findViewById(R.id.checkBox5);

        next_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String rating = String.valueOf(rating_bar.getRating());

                String check_box_1_str = null;
                String check_box_2_str = null;
                String check_box_3_str = null;
                String check_box_4_str = null;
                String check_box_5_str = null;

                Intent i = new Intent(getBaseContext(), page3.class);

                if(check_box_1.isChecked()){
                    check_box_1_str = "Business";
                    i.putExtra("check_box_1", check_box_1_str);
                }
                if(check_box_2.isChecked()){
                    check_box_2_str = "Relaxation";
                    i.putExtra("check_box_2", check_box_2_str);
                }
                if(check_box_3.isChecked()){
                    check_box_3_str = "Medical Reasons";
                    i.putExtra("check_box_3", check_box_3_str);
                }
                if(check_box_4.isChecked()){
                    check_box_4_str = "Family Reunification";
                    i.putExtra("check_box_4", check_box_4_str);
                }
                if(check_box_5.isChecked()){
                    check_box_5_str = "Other";
                    i.putExtra("check_box_5", check_box_5_str);
                }

                Intent get_data  = getIntent();
                String nat   = get_data.getStringExtra("nat");
                String age_r = get_data.getStringExtra("age_r");

                i.putExtra("nat", nat);
                i.putExtra("age_r", age_r);
                i.putExtra("rat", rating);

                startActivity(i);
            }
        });
    }

}