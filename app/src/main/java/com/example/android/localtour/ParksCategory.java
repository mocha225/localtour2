package com.example.android.localtour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

    public class ParksCategory extends AppCompatActivity {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstancesState) {
            View rootview = inflater.inflate(R.layout.word_list, container, false);

            //Create an list of words.
    final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Sequiota", "By the Galloway Trail",0));
        words.add(new Word("Cooper Tennis Complex", "Voted Best USTA Facility in 2016",0));
        words.add(new Word("Fast Night", "Biggest Municipal Pool in Town",0));
        words.add(new Word("Doling Family Center", "Fitness Complex, Community Center, and a cave",0));
        words.add(new Word("Chesterfield Family Center", "Indoor and Outdoor Fitness Complex",0));

            ListView listView = (ListView) rootview.findViewById(R.id.list);

            listView.setAdapter(adapter);

            return rootview;
        }
    }
