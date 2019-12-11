package com.example.recyclerviewall;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.recyclerviewall.model.MainContentModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.swipeContainer)
    SwipeRefreshLayout swipeContainer;
    @BindView(R.id.main_progress)
    ProgressBar mainProgress;
    @BindView(R.id.tv_no_data)
    TextView tvNoData;
    @BindView(R.id.error_txt_cause)
    TextView errorTxtCause;
    @BindView(R.id.error_btn_retry)
    Button errorBtnRetry;

    private ShopAdapter shopAdapter;

    private Unbinder unbinder;
    private boolean isLoading = false;
    private boolean isLastPage = false;

    public static final int PAGE_START = 0;
    private int currentPage = PAGE_START;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);

        String json = loadJSONFromAsset();
        MainContentModel mainModel = ParseUtils.parseMainContenModel(json);
        Log.d(TAG, "mainModel: " + mainModel.toString());
        Log.d(TAG, "json: " + json);
    }

    private String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getAssets().open("test.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }


    @Override
    protected void onDestroy() {
        if (unbinder != null) {
            unbinder.unbind();
        }
        super.onDestroy();
    }

    public void gitTestStatus() {
        // TODO: Nguyễn Đình Đoàn 12/11/2019 .....
    }

    public void gitTestTwo() {
        // FIXME: Nguyeen 12/11/2019
    }

    //master

    // master 1

    // master 2
}
