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
    }
}
