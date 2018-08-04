package com.example.android.localtour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsCategory extends AppCompatActivity {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.word_list, container, false);


        //Create an list of words.
    final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Ride On", "Date: June 19",0));
        words.add(new Word("Silver Strands", "Date: March 19",0));
        words.add(new Word("Bass Pro Shops", "Open All Year Round",0));
        words.add(new Word("Cider Days", "September 19",0));
        words.add(new Word("Arts Fest", "May 1",0));

        ListView listView = (ListView) rootview.findViewById(R.id.list);

        listView.setAdapter(CatergoryAdapter);

        return rootview;
}
}
