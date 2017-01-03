package com.lihonghui.multitypeadapter.holder;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.lihonghui.multitypeadapter.R;
import com.lihonghui.multitypeadapter.adapter.BetterAdapter;
import com.lihonghui.multitypeadapter.model.Normal;


/**
 * Created by yq05481 on 2017/1/3.
 */

public class NormalViewHolder extends BaseViewHolder<Normal> {
    public NormalViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setUpView(final Normal model, int position, BetterAdapter adapter) {
        final TextView textView = (TextView) getView(R.id.normal_title);
        textView.setText(model.getText());

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(textView.getContext(),model.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
