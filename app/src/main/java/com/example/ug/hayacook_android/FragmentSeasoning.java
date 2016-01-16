package com.example.ug.hayacook_android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by UG on 2016-01-15.
 */
public class FragmentSeasoning extends Fragment {
    ArrayList<String> seasoning = new ArrayList<String>();

    ListView lv;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        seasoning.add("설탕");
        seasoning.add("소금");
        seasoning.add("고추장");
        seasoning.add("올리브오일");

        UtensilListViewAdapter adapter = new UtensilListViewAdapter(
                getActivity().getApplicationContext(),
                R.layout.utensil_row,
                seasoning);

        View view = inflater.inflate(R.layout.fragment_seasoning, container, false);
        lv = (ListView) view.findViewById(R.id.listView2);
        lv.setAdapter(adapter);

        return view;
    }
}
