package com.example.myfirstapp;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

import com.intrusoft.library.FrissonView;

import io.supercharge.shimmerlayout.ShimmerLayout;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);



        ShimmerLayout shimmerText = (ShimmerLayout) findViewById(R.id.shimmer_text);
        shimmerText.startShimmerAnimation();
        ShimmerLayout shimmerText1 = (ShimmerLayout) findViewById(R.id.shimmer_text1);
        shimmerText1.startShimmerAnimation();
        ShimmerLayout shimmerText2 = (ShimmerLayout) findViewById(R.id.shimmer_text2);
        shimmerText2.startShimmerAnimation();
        ShimmerLayout shimmerText3 = (ShimmerLayout) findViewById(R.id.shimmer_text3);
        shimmerText3.startShimmerAnimation();
        ShimmerLayout shimmerText4 = (ShimmerLayout) findViewById(R.id.shimmer_text4);
        shimmerText4.startShimmerAnimation();
        // Get the Intent that started this activity and extract the string
        Bundle b = getIntent().getExtras();
        TextView Name = (TextView) findViewById(R.id.textView);
        TextView DOB= (TextView) findViewById(R.id.textView1);
        TextView Mobile = (TextView) findViewById(R.id.textView2);
        TextView Email = (TextView) findViewById(R.id.textView3);
        TextView Address = (TextView) findViewById(R.id.textView4);


        Name.setText(b.getCharSequence("Name"));
        DOB.setText(b.getCharSequence("DOB"));
        Mobile.setText(b.getCharSequence("Mobile Number"));
        Email.setText(b.getCharSequence("E-mail"));
        Address.setText(b.getCharSequence("Address"));
    }
}
