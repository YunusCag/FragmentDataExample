package com.yunuscagliyan.fragmentdataexample.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.yunuscagliyan.fragmentdataexample.R;
import com.yunuscagliyan.fragmentdataexample.interfaces.IMainActivity;


public class RegisterFragment extends Fragment {


    EditText etName;
    EditText etSurname;
    Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_register,container,false);
        etName=view.findViewById(R.id.etName);
        etSurname=view.findViewById(R.id.etSurname);
        button=view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IMainActivity mainInterface= (IMainActivity) getActivity();
                String name=etName.getText().toString();
                String surName=etSurname.getText().toString();
                etName.setText("");
                etSurname.setText("");
                mainInterface.showRecord(name,surName);
            }
        });


        return view;
    }
}
