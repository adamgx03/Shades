package com.abooth.shades;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class MyActivity extends Activity implements ListFragment.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    @Override
    public void onShadeItemSelected (String link) {

        //TASK 1: CHECK IF THE INFORMATION FRAGMENT EXISTS IN THIS LAYOUT
        InformationFragment informationFragment = (InformationFragment) getFragmentManager().findFragmentById(R.id.fragment2);

        //TASK 2: CHECK IF A TWO PANE CONFIGURATION BEING DISPLAYED?
        if (informationFragment != null && informationFragment.isInLayout()) {
            informationFragment.setText(link);
        }

        //A SINGLE-PANE CONFIGURATION EXISTS
        else {
            //IF THE INFORMATION FRAGMENT DOES NOT EXIST IN THIS
            //LAYOUT ACTIVATE THE INFORMATION ACTIVITY

            Intent intent = new Intent (this, InformationActivity.class);
            intent.putExtra("Information", link);
            startActivity (intent);
        }
    }
}
