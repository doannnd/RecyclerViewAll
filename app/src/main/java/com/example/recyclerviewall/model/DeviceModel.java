package com.example.recyclerviewall.model;

import androidx.annotation.NonNull;

import org.json.JSONObject;

public class DeviceModel extends BaseObj{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceModel(JSONObject jsonObject) {
        if (jsonObject != null) {
            this.name = getStringFromJSON("name", jsonObject);
        }

    }

    @NonNull
    @Override
    public String toString() {
        return "\ndevice name: " + this.name;
    }
}
