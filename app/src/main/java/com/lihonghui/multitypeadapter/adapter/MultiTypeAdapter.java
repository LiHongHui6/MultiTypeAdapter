package com.lihonghui.multitypeadapter.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.lihonghui.multitypeadapter.Type.TypeFactory;
import com.lihonghui.multitypeadapter.Type.TypeFactoryForList;
import com.lihonghui.multitypeadapter.holder.BaseViewHolder;
import com.lihonghui.multitypeadapter.model.Visitable;

import java.util.List;

/**
 * Created by yq05481 on 2016/12/30.
 */

public class MultiTypeAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private TypeFactory typeFactory;
    private List<Visitable> models;

    public MultiTypeAdapter(List<Visitable> models) {
        this.models = models;
        this.typeFactory = new TypeFactoryForList();

    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = View.inflate(parent.getContext(), viewType, null);
        return typeFactory.createViewHolder(viewType,itemView);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setUpView(models.get(position),position,this);
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    @Override
    public int getItemViewType(int position) {
        return models.get(position).type(typeFactory);
    }
}
