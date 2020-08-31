package com.example.addressbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Intent;
import android.location.Address;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Switch;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String EXTRA_ADDRESS = "addressToEdit";
    private static final int REQUEST_UPDATE_ADDRESS = 2;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_address_list);

        FloatingActionButton fab = findViewById(R.id.fab_add_address);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AddAddress.class);
                startActivity(intent);
            }
        });
        List<AddressListData> list = new ArrayList<>();


        AddressAdapter adapter = new AddressAdapter(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
    private void  popupMenuShow (View view, final Address address){
        PopupMenu popupMenu = new PopupMenu(this,view);
        popupMenu.inflate(R.menu.menu_address);
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case  R.id.edit_address:
                        editAddress(address);
                    return true;
                    case R.id.delete_address:
                        deleteAddress(address);
                    return true;
                    default:
                        return false;

                }
            }
        });
    }
    private void editAddress(Address address){

        Intent intent = new Intent (MainActivity.this,AddAddress.class);
        intent.putExtra(EXTRA_ADDRESS, address);
        startActivityForResult(intent, REQUEST_UPDATE_ADDRESS);
    }

    private void deleteAddress(Address address) {

    }
}
