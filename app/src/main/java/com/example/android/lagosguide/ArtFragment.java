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
public class ArtFragment extends Fragment {


    public ArtFragment() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(""+getResources().getString(R.string.art_cafe),
                R.drawable.art_artcafe));
        words.add(new Word(""+getResources().getString(R.string.nike),
                R.drawable.art_nike));
        words.add(new Word(""+getResources().getString(R.string.red),
                R.drawable.art_reddoor));
        words.add(new Word(""+getResources().getString(R.string.terra),
                R.drawable.art_terra));
        words.add(new Word(""+getResources().getString(R.string.thought),
                R.drawable.art_thoughtpyramid));



        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_gallery);

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
