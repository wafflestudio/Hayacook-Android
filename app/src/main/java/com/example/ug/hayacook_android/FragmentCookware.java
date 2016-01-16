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
public class FragmentCookware extends Fragment {
    ArrayList<String> cookware = new ArrayList<String>();

    ListView lv;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        cookware.add("냄비");
        cookware.add("후라이팬");
        cookware.add("도마");
        cookware.add("칼");

        UtensilListViewAdapter adapter = new UtensilListViewAdapter(
                getActivity().getApplicationContext(),
                R.layout.utensil_row,
                cookware);

        View view = inflater.inflate(R.layout.fragment_cookware, container, false);
        lv = (ListView) view.findViewById(R.id.listView1);
        lv.setAdapter(adapter);

        return view;
    }
}
