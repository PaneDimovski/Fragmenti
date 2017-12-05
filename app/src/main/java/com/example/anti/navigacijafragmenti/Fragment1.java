package com.example.anti.navigacijafragmenti;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Anti on 12/5/2017.
 */

public class Fragment1 extends Fragment {

@BindView(R.id.textView)
TextView txt;

    private Unbinder mUnbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1, null);

       mUnbinder= ButterKnife.bind(this,view);

        txt.setText("Prviot Fragment 1");
            return  view;

    }

    @OnClick(R.id.button)
    public  void buttonClick () {

        Toast.makeText(getActivity(), "Toast Fragment 1", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
    }
}
