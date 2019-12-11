package com.example.recyclerviewall;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AutoCompleteTextview extends AppCompatActivity {

    @BindView(R.id.rv_name)
    RecyclerView rvName;
    @BindView(R.id.auto_name)
    AutoCompleteTextView autoName;

    private NameAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auto_complete_text_view);
        ButterKnife.bind(this);
    }
}
