package com.example.artfinder.Admin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.artfinder.Fragments.AdminHomeFragment;
import com.example.artfinder.Fragments.AdminVerifyProductsFragment;
import com.example.artfinder.Fragments.AdminViewSellersFragment;
import com.example.artfinder.Fragments.AdminViewUsersFragment;
import com.example.artfinder.Fragments.OrdersFragment;
import com.example.artfinder.R;
import com.example.artfinder.StartActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class AdminPanelActivity extends AppCompatActivity {


    private final String TAG ="theartist";
    DatabaseReference mRootRef;
    FirebaseAuth mAuth;

    private BottomNavigationView bottomNavigationView;
    private Fragment selectorFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panel);


        Button b = findViewById(R.id.nav_logout);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(AdminPanelActivity.this, StartActivity.class);
                startActivity(intent);
                finish();
            }
        });

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new AdminHomeFragment()).commit();
        }

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        selectorFragment = new AdminHomeFragment();
                        break;
                    case R.id.nav_order:
                        selectorFragment = new OrdersFragment();
                        break;
                    case R.id.nav_product:
                        selectorFragment = new AdminVerifyProductsFragment();
                        break;
                    case R.id.nav_seller:
                       selectorFragment = new AdminViewSellersFragment();
                        break;
                    case R.id.nav_user:
                        selectorFragment = new AdminViewUsersFragment();
                        break;

                }
                if (selectorFragment !=null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectorFragment).commit();
                }
                return true;
            }
        });

    }
}

