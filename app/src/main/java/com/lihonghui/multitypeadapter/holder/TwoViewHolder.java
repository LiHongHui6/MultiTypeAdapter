package com.lihonghui.multitypeadapter.holder;

import android.view.View;
import android.widget.TextView;

import com.lihonghui.multitypeadapter.R;
import com.lihonghui.multitypeadapter.adapter.MultiTypeAdapter;
import com.lihonghui.multitypeadapter.model.Two;


/**
 * Created by yq05481 on 2017/1/3.
 */

public class TwoViewHolder extends BaseViewHolder<Two> {
    public TwoViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setUpView(Two model, int position, MultiTypeAdapter adapter) {
        TextView textView = (TextView) getView(R.id.two_title);
        textView.setText(model.getText());
    }


}
