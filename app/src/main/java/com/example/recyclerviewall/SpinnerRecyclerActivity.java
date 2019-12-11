package com.example.recyclerviewall;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SpinnerRecyclerActivity extends AppCompatActivity {

    @BindView(R.id.spinner)
    Spinner spinner;

    String arrays[] = {"Android", "IOS"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_recyclerview);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,
                arrays);
       spinner.setAdapter(adapter);

       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
               @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(SpinnerRecyclerActivity.this, "type: "
                       + arrays[position], Toast.LENGTH_SHORT).show();

               /**
                * làm ví dụ thêm về spinner để hiểu thêm cách sử dụng của thằng này
                */
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {
               /**
                * không có gì xảy ra ở đây thì phải làm gì nhỉ ?
                */
           }
       });
    }
}
