package com.example.princ.expert;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<ETweets> tweetsList;
    private Context context;

    public MyAdapter(ArrayList<ETweets> tweetsList, Context context) {
        this.tweetsList = tweetsList;
        this.context = context;
    }

    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.experts_tweets_card,parent, false);
        return new ViewHolder(itemView);
    }


    public void onBindViewHolder( MyAdapter.ViewHolder holder, int position) {
        ETweets row = tweetsList.get(position);
        holder.expertName.setText(row.getExpertName());
        holder.expertDesignation.setText(row.getExpertDesignation());
        holder.tweetLikes.setText(row.getTweetLikes());
        holder.tweetComments.setText(row.getTweetComments());
        holder.tweetTime.setText(row.getTweetTime());
        holder.mainTweet.setText(row.getMainTweet());
    }

    @Override
    public int getItemCount() {
        return tweetsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CircleImageView circleImageView;

        public TextView expertName, expertDesignation,tweetLikes,tweetComments, tweetTime, mainTweet;
        public ViewHolder(View itemView) {
            super(itemView);

            circleImageView= itemView.findViewById(R.id.profileImage);

            expertName = itemView.findViewById(R.id.expertName);
            expertDesignation = itemView.findViewById(R.id.expertDesignaton);
            tweetTime = itemView.findViewById(R.id.tweetTime);
            mainTweet = itemView.findViewById(R.id.mainTweet);
            tweetLikes = itemView.findViewById(R.id.likesCount);
            tweetComments = itemView.findViewById(R.id.commentCount);
        }
    }

    public MyAdapter(ArrayList<ETweets> tweetsList, FragmentActivity activity) { this.tweetsList = tweetsList; }


}
