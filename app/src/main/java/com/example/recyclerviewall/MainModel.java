package com.example.recyclerviewall;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainModel {

    @SerializedName("Text")
    @Expose
    private String Text;

    @SerializedName("Code")
    @Expose
    private String Code;

    @SerializedName("Title")
    @Expose
    private String Title;

    @Expose
    @SerializedName("isCheck")
    private boolean isCheck;

    public MainModel() {
    }

    public MainModel(String text, String code, String title) {
        Text = text;
        Code = code;
        Title = title;
    }

    public String getText() {
        return (null == Text) ? "" : Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getCode() {
        return (null == Code) ? "0" : Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getTitle() {
        return (null == Title) ? "" : Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }
}
