package com.example.recyclerviewall.model;

import androidx.annotation.NonNull;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CompanyModel extends BaseObj {
    private String name;
    private List<DeviceModel> devices = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DeviceModel> getDevices() {
        return devices;
    }

    public void setDevices(List<DeviceModel> devices) {
        this.devices = devices;
    }

    public CompanyModel(JSONObject jsonObject) {
        if (jsonObject == null) {
            return;
        }

        this.name = getStringFromJSON("name", jsonObject);
        JSONArray devices = getJSONArrayFromJSON("devices", jsonObject);
        if (devices == null) {
            return;
        }

        for (int i = 0; i < devices.length(); i++) {
            JSONObject device = getJSONObjectInJSONArrayAtIndex(i, devices);
            if (device == null) {
                return;
            }

            DeviceModel deviceModel = new DeviceModel(device);
            this.devices.add(deviceModel);
        }

    }

    @NonNull
    @Override
    public String toString() {
        return "\n\ncompany name: " + this.name +
                "\n" + this.devices.toString();
    }
}
