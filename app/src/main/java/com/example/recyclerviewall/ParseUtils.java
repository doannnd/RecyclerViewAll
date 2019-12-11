package com.example.recyclerviewall;

import com.example.recyclerviewall.model.BaseObj;
import com.example.recyclerviewall.model.MainContentModel;

import org.json.JSONException;
import org.json.JSONObject;

public class ParseUtils extends BaseObj {

    public static MainContentModel parseMainContenModel(String json) {
        MainContentModel mainContentModel = null;
        try {
            mainContentModel = new MainContentModel(new JSONObject(json));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return mainContentModel;
    }


}
