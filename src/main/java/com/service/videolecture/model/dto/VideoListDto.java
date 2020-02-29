package com.service.videolecture.model.dto;

import com.service.videolecture.model.data.Video;

import java.util.List;

public class VideoListDto {

    private Response response;

    private List<Video> videoList;

    public VideoListDto(Response response, List<Video> videoList) {
        this.response = response;
        this.videoList = videoList;
    }

    public VideoListDto(){}

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public List<Video> getVideoList() {
        return videoList;
    }

    public void setVideoList(List<Video> videoList) {
        this.videoList = videoList;
    }
}
