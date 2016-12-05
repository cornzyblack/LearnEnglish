package com.example.android.learnenglish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Precious on 03/12/2016.
 */

public class PhrasesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("What is your name?", "Ke sunã we yo?"));
        words.add(new Word("Where are you going?", "ba we èlo?"));
        words.add(new Word("My name is Aisha", "Sunã mi ye Aisha"));
        words.add(new Word("I am coming", "mi èbě"));
        words.add(new Word("Where is Aisha?", "ba Aisha da o?"));
        words.add(new Word("I will come", "mi a bé"));
        words.add(new Word("Are you coming?", "mi da bé?"));
        words.add(new Word("come", "bé"));
        words.add(new Word("go", "lo"));
        words.add(new Word("Did you see him ?", "wo le u yè bô?"));
        words.add(new Word("Come and eat", "bé gi ejè"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
