package com.example.addressbook;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AddressAdapter extends RecyclerView.Adapter<AddressAdapter.AddressAdapterViewHolder> {

    private List<AddressListData> list;

    AddressAdapter(List<AddressListData> addressList) {
        list = addressList;
    }

    @NonNull
    @Override
    public AddressAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_address_layout, parent, false);
        return new AddressAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AddressAdapterViewHolder holder, int position) {
        AddressListData item = list.get(position);

        holder.addressTv1.setText(item.getAddress1());
        holder.addressTv2.setText(item.getAddress2());
        holder.addressTv3.setText(item.getAddress3());


        holder.addressMenuIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        holder.addressCheckIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class AddressAdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView addressTv1, addressTv2, addressTv3;
        private ImageView addressMenuIv,addressCheckIv;

        public AddressAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            addressTv1 = itemView.findViewById(R.id.tv_address_1);
            addressTv2 = itemView.findViewById(R.id.tv_address_2);
            addressTv3 = itemView.findViewById(R.id.tv_address_3);
            addressMenuIv = itemView.findViewById(R.id.iv_menu);
            addressCheckIv =itemView.findViewById(R.id.iv_check);


        }
    }
}
