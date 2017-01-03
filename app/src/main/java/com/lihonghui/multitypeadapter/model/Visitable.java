package com.lihonghui.multitypeadapter.model;

import com.lihonghui.multitypeadapter.Type.TypeFactory;

/**
 * Created by yq05481 on 2016/12/30.
 */

public interface Visitable {
    int type(TypeFactory typeFactory);
}
