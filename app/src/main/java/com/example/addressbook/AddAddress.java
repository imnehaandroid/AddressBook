package com.example.addressbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.Toast;

public class AddAddress extends AppCompatActivity {
    EditText editName,editAddress1,editAddress2,editLandmark,editCity,editState,editPincode;
    ImageButton submitIb;

    private static final String EXTRA_ADDRESS = "addressToEdit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_address);
       CheckBox checkBox = findViewById(R.id.checkbox_right);
       editName=findViewById(R.id.eName);
       editAddress1=findViewById(R.id.eAddress1);
       editAddress2=findViewById(R.id.eAddress2);
       editLandmark=findViewById(R.id.eLandmark);
       editCity=findViewById(R.id.eCity);
       editState=findViewById(R.id.eState);
       editPincode=findViewById(R.id.ePincode);
       submitIb=findViewById(R.id.subImageButton);


       submitIb.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(editName.getText().toString().isEmpty() || editAddress1.getText().toString().isEmpty()||
                  editAddress2.getText().toString().isEmpty()||editLandmark.getText().toString().isEmpty()||
                  editCity.getText().toString().isEmpty()||editState.getText().toString().isEmpty()||editPincode.getText().toString().isEmpty()){
                   Toast.makeText(AddAddress.this, "Please Fill the all Fields", Toast.LENGTH_SHORT).show();
                   return;


           }

               else {

               }
           }
       });




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


