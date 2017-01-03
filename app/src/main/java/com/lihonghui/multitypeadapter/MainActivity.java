package com.lihonghui.multitypeadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lihonghui.multitypeadapter.adapter.BetterAdapter;
import com.lihonghui.multitypeadapter.model.Normal;
import com.lihonghui.multitypeadapter.model.One;
import com.lihonghui.multitypeadapter.model.Three;
import com.lihonghui.multitypeadapter.model.Two;
import com.lihonghui.multitypeadapter.model.Visitable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Visitable> list = getData();
        list.add(0,new One("Type One 0"));
        list.add(1,new Two("Type Two 0"));
        list.add(2,new Three("Type Three 0"));
        list.add(new One("Type One 1"));

        recyclerView.setAdapter(new BetterAdapter(list));
    }

    private List<Visitable> getData(){
        List<Visitable> models = new ArrayList<>();

        for (int index = 0; index < 50; index++ ){
            models.add(new Normal("Type normal !!!~~~~~~~~~~~~~!!"+ index));
        }

        return models;
    }

}
