package com.example.recyclerviewall.model;

import androidx.annotation.NonNull;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainContentModel extends BaseObj{
    private List<CompanyModel> companyList = new ArrayList<>();

    public List<CompanyModel> getCompanies() {
        return companyList;
    }

    public void setCompanies(List<CompanyModel> companies) {
        this.companyList = companies;
    }

    public MainContentModel(JSONObject jsonObject) {
        if (jsonObject == null) {
            return;
        }

        JSONArray companies = getJSONArrayFromJSON("companies", jsonObject);
        if (companies == null) {
           return;
        }

        for (int i = 0; i < companies.length(); i++) {
            JSONObject company = getJSONObjectInJSONArrayAtIndex(i, companies);
            if (company == null) {
                return;
            }

            CompanyModel companyModel = new CompanyModel(company);
            companyList.add(companyModel);
        }
    }

    @NonNull
    @Override
    public String toString() {
        return "\ncompanyList: " + companyList.toString();
    }
}
