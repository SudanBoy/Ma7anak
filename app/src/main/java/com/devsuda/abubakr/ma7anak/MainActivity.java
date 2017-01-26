package com.devsuda.abubakr.ma7anak;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button governmentProcessBTN = (Button) findViewById(R.id.governmentProcessBTN);
        governmentProcessBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "إجراء حكومي", Toast.LENGTH_LONG).show();

                Intent processesListAcitivity = new Intent(getApplicationContext(),ProcessesListAcitivity.class);
                startActivity(processesListAcitivity);
            }
        });


        Button privateProcessBTN = (Button) findViewById(R.id.privateProcessBTN);
        privateProcessBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "تحت الانشاء", Toast.LENGTH_LONG).show();
            }
        });

        Button addRankingBTN = (Button) findViewById(R.id.addRankingBTN);
        addRankingBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "تحت الانشاء", Toast.LENGTH_LONG).show();
            }
        });
    }
}
