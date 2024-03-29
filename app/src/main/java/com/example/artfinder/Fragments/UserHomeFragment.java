package com.example.artfinder.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.artfinder.R;
import com.example.artfinder.Seller.SelectProductCategoryActivity;
import com.example.artfinder.User.SearchProductActivity;
import com.example.artfinder.User.UserProductListActivity;

public class UserHomeFragment extends Fragment implements View.OnClickListener {

    private LinearLayout cardCamera,cardPhone, cardLaptop,cardShoes, cardBooks,cardStationary,cardBeauty,cardHealth,cardMusic,cardToys,cardGaming,cardKitchen;

    Button searchButton,categoriesButton,ordersButton,profileButton;
    private String accessType;
    private Class<?> cls;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_user_home, container, false);

 

        cls = UserProductListActivity.class;
        initCards(view);

        return  view;
    }

    private void initCards(View view) {

        searchButton = view.findViewById(R.id.buttonSearchMain);
        categoriesButton = view.findViewById(R.id.buttonCategory);
        ordersButton = view.findViewById(R.id.buttonOrdersMain);
        profileButton = view.findViewById(R.id.buttonEditProfile);

        cardCamera = view.findViewById(R.id.cardCamera);
        cardPhone = view.findViewById(R.id.cardPhone);
        cardLaptop = view.findViewById(R.id.cardLaptop);
        cardShoes = view.findViewById(R.id.cardShoe);
        cardBooks = view.findViewById(R.id.cardBook);
        cardStationary = view.findViewById(R.id.cardStationary);
        cardBeauty = view.findViewById(R.id.cardBeauty);
        cardHealth = view.findViewById(R.id.cardHealth);
        cardMusic = view.findViewById(R.id.cardMusic);
        cardToys = view.findViewById(R.id.cardToys);
        cardKitchen = view.findViewById(R.id.cardKitchen);
        cardGaming = view.findViewById(R.id.cardGaming);

        searchButton.setOnClickListener(this);
        categoriesButton.setOnClickListener(this);
        ordersButton.setOnClickListener(this);
        profileButton.setOnClickListener(this);

        cardPhone.setOnClickListener(this);
        cardCamera.setOnClickListener(this);
        cardLaptop.setOnClickListener(this);
        cardShoes.setOnClickListener(this);
        cardBooks.setOnClickListener(this);
        cardStationary.setOnClickListener(this);
        cardBeauty.setOnClickListener(this);
        cardHealth.setOnClickListener(this);
        cardMusic.setOnClickListener(this);
        cardToys.setOnClickListener(this);
        cardGaming.setOnClickListener(this);
        cardKitchen.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {


        switch (view.getId()){
            case R.id.cardCamera:
                startActivity(new Intent(getContext(), cls)
                        .putExtra("category","Painting"));
                break;
            case R.id.cardPhone:
                startActivity(new Intent(getContext(),cls)
                        .putExtra("category","Sculpture"));
                break;
            case R.id.cardLaptop:
                startActivity(new Intent(getContext(), cls)
                        .putExtra("category","Drawing"));
                break;
            case R.id.cardShoe:
                startActivity(new Intent(getContext(), cls)
                        .putExtra("category","Photography"));
                break;
            case R.id.cardBook:

                startActivity(new Intent(getContext(), cls)
                        .putExtra("category","Digital Art"));
                break;
            case R.id.cardStationary:
                startActivity(new Intent(getContext(), cls)
                        .putExtra("category","Printmaking"));
                break;
            case R.id.cardBeauty:
                startActivity(new Intent(getContext(), cls)
                        .putExtra("category","Abstract"));
                break;
            case R.id.cardHealth:
                startActivity(new Intent(getContext(), cls)
                        .putExtra("category","Nudes"));
                break;
            case R.id.cardMusic:
                startActivity(new Intent(getContext(), cls)
                        .putExtra("category","Animals"));
                break;
            case R.id.cardToys:
                startActivity(new Intent(getContext(), cls)
                        .putExtra("category","Architecture"));
                break;
            case R.id.cardGaming:
                startActivity(new Intent(getContext(), cls)
                        .putExtra("category","Cityscapes"));
                break;
            case R.id.cardKitchen:
                startActivity(new Intent(getContext(), cls)
                        .putExtra("category","Sea and Sky"));
                break;

            case R.id.buttonSearchMain:
                startActivity(new Intent(getContext(), SearchProductActivity.class));
                break;

            case R.id.buttonCategory:
                startActivity(new Intent(getContext(), SelectProductCategoryActivity.class));
                break;

            case R.id.buttonOrdersMain:
                getActivity().getSupportFragmentManager()
                        .beginTransaction().replace(R.id.fragment_container,new OrdersFragment()).commit();


                break;

            case R.id.buttonEditProfile:
                getActivity().getSupportFragmentManager()
                        .beginTransaction().replace(R.id.fragment_container,new ModelProfileFragment()).commit();


                break;





        }
    }
}