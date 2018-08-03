package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {

    /**
     * Contains the value of list_item's background color.
     */
    private int mColorResourceId;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param words A List of Word objects to display in a list
     * @param colorResourceId The appropriate background color
     */
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews , the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0 , words);
        this.mColorResourceId = colorResourceId;
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = (Word) getItem(position);

        // Find the  container in the list_item.xml layout with the ID text_container
        View textContainer = listItemView.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // Set proper background color of the text_container View
        textContainer.setBackgroundColor(color);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        // Get the Miwok translation from the current Word object and
        // set this text on the Miwok translation TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        // Get the default translation from the current Word object and
        // set this text on the default translation TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());



        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            // Get the Image Resource ID from the current Word object and
            // set this ID on the item's ImageView
            itemImageView.setImageResource(currentWord.getImageResourceId());

            //Make sure the image is visible
            itemImageView.setVisibility(View.VISIBLE);
        } else {
            //Otherwise hide the ImageView (set visibility to GONE)
            itemImageView.setVisibility(View.GONE);
        }




        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
