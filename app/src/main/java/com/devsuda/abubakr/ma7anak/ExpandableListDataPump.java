package com.devsuda.abubakr.ma7anak;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

        String[] placesValues;

        Comparator<String> ALPHABETICAL_ORDER1 = new Comparator<String>() {
            public int compare(String object1, String object2) {
                int res = String.CASE_INSENSITIVE_ORDER.compare(object1.toString(), object2.toString());
                return res;
            }
        };


        placesValues = context.getResources().getStringArray(R.array.places);
        ArrayAdapter<String> locationsAdaptor = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues);
        List<String> locationsList1 = new ArrayList<String>();
        for (int i = 0; i < locationsAdaptor.getCount(); i++) {
            locationsList1.add((String) locationsAdaptor.getItem(i));
            Collections.sort(locationsList1, ALPHABETICAL_ORDER1);
        }

        // -----------

        placesValues = context.getResources().getStringArray(R.array.places2);
        ArrayAdapter<String> locationsAdaptor2 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues);
        List<String> locationsList2 = new ArrayList<String>();
        for (int i = 0; i < locationsAdaptor2.getCount(); i++) {
            locationsList2.add((String) locationsAdaptor2.getItem(i));
            Collections.sort(locationsList2, ALPHABETICAL_ORDER1);
        }

        // -----------

        placesValues = context.getResources().getStringArray(R.array.places3);
        ArrayAdapter<String> locationsAdaptor3 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues);
        List<String> locationsList3 = new ArrayList<String>();
        for (int i = 0; i < locationsAdaptor3.getCount(); i++) {
            locationsList3.add((String) locationsAdaptor3.getItem(i));
            Collections.sort(locationsList3, ALPHABETICAL_ORDER1);
        }

        // -----------

        placesValues = context.getResources().getStringArray(R.array.places4);
        ArrayAdapter<String> locationsAdaptor4 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues);
        List<String> locationsList4 = new ArrayList<String>();
        for (int i = 0; i < locationsAdaptor4.getCount(); i++) {
            locationsList4.add((String) locationsAdaptor4.getItem(i));
            Collections.sort(locationsList4, ALPHABETICAL_ORDER1);
        }

        // -----------

        placesValues = context.getResources().getStringArray(R.array.places5);
        ArrayAdapter<String> locationsAdaptor5 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues);
        List<String> locationsList5 = new ArrayList<String>();
        for (int i = 0; i < locationsAdaptor2.getCount(); i++) {
            locationsList5.add((String) locationsAdaptor5.getItem(i));
            Collections.sort(locationsList5, ALPHABETICAL_ORDER1);
        }

        // -----------

        placesValues = context.getResources().getStringArray(R.array.places6);
        ArrayAdapter<String> locationsAdaptor6 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues);
        List<String> locationsList6 = new ArrayList<String>();
        for (int i = 0; i < locationsAdaptor2.getCount(); i++) {
            locationsList6.add((String) locationsAdaptor6.getItem(i));
            Collections.sort(locationsList6, ALPHABETICAL_ORDER1);
        }

        // -----------

        placesValues = context.getResources().getStringArray(R.array.places7);
        ArrayAdapter<String> locationsAdaptor7 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues);
        List<String> locationsList7 = new ArrayList<String>();
        for (int i = 0; i < locationsAdaptor7.getCount(); i++) {
            locationsList7.add((String) locationsAdaptor7.getItem(i));
            Collections.sort(locationsList7, ALPHABETICAL_ORDER1);
        }

        // -----------

        placesValues = context.getResources().getStringArray(R.array.places8);
        ArrayAdapter<String> locationsAdaptor8 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues);
        List<String> locationsList8 = new ArrayList<String>();
        for (int i = 0; i < locationsAdaptor8.getCount(); i++) {
            locationsList8.add((String) locationsAdaptor8.getItem(i));
            Collections.sort(locationsList8, ALPHABETICAL_ORDER1);
        }

        // -----------

        placesValues = context.getResources().getStringArray(R.array.places9);
        ArrayAdapter<String> locationsAdaptor9 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues);
        List<String> locationsList9 = new ArrayList<String>();
        for (int i = 0; i < locationsAdaptor9.getCount(); i++) {
            locationsList9.add((String) locationsAdaptor9.getItem(i));
            Collections.sort(locationsList9, ALPHABETICAL_ORDER1);
        }

        // -----------

        placesValues = context.getResources().getStringArray(R.array.places10);
        ArrayAdapter<String> locationsAdaptor10 = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, placesValues);
        List<String> locationsList10 = new ArrayList<String>();
        String placesValuesString10 = null;
        for (int i = 0; i < locationsAdaptor10.getCount(); i++) {
            locationsList10.add((String) locationsAdaptor10.getItem(i));
            Collections.sort(locationsList10, ALPHABETICAL_ORDER1);
        }

        // -----------

        List<List<String>> allLocationLists = new ArrayList<List<String>>();
        allLocationLists.add(locationsList1);
        allLocationLists.add(locationsList2);
        allLocationLists.add(locationsList3);
        allLocationLists.add(locationsList4);
        allLocationLists.add(locationsList5);
        allLocationLists.add(locationsList6);
        allLocationLists.add(locationsList7);
        allLocationLists.add(locationsList8);
        allLocationLists.add(locationsList9);
        allLocationLists.add(locationsList10);

        // ----------------

        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        String[] processesValues = context.getResources().getStringArray(R.array.processes);
        Arrays.sort(processesValues);

        ArrayAdapter<String> processesAdaptor = new ArrayAdapter<String>(context,
                R.layout.places_list_item, R.id.placeNameTv, processesValues);

        for (int i = 0; i < processesAdaptor.getCount(); i++) {
            String test = processesAdaptor.getItem(i).toString();
            System.out.println(test);
            expandableListDetail.put(processesAdaptor.getItem(i), allLocationLists.get(i));
        }

        return expandableListDetail;
    }


}
