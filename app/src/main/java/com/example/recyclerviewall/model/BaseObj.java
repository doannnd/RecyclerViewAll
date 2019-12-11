package com.example.recyclerviewall.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONObject;

public class BaseObj {

    public static JSONObject getJSONObjectFromJSON(String key, JSONObject object){
        JSONObject result = null;
        try{
            if (object.has(key) && !object.isNull(key)){
                Object tmpObject = object.get(key);
                if (tmpObject instanceof JSONObject){
                    result = (JSONObject) tmpObject;
                }
            }
        }
        catch (Exception e){
            //Utils.error(e.getMessage());
        }
        return result;
    }

    public static JSONArray getJSONArrayFromJSON(String key, JSONObject object){
        JSONArray result = null;
        try{
            if (object.has(key) && !object.isNull(key)){
                result = object.getJSONArray(key);
            }
        }
        catch (Exception e){
            //Utils.error(e.getMessage());
        }
        return result;
    }

    public static JSONObject getJSONObjectInJSONArrayAtIndex(int index, JSONArray array){
        JSONObject result = null;
        try{
            result = array.getJSONObject(index);
        }
        catch (Exception e){
            //Utils.error(e.getMessage());
        }
        return result;
    }

    public static int getIntFromJSON(String key, JSONObject object){
        int result = 0;
        try{
            if (object.has(key) && !object.isNull(key)){
                result = object.getInt(key);
            }
        }
        catch (Exception e){
            //Utils.error(e.getMessage());
        }
        return result;
    }

    public static long getLongFromJSON(String key, JSONObject object){
        long result = 0L;
        try{
            if (object.has(key) && !object.isNull(key)){
                result = object.getLong(key);
            }
        }
        catch (Exception e){
            //Utils.error(e.getMessage());
        }
        return result;
    }

    public static double getDoubleFromJSON(String key, JSONObject object){
        double result = 0;
        try{
            if (object.has(key) && !object.isNull(key)){
                result = object.getDouble(key);
            }
        }
        catch (Exception e){
            //Utils.error(e.getMessage());
        }
       return result;
    }

    public static String getStringFromJSON(String key, JSONObject object){
        String result = "";
        try{
            if (object.has(key) && !object.isNull(key)){
                result = object.getString(key);
            }
        }
        catch (Exception e){
            //Utils.error(e.getMessage());
        }
       return result;
    }

    public static boolean getBooleanFromJSON(String key, JSONObject object){
        boolean result = false;
        try{
            if (object.has(key) && !object.isNull(key)){
                result = object.getBoolean(key);
            }
        }
        catch (Exception e){
            //Utils.error(e.getMessage());
        }
        return result;
    }
}
