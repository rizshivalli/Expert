package com.example.princ.expert;

public class ETweets {
    private String  expertName, expertDesignation,tweetLikes,tweetComments, tweetTime, mainTweet;
    private int image;

    public ETweets(String expertName, String expertDesignation, String tweetLikes, String tweetComments, String tweetTime, String mainTweet, int image) {
        this.expertName = expertName;
        this.expertDesignation = expertDesignation;
        this.tweetLikes = tweetLikes;
        this.tweetComments = tweetComments;
        this.tweetTime = tweetTime;
        this.mainTweet = mainTweet;
        this.image = image;
    }

    public String getExpertName() {
        return expertName;
    }

    public void setExpertName(String expertName) {
        this.expertName = expertName;
    }

    public String getExpertDesignation() {
        return expertDesignation;
    }

    public void setExpertDesignation(String expertDesignation) {
        this.expertDesignation = expertDesignation;
    }

    public String getTweetLikes() {
        return tweetLikes;
    }

    public void setTweetLikes(String tweetLikes) {
        this.tweetLikes = tweetLikes;
    }

    public String getTweetComments() {
        return tweetComments;
    }

    public void setTweetComments(String tweetComments) {
        this.tweetComments = tweetComments;
    }

    public String getTweetTime() {
        return tweetTime;
    }

    public void setTweetTime(String tweetTime) {
        this.tweetTime = tweetTime;
    }

    public String getMainTweet() {
        return mainTweet;
    }

    public void setMainTweet(String mainTweet) {
        this.mainTweet = mainTweet;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
