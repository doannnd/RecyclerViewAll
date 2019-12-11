package com.example.recyclerviewall;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HelloGson extends AppCompatActivity {

    private static final String TAG = "HelloGson";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            InputStream is = getAssets().open("test.json");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            synchronized (this) {
                Gson gson = new GsonBuilder().serializeNulls().create();
                MainModel mainModel = gson.fromJson(reader, MainModel.class);
                Log.e(TAG, "mainModel: " + mainModel.getCode());
                Log.e(TAG, "mainModel: " + mainModel.getTitle());
                Log.e(TAG, "mainModel: " + mainModel.getText());
                Log.e(TAG, "mainModel: " + mainModel.isCheck());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
