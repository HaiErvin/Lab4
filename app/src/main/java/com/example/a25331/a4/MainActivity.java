package com.example.a25331.a4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        preference fragmentPreferences = new preference();
        transaction.replace(android.R.id.content, fragmentPreferences);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
