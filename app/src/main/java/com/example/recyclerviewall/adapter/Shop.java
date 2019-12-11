package com.example.recyclerviewall.adapter;

import androidx.annotation.NonNull;

public class Shop {
    private String shopId;
    private String shopName;

    public Shop(String shopId, String shopName) {
        this.shopId = shopId;
        this.shopName = shopName;
    }

    public Shop() {
        //no instance
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @NonNull
    @Override
    public String toString() {
        return "Shop{" +
                "shopId='" + shopId + '\'' +
                ", shopName='" + shopName + '\'' +
                '}';
    }
}
