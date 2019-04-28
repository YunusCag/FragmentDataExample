package com.yunuscagliyan.fragmentdataexample;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yunuscagliyan.fragmentdataexample.fragments.RegisterFragment;
import com.yunuscagliyan.fragmentdataexample.fragments.ShowFragment;
import com.yunuscagliyan.fragmentdataexample.interfaces.IMainActivity;

public class MainActivity extends AppCompatActivity implements IMainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    public void initialize(){
        RegisterFragment registerFragment=new RegisterFragment();
        ShowFragment showFragment=new ShowFragment();
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container1,registerFragment,"register_fragment");
        transaction.replace(R.id.container2,showFragment,"show_fragment");
        transaction.commit();

    }

    @Override
    public void showRecord(String name, String surname) {
        ShowFragment showFragment= (ShowFragment) getSupportFragmentManager().findFragmentByTag("show_fragment");
        showFragment.showMember(name,surname);

    }
}

