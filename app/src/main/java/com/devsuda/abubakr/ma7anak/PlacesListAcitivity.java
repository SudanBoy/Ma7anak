package com.devsuda.abubakr.ma7anak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Abubakr on 26/01/2017.
 */

public class PlacesListAcitivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_list);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);

        String[] values = getResources().getStringArray(R.array.places);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.places_list_item, R.id.placeNameTv, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                int itemPosition = position;
                String itemValue = (String) listView.getItemAtPosition(position);

                Intent placeInfo = new Intent(getApplicationContext(), PlaceInfoTabs.class);
                startActivity(placeInfo);

            }

        });
    }
}
