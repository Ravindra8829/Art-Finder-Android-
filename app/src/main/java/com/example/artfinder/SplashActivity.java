package com.example.artfinder;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class SplashActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new Step.Builder().setTitle("Welcome to Artfinder")
                .setContent("You will find all what you need")
                .setBackgroundColor(Color.parseColor("#0f3460"))
                .setDrawable(R.drawable.b_1)
                .setSummary("Developed by: Ashish & Ravindra")
                .build());


        addFragment(new Step.Builder().setTitle("Paintings")
                .setContent("Urban, Floral, Abstract, Ready to hand, Photorealistic, ...")
                .setBackgroundColor(Color.parseColor("#0f3460"))
                .setDrawable(R.drawable.b_2)
                .setSummary("Continue to know more about us")
                .build());

        addFragment(new Step.Builder().setTitle("Photography")
                .setContent("Manipulated, Animal, Floral, Portrait...")
                .setBackgroundColor(Color.parseColor("#0f3460"))
                .setDrawable(R.drawable.b_3)
                .setSummary("Buy any painting from any place at any time very easily")
                .build());

        addFragment(new Step.Builder().setTitle("Sculptures")
                .setContent("Animals and Birds, Flowers and Plants...")
                .setBackgroundColor(Color.parseColor("#0f3460"))
                .setDrawable(R.drawable.b_4)
                .setSummary("Trendy paintings for the highest customer service")
                .build());
    }


    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void finishTutorial() {
        super.finishTutorial();

        android.content.Intent intent = new android.content.Intent(SplashActivity.this, StartActivity.class);
        startActivity(intent);
    }
}
