package com.lihonghui.multitypeadapter.holder;

import android.view.View;
import android.widget.TextView;

import com.lihonghui.multitypeadapter.R;
import com.lihonghui.multitypeadapter.adapter.BetterAdapter;
import com.lihonghui.multitypeadapter.model.One;


/**
 * Created by yq05481 on 2017/1/3.
 */

public class OneViewHolder extends BaseViewHolder<One> {
    public OneViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setUpView(One model, int position, BetterAdapter adapter) {
        TextView textView = (TextView) getView(R.id.one_title);
        textView.setText(model.getText());
    }
}
