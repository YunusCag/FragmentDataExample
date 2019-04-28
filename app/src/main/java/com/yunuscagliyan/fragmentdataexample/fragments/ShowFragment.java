package com.yunuscagliyan.fragmentdataexample.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yunuscagliyan.fragmentdataexample.R;


public class ShowFragment extends Fragment {

    TextView tvName;
    TextView tvSurname;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_show,container,false);
        tvName=view.findViewById(R.id.tvName);
        tvSurname=view.findViewById(R.id.tvSurname);


        return view;
    }
    public void showMember(String name,String surname){
        tvName.setText(name);
        tvSurname.setText(surname);
    }

}
