package com.example.android.lagosguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();


    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;

    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param wordsTrans      is the list of {@link Word}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */


    public WordAdapter(Activity context, ArrayList<Word> wordsTrans, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, wordsTrans);

        mColorResourceId = colorResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);

        assert currentWord != null;
        nameTextView.setText(currentWord.getNameDescription());

        // Find the TextView in the list_item.xml layout with the ID version_number
        ImageView iconImageView = (ImageView) listItemView.findViewById(R.id.list_item_icon);


        // Check if an image is provided for this word or not
        if (currentWord.hasImage()) {

            iconImageView.setImageResource(currentWord.getImageIcon());

            iconImageView.setVisibility(View.VISIBLE);
        } else {

            iconImageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;


    }


}