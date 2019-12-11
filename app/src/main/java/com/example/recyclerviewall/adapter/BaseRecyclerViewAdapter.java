package com.example.recyclerviewall.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil.ItemCallback;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewall.IClickCallBack;
import com.example.recyclerviewall.PaginationScrollListener;
import com.example.recyclerviewall.R;

import java.util.List;

import butterknife.ButterKnife;

public abstract class BaseRecyclerViewAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    // for click into item
    protected IClickCallBack<T> callBack;

    // for loading item
    protected static final int LOADING = 0;

    // for item not loading
    protected static final int SEARCH = 1;

    // for paging
    protected PaginationScrollListener mCallback;

    //
    private boolean isLoadingAdded = false;

    protected List<T> data;


    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        if (viewType == LOADING) {
            View view = layoutInflater.inflate(R.layout.item_progress, parent, false);
            return new LoadingViewHolder(view);
        }
        throw new IllegalArgumentException("No view Type");
    }

    /**
     * Method used to gen new item of object from onCreate Class
     * @return
     */
    public abstract T addNewItem();

    public void add(T r) {
        data.add(r);
        notifyItemInserted(data.size() - 1);
    }

    public void addAll(List<T> moveResults) {
        for (T result : moveResults) {
            add(result);
        }
    }

    public void remove(T r) {
        int position = data.indexOf(r);
        if (position > -1) {
            data.remove(position);
            notifyItemRemoved(position);
        }
    }

    public void clear() {
        isLoadingAdded = false;
        while (getItemCount() > 0) {
            remove(getItem(0));
        }
    }

    public boolean isEmpty() {
        return getItemCount() == 0;
    }

    public void addLoadingFooter() {
        isLoadingAdded = true;
        add(addNewItem());
    }

    public void removeLoadingFooter() {
        isLoadingAdded = false;

        int position = data.size() - 1;
        T result = getItem(position);
        if (result != null) {
            data.remove(position);
            notifyItemRemoved(position);
        }
    }

    public T getItem(int position) {
        return data.get(position);
    }

    public void setCallBack(IClickCallBack<T> callBack) {
        this.callBack = callBack;
    }

    public class LoadingViewHolder extends RecyclerView.ViewHolder {

        public LoadingViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
