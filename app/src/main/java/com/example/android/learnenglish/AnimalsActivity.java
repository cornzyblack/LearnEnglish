package com.example.android.learnenglish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Precious on 03/12/2016.
 */

public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("camel", "ràkun", R.drawable.camel));
        words.add(new Word("cat", "dàngi", R.drawable.cat));
        words.add(new Word("chicken", "bise", R.drawable.chicken));
        words.add(new Word("cow", "nankó", R.drawable.cow));
        words.add(new Word("dog", "esìgi", R.drawable.dog));
        words.add(new Word("fish", "ègâ", R.drawable.fish));
        words.add(new Word("horse", "dòkò", R.drawable.horse));
        words.add(new Word("lizard", "gbàrà", R.drawable.lizard));
        words.add(new Word("scorpion", "kínkèrè", R.drawable.scorpion));
        words.add(new Word("snake", "ewa", R.drawable.snake));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_animals);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
