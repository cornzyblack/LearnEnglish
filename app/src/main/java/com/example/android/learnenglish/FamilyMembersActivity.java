package com.example.android.learnenglish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Precious on 03/12/2016.
 */

public class FamilyMembersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father", "Baba", R.drawable.family_father));
        words.add(new Word("Mother", "Nna", R.drawable.family_mother));
        words.add(new Word("Brother", "Yaya", R.drawable.family_younger_brother));
        words.add(new Word("Sister", "Yaya", R.drawable.family_younger_sister));
        words.add(new Word("Grandfather", "Ndãkó", R.drawable.family_grandfather));
        words.add(new Word("Grandmother", "Nnãkó", R.drawable.family_grandmother));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}

