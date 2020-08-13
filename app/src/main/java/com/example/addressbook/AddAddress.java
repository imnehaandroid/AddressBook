package com.example.addressbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;

public class AddAddress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_address);
       CheckBox checkBox = findViewById(R.id.checkbox_right);
    }
    public void onCheckboxClicked(View view) {


        }

        String create = "token=52e04d83e87e509f07982e6ac851e2d2c67d1d0eabc4fe78&" +
                "address[firstname]=Akshat&" +
                "address[address1]=ABC&" +
                "street&address[city]=Delhi&" +
                "address[country_id]=105&" +
                "address[state_id]=1400&" +
                "address[zipcode]=111111&" +
                "address[phone]=1111111111";


    String delete ="shop-spree.herokuapp.com/api/ams/user/addresses/14?" +
            "token=52e04d83e87e509f07982e6ac851e2d2c67d1d0eabc4fe7";

    String  update = "shop-spree.herokuapp.com/api/ams/user/addresses/13?" +
            "token=52e04d83e87e509f07982e6ac851e2d2c67d1d0eabc4fe78&" +
            "address[first_name]=Akshat&" +
            "address[address1]=DEF street&" +
            "address[city]=Delhi&" +
            "address[country_id]=105&" +
            "address[state_id]=1400&" +
            "address[zipcode]=111111&" +
            "address[phone]=1111111111";
    String get =  "shop-spree.herokuapp.com/api/ams/user/addresses?token=52e04d83e87e509f07982e6ac851e2d2c67d1d0eabc4fe78";


    }


