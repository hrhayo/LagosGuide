package com.example.android.lagosguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(""+getResources().getString(R.string.eko),
                R.drawable.hotel_eko));
        words.add(new Word(""+getResources().getString(R.string.four),
                R.drawable.hotel_four));
        words.add(new Word(""+getResources().getString(R.string.lagos),
                R.drawable.hotel_lagos));
        words.add(new Word(""+getResources().getString(R.string.rad),
                R.drawable.hotel_rad));
        words.add(new Word(""+getResources().getString(R.string.tulip),
                R.drawable.hotel_tulip));
        words.add(new Word(""+getResources().getString(R.string.wheat),
                R.drawable.hotel_wheat));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_hotels);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


            }
        });

        return rootView;
    }

}
