package com.example.abe.tipicpam;

import java.util.ArrayList;


public class InstagramPhoto {
    public String username;
    public String userPicUrl;
    public String caption;
    public String imageUrl;
    public String location;
    public int likeCount;
    public int imageHeight;
    public int imageWidth;
    public long createdTime;
    public int commentsCount;
    public ArrayList<InstagramComment> comments = new ArrayList<>();
}
