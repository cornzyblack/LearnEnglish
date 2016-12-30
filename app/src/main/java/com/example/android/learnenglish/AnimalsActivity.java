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
        words.add(new Word("Camel", "Ràkun", R.drawable.camel));
        words.add(new Word("Cat", "Dàngi", R.drawable.cat));
        words.add(new Word("Chicken", "Bise", R.drawable.chicken));
        words.add(new Word("Cow", "Nankó", R.drawable.cow));
        words.add(new Word("Dog", "Esìgi", R.drawable.dog));
        words.add(new Word("Fish", "Ègâ", R.drawable.fish));
        words.add(new Word("Horse", "Dòkò", R.drawable.horse));
        words.add(new Word("Lizard", "Gbàrà", R.drawable.lizard));
        words.add(new Word("Scorpion", "Kínkèrè", R.drawable.scorpion));
        words.add(new Word("Snake", "Ewa", R.drawable.snake));

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
