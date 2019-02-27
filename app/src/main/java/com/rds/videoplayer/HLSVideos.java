package com.rds.videoplayer;

public class HLSVideos {
    String videoUrl;

    public HLSVideos(){

    }

    public HLSVideos(String videoUrl){
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl(){
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl){
        this.videoUrl = videoUrl;
    }
}
