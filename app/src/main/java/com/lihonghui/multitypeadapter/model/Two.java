package com.lihonghui.multitypeadapter.model;


import com.lihonghui.multitypeadapter.Type.TypeFactory;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.icu.text.RelativeDateTimeFormatter.Direction.THIS;

/**
 * Created by yq05481 on 2016/12/30.
 */

public class Two implements Visitable {
    String text;

    public Two(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
