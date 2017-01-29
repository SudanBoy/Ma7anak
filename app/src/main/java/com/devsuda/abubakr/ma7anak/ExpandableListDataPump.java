package com.devsuda.abubakr.ma7anak;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Abubakr on 28/01/2017.
 */

public class ExpandableListDataPump {

    private static Context context;

    public ExpandableListDataPump(Context current) {
        this.context = current;
    }

    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();


        String[] processesValues = context.getResources().getStringArray(R.array.processes);

        ArrayAdapter<String> processesAdaptor = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, processesValues);

        // -----------

        String[] placesValues = context.getResources().getStringArray(R.array.places);

        List<String> locationsList = new ArrayList<String>();
        ArrayAdapter<String> locationsAdaptor = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues);

        String placesValuesString = null;
        for (int i = 0; i < locationsAdaptor.getCount(); i++) {
            placesValuesString = (String) locationsAdaptor.getItem(i);
            locationsList.add(placesValuesString);
        }

        // -----------

        String[] placesValues2 = context.getResources().getStringArray(R.array.places2);

        List<String> locationsList2 = new ArrayList<String>();
        ArrayAdapter<String> locationsAdaptor2 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues2);

        String placesValuesString2 = null;
        for (int i = 0; i < locationsAdaptor2.getCount(); i++) {
            placesValuesString = (String) locationsAdaptor2.getItem(i);
            locationsList2.add(placesValuesString);
        }

        // -----------

        String[] placesValues3 = context.getResources().getStringArray(R.array.places3);

        List<String> locationsList3 = new ArrayList<String>();
        ArrayAdapter<String> locationsAdaptor3 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues3);

        for (int i = 0; i < locationsAdaptor3.getCount(); i++) {
            placesValuesString = (String) locationsAdaptor3.getItem(i);
            locationsList3.add(placesValuesString);
        }

        // -----------

        String[] placesValues4 = context.getResources().getStringArray(R.array.places4);

        List<String> locationsList4 = new ArrayList<String>();
        ArrayAdapter<String> locationsAdaptor4 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues4);

        String placesValuesString4 = null;
        for (int i = 0; i < locationsAdaptor4.getCount(); i++) {
            placesValuesString = (String) locationsAdaptor4.getItem(i);
            locationsList4.add(placesValuesString);
        }

        // -----------

        String[] placesValues5 = context.getResources().getStringArray(R.array.places5);

        List<String> locationsList5 = new ArrayList<String>();
        ArrayAdapter<String> locationsAdaptor5 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues5);

        String placesValuesString5 = null;
        for (int i = 0; i < locationsAdaptor2.getCount(); i++) {
            placesValuesString = (String) locationsAdaptor5.getItem(i);
            locationsList5.add(placesValuesString);
        }

        // -----------

        String[] placesValues6 = context.getResources().getStringArray(R.array.places6);

        List<String> locationsList6 = new ArrayList<String>();
        ArrayAdapter<String> locationsAdaptor6 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues6);

        String placesValuesString6 = null;
        for (int i = 0; i < locationsAdaptor2.getCount(); i++) {
            placesValuesString = (String) locationsAdaptor6.getItem(i);
            locationsList6.add(placesValuesString);
        }

        // -----------

        String[] placesValues7 = context.getResources().getStringArray(R.array.places7);

        List<String> locationsList7 = new ArrayList<String>();
        ArrayAdapter<String> locationsAdaptor7 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues7);

        String placesValuesString7 = null;
        for (int i = 0; i < locationsAdaptor7.getCount(); i++) {
            placesValuesString = (String) locationsAdaptor7.getItem(i);
            locationsList7.add(placesValuesString);
        }

        // -----------

        String[] placesValues8 = context.getResources().getStringArray(R.array.places8);

        List<String> locationsList8 = new ArrayList<String>();
        ArrayAdapter<String> locationsAdaptor8 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues8);

        String placesValuesString8 = null;
        for (int i = 0; i < locationsAdaptor8.getCount(); i++) {
            placesValuesString = (String) locationsAdaptor8.getItem(i);
            locationsList8.add(placesValuesString);
        }

        // -----------

        String[] placesValues9 = context.getResources().getStringArray(R.array.places9);

        List<String> locationsList9 = new ArrayList<String>();
        ArrayAdapter<String> locationsAdaptor9 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues9);

        String placesValuesString9 = null;
        for (int i = 0; i < locationsAdaptor9.getCount(); i++) {
            placesValuesString = (String) locationsAdaptor9.getItem(i);
            locationsList9.add(placesValuesString);
        }

        // -----------

        String[] placesValues10 = context.getResources().getStringArray(R.array.places10);

        List<String> locationsList10 = new ArrayList<String>();
        ArrayAdapter<String> locationsAdaptor10 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues10);

        String placesValuesString10 = null;
        for (int i = 0; i < locationsAdaptor10.getCount(); i++) {
            placesValuesString = (String) locationsAdaptor10.getItem(i);
            locationsList10.add(placesValuesString);
        }

        // -----------

        String[] placesValues11 = context.getResources().getStringArray(R.array.places11);

        List<String> locationsList11 = new ArrayList<String>();
        ArrayAdapter<String> locationsAdaptor11 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues11);

        String placesValuesString11 = null;
        for (int i = 0; i < locationsAdaptor11.getCount(); i++) {
            placesValuesString = (String) locationsAdaptor11.getItem(i);
            locationsList11.add(placesValuesString);
        }

        // -----------

        List<List<String>> allLocationLists = new ArrayList<List<String>>();
        allLocationLists.add(locationsList);
        allLocationLists.add(locationsList2);
        allLocationLists.add(locationsList3);
        allLocationLists.add(locationsList4);
        allLocationLists.add(locationsList5);
        allLocationLists.add(locationsList6);
        allLocationLists.add(locationsList7);
        allLocationLists.add(locationsList8);
        allLocationLists.add(locationsList9);
        allLocationLists.add(locationsList10);
        allLocationLists.add(locationsList11);


        for (int i = 0; i < processesAdaptor.getCount(); i++) {
            expandableListDetail.put(processesAdaptor.getItem(i), allLocationLists.get(i));
        }


        return expandableListDetail;
    }
}
