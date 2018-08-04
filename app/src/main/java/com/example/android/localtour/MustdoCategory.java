package com.example.android.localtour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MustdoCategory extends Fragment {


    private Attraction mAttraction;
    private Destination mDestination;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.word_list, container, false);

        //Create an list of words.
    final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Branson, MO", "Season runs February-December",0));
        words.add(new Word("Silver Dollar City", "Season runs March-December",0));
        words.add(new Word("Top of the Rock", "Golf Resort",0));
        words.add(new Word("Animal Safari", "Drive-thru zoo",0));
        words.add(new Word("Wonders of Wildlife", "Aquarium, Museum",0));
        words.add(new Word("Wilson's Creek National Battlefield", "Civil War Historic Lanmark",0));

        WordAdapter adapter = new WordAdapter(getActivit(), R.color.category_colorsy);

        ListView listView = (ListView) rootview.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootview;
}
}
