package com.example.lab2survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.RadioGroup;
import android.util.Log;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;

import java.util.Locale;

public class page3 extends AppCompatActivity {

    RadioGroup radio_group;
    TextView country_sub, age_range_sub, travel_rating_sub;
    TextView travel_sub_1;
    TextView travel_sub_2;
    TextView travel_sub_3;
    TextView travel_sub_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        country_sub       = findViewById(R.id.country_sub);
        age_range_sub     = findViewById(R.id.age_range_sub);
        travel_rating_sub = findViewById(R.id.travel_rating_sub);
        travel_sub_1      = findViewById(R.id.most_recent_travel_purp_sub1);
        travel_sub_2      = findViewById(R.id.most_recent_travel_purp_sub2);
        travel_sub_3      = findViewById(R.id.most_recent_travel_purp_sub3);
        travel_sub_4      = findViewById(R.id.most_recent_travel_purp_sub4);

        Intent get_data  = getIntent();
        String nation    = get_data.getStringExtra("nat");
        String age_range = get_data.getStringExtra("age_r");
        String rating    = get_data.getStringExtra("rat");
        String travel_sub_1_str = get_data.getStringExtra("check_box_1");
        String travel_sub_2_str = get_data.getStringExtra("check_box_2");
        String travel_sub_3_str = get_data.getStringExtra("check_box_3");
        String travel_sub_4_str = get_data.getStringExtra("check_box_4");

        country_sub.setText(nation);
        age_range_sub.setText(age_range);
        travel_sub_1.setText(travel_sub_1_str);
        travel_sub_2.setText(travel_sub_2_str);
        travel_sub_3.setText(travel_sub_3_str);
        travel_sub_4.setText(travel_sub_4_str);
        travel_rating_sub.setText(rating);
    }


}

