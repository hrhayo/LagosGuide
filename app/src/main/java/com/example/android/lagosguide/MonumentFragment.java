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
public class MonumentFragment extends Fragment {


    public MonumentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(""+getResources().getString(R.string.bad),
                R.drawable.monument_badagry));
        words.add(new Word(""+getResources().getString(R.string.didi),
                R.drawable.monument_didi));
        words.add(new Word(""+getResources().getString(R.string.free),
                R.drawable.monument_freedom));
        words.add(new Word(""+getResources().getString(R.string.kal),
                R.drawable.monument_kalakuta));
        words.add(new Word(""+getResources().getString(R.string.nation),
                R.drawable.monument_nationaltheatre));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_monuments);

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
