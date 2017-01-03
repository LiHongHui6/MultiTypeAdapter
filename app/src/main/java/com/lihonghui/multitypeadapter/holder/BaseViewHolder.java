package com.lihonghui.multitypeadapter.holder;


import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

import com.lihonghui.multitypeadapter.adapter.BetterAdapter;

/**
 * Created by yq05481 on 2017/1/3.
 */

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {
    private SparseArray<View> views;
    private View mItemView;
    public BaseViewHolder(View itemView) {
        super(itemView);
        views = new SparseArray<>();
        this.mItemView = itemView;
    }

    public View getView(int resID) {
        View view = views.get(resID);

        if (view == null) {
            view = mItemView.findViewById(resID);
            views.put(resID,view);
        }

        return view;
    }

    public abstract void setUpView(T model, int position, BetterAdapter adapter);
}
