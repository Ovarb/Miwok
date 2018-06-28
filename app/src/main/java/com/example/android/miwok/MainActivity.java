/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public class MainActivityButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {

            int clickedButton = view.getId();

            switch (clickedButton) {
                case (R.id.numbers):
                    //Create a new intent to open the {@link NumbersActivity}
                    Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                    startActivity(numbersIntent);
                    break;
                case (R.id.family):
                    Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                    startActivity(familyIntent);
                    break;
                case (R.id.phrases):
                    Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                    startActivity(phrasesIntent);
                    break;
                case (R.id.colors):
                    Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                    startActivity(colorsIntent);
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        MainActivityButtonListener listener = new MainActivityButtonListener();

        //create a variable and save reference to TextView
        //assign Listener to the TextView.
        TextView buttonNumbers = (TextView) findViewById(R.id.numbers);
        buttonNumbers.setOnClickListener(listener);

        TextView familyNumbers = (TextView) findViewById(R.id.family);
        familyNumbers.setOnClickListener(listener);

        TextView phrasesNumbers = (TextView) findViewById(R.id.phrases);
        phrasesNumbers.setOnClickListener(listener);

        TextView colorsNumbers = (TextView) findViewById(R.id.colors);
        colorsNumbers.setOnClickListener(listener);
    }
}
