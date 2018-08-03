package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Where are you going?", "minto wuksus", -1, R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?", "tinnә oyaase'nә",-1, R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...", "oyaaset...",-1, R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?", "michәksәs?", -1, R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good.", "kuchi achit", -1, R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?", "әәnәs'aa?", -1, R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", -1, R.raw.phrase_yes_im_coming));
        words.add(new Word("I’m coming.", "әәnәm", -1, R.raw.phrase_im_coming));
        words.add(new Word("Let’s go.", "yoowutis", -1, R.raw.phrase_lets_go));
        words.add(new Word("Come here.", "әnni'nem", -1, R.raw.phrase_come_here));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(PhrasesActivity.this, words.get(i).getDefaultTranslation(), Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, words.get(i).getAudioResourceId());
                mMediaPlayer.start();
            }
        });

    }
}