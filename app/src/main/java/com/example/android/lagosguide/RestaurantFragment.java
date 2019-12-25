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
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(""+getResources().getString(R.string.cactus),
                R.drawable.rest_cactus));
        words.add(new Word(""+getResources().getString(R.string.casp),
                R.drawable.rest_casper));
        words.add(new Word(""+getResources().getString(R.string.hard),
                R.drawable.rest_hard));
        words.add(new Word(""+getResources().getString(R.string.lou),
                R.drawable.rest_lou));
        words.add(new Word(""+getResources().getString(R.string.ocean),
                R.drawable.rest_ocean));
        words.add(new Word(""+getResources().getString(R.string.rsvp),
                R.drawable.rest_rsvp));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_restaurant);

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
