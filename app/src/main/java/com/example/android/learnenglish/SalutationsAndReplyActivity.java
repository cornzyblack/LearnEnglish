package com.example.android.learnenglish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Precious on 03/12/2016.
 */

public class SalutationsAndReplyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Good Morning", "Okú bé lázìn nyi"));
        words.add(new Word("Good Afternoon", "Okú bé yigídí nyi"));
        words.add(new Word("Good Evening", "Okú bé lozùn nyi"));
        words.add(new Word("Hail", "Okú"));
        words.add(new Word("How are you?", "Ke wo na"));
        words.add(new Word("I thank God", "Mi jin yébo sòkò"));
        words.add(new Word("Welcome", "Márába"));
        words.add(new Word("Well", "Láfíyá"));
        words.add(new Word("Alright", "Tò"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_salutations_and_replies);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}

