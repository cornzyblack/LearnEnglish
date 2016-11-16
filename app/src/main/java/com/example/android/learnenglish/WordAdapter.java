package com.example.android.learnenglish;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Precious on 30/10/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    /**Custom constructor
    *The context is used to inflate the layout file, and the list of data
     * we want to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file
     * @param words A list of word objects to display in a list
     */
    public WordAdapter(Activity context, ArrayList<Word>words){
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if the existing view is being reused, otherwise inflate the View
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        //Find the textView in the list_item.xml layout with the ID nupeWord
        TextView nupeWordTextView = (TextView) listItemView.findViewById(R.id.nupe_text_view);
        nupeWordTextView.setText(currentWord.getNupeTranslation());

        //Find the textView in the list_item.xml layout with the ID englishWord
        TextView defaultWordTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultWordTextView.setText(currentWord.getDefaultTranslation());

        //Find the imageView in the list_item.xml layout with the ID for the Image view
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        //if an image is provided for this word or not
        if (currentWord.hasImage()){
            //if an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getImageResourceId());
            //Make sure the Image is visible
            imageView.setVisibility(View.VISIBLE);
        }
        else
        //Otherwise hide the Image View
            imageView.setVisibility(View.GONE);

        return listItemView;
    }
}
