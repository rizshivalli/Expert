package com.example.princ.expert.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.princ.expert.ETweets;
import com.example.princ.expert.MyAdapter;
import com.example.princ.expert.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExpertTweets extends Fragment {
    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private ArrayList<ETweets> tweetsList = new ArrayList<>();
    private CardView cardView;
    public ExpertTweets() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_expert, container, false);

        recyclerView=(RecyclerView) rootView.findViewById(R.id.rView);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        myAdapter = new MyAdapter(tweetsList, getActivity());
        recyclerView.setAdapter(myAdapter);
        prepareData();
return rootView;
    }

    private void prepareData() {

ETweets ET = new ETweets("Rizwan","Student","10 Likes","5 Comments","10 Minutes ago","Hi this is testing",R.drawable.index);
      tweetsList.add(ET);
      ET = new ETweets("Rizwan","Student","10 Likes","5 Comments","10 Minutes ago","Hi this is testing",R.drawable.index);
        tweetsList.add(ET);
        ET = new ETweets("Rizwan","Student","10 Likes","5 Comments","10 Minutes ago","Hi this is testing",R.drawable.index);
        tweetsList.add(ET);
    }


}
