package com.example.recyclerviewall.adapter;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.recyclerviewall.IClickCallBack;
import com.example.recyclerviewall.PaginationScrollListener;
import com.example.recyclerviewall.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class ShopActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.swipeContainer)
    SwipeRefreshLayout swipeRefreshLayout;

    private List<Shop> shopList = new ArrayList<>();
    private ShopAdapter adapter;

    /**
     * for recyclerview load more
     */
    private boolean isLoading = false;

    private boolean isLastPage = false;

    private int TOTAL_PAGES = 0;

    private static final int PAGE_START = 1;

    private int currentPage = PAGE_START;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        initData();


    }

    private void initData() {
        swipeRefreshData();

        // presenter

        /**
         * có thể thay bằng addEvent
         */
        setUpView();

        setUpRecylerView();

        loadData();
    }

    private void swipeRefreshData() {
        swipeRefreshLayout.setOnRefreshListener(() -> {
            swipeRefreshLayout.setRefreshing(true);
            reloadData();
            swipeRefreshLayout.setRefreshing(false);
        });
    }

    private void setUpView() {

    }

    private void setUpRecylerView() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ShopAdapter();


    }

    private void loadData() {
        if (!isNetworkConnected()) {
            showToast("Khong co internet");
            return;
        }

        loadFirstPage();
    }

    private void reloadData() {

    }

    private void loadFirstPage() {

    }

    private boolean isNetworkConnected() {
        return Connectivity.isConnected(this);
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
