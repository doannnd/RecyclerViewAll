package com.example.recyclerviewall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewall.R;

import butterknife.ButterKnife;

public class ShopAdapter extends BaseRecyclerViewAdapter<Shop> {

    @Override
    public Shop addNewItem() {
        return new Shop();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        if (viewType == SEARCH) {
            //View view = layoutInflater.inflate(R.layout.item_search, parent, false);
            //return new ShopViewHolder(view);
        }
        return super.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ShopViewHolder) {
            Shop shop = data.get(position);
            ShopViewHolder shopViewHolder = (ShopViewHolder) holder;
            shopViewHolder.bind(shop);
        }
    }

    public class ShopViewHolder extends RecyclerView.ViewHolder {

        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bind(Shop shop) {
            if (shop != null) {

            }
        }
    }
}
