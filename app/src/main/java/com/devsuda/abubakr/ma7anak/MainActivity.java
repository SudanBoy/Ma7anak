package com.devsuda.abubakr.ma7anak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar);

        Button governmentProcessBTN = (Button) findViewById(R.id.governmentProcessBTN);
        governmentProcessBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent processesListAcitivity = new Intent(getApplicationContext(), ProcessesListAcitivity.class);
                startActivity(processesListAcitivity);
            }
        });


        Button privateProcessBTN = (Button) findViewById(R.id.privateProcessBTN);
        privateProcessBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Todo: create list for possible private processes and their places
            }
        });

        Button addRankingBTN = (Button) findViewById(R.id.addRankingBTN);
        addRankingBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Todo: allow users to add their own rating
            }
        });
    }

}
