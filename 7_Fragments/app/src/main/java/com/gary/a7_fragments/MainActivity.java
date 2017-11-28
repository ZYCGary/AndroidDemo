package com.gary.a7_fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This gets called by the Top Fragment when the user clicks the button
    @Override
    public void createMeme(String top, String bottom) {
        BottomSectionFragment bottomSectionFragment = (BottomSectionFragment) getFragmentManager().findFragmentById(R.id.fragment3);
        bottomSectionFragment.setMemeText(top,bottom);
    }
}
