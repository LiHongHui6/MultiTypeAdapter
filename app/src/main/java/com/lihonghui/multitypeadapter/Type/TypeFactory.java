package com.lihonghui.multitypeadapter.Type;

import android.view.View;

import com.lihonghui.multitypeadapter.holder.BaseViewHolder;
import com.lihonghui.multitypeadapter.model.Normal;
import com.lihonghui.multitypeadapter.model.One;
import com.lihonghui.multitypeadapter.model.Three;
import com.lihonghui.multitypeadapter.model.Two;


/**
 * Created by yq05481 on 2016/12/30.
 */

public interface TypeFactory {
    int type(One one);

    int type(Two two);

    int type(Three three);

    int type(Normal normal);

    BaseViewHolder createViewHolder(int type, View itemView);
}
