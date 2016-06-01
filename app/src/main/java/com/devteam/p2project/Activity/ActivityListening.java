package com.devteam.p2project.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.teamdev.progettosisd.R;


/**
 * Created by claudiocavallaro on 01/06/16.
 */
public class ActivityListening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listening);
    }

    //fghjklfghj

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}