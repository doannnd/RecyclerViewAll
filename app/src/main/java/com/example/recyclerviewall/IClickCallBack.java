package com.example.recyclerviewall;

import android.view.View;

public interface IClickCallBack<T> {
    void onClick(View view, T content);
}
