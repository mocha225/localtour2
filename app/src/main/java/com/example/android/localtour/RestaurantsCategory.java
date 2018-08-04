package com.example.android.localtour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsCategory extends AppCompatActivity {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstancesState) {
        View rootview = inflater.inflate(R.layout.word_list, container, false);

        //Create an list of words.
    final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Leong's Tea House", "Birthplace for Cashew Chicken", R.drawable.leongs));
        words.add(new Word("Lambert's", "Home of Throwed Rolls", R.drawable.lamberts));
        words.add(new Word("Gem of India", "Best Indian Food in Town", )R.drawable.indian);
        words.add(new Word("Nakato", "Best Japanese Restaurant in Town", R.drawable.nakato));
        words.add(new Word("Tasia", "Modern Day Chinese Food", R.drawable.tasia));


        ListView listView = (ListView) rootview.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootview;
    }
}