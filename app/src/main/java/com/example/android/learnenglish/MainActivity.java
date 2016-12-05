package com.example.android.learnenglish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView salutationsAndReply = (TextView) findViewById(R.id.salutations_and_replies);

        //Set a click listener on that view
        salutationsAndReply.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the numbers category is clicked on
            @Override
            public void onClick(View view) {
                //Create a new Intent to open the {@link SalutationsAndReplyActivity
                Intent salutationsAndReplyIntent = new Intent(MainActivity.this, SalutationsAndReplyActivity.class);
                startActivity(salutationsAndReplyIntent);
            }
        });

        TextView numbers = (TextView) findViewById(R.id.numbers);

        //Set a click listener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the numbers category is clicked on
            @Override
            public void onClick(View view) {
                //Create a new Intent to open the {@link NumbersActivity
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        TextView partsOfTheBody = (TextView) findViewById(R.id.body_parts);

        partsOfTheBody.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the Parts of the Body category is clicked on
            @Override
            public void onClick(View view) {
                //Create a new Intent to open the {@link PartsOfTheBodyActivity
                Intent partsOfTheBodyIntent = new Intent(MainActivity.this, PartsOfTheBodyActivity.class);
                startActivity(partsOfTheBodyIntent);
            }
        });

        TextView animals = (TextView) findViewById(R.id.animals);

        //Set a click listener on that view
        animals.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the Animals category is clicked on
            @Override
            public void onClick(View view) {
                //Create a new Intent to open the {@link AnimalsActivity
                Intent animalsIntent = new Intent(MainActivity.this, AnimalsActivity.class);
                startActivity(animalsIntent);
            }
        });

        TextView family = (TextView) findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the family category is clicked on
            @Override
            public void onClick(View view) {
                //Create a new Intent to open the {@link FamilyMembersActivity
                Intent familyIntent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(familyIntent);
            }
        });

        TextView Phrases = (TextView) findViewById(R.id.phrases);

        Phrases.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the phrases category is clicked on
            @Override
            public void onClick(View view) {
                //Create a new Intent to open the {@link PhrasesActivity
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

    }

}
