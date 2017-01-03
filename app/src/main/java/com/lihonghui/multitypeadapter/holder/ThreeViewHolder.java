package com.lihonghui.multitypeadapter.holder;

import android.view.View;
import android.widget.TextView;

import com.lihonghui.multitypeadapter.R;
import com.lihonghui.multitypeadapter.adapter.BetterAdapter;
import com.lihonghui.multitypeadapter.model.Three;


/**
 * Created by yq05481 on 2017/1/3.
 */

public class ThreeViewHolder extends BaseViewHolder<Three> {
    public ThreeViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setUpView(Three model, int position, BetterAdapter adapter) {
        TextView textView = (TextView) getView(R.id.three_title);
        textView.setText(model.getText());
    }
}
