package com.service.videolecture.service;

import com.service.videolecture.apiclient.StudentApiClient;
import com.service.videolecture.model.data.Video;
import com.service.videolecture.model.dto.Response;
import com.service.videolecture.model.dto.VideoListDto;
import com.service.videolecture.repository.VideoRepository;
import com.service.videolecture.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService{

    @Autowired
    private VideoRepository videoRepository;
    private StudentApiClient studentApiClient = new StudentApiClient();

    @Override
    public VideoListDto getAllVideos(String emailId) {
        boolean isValidated = studentApiClient.validateStudent(emailId);
        if(!isValidated)
            return new VideoListDto(new Response(ResponseUtils.ERROR_CODE, ResponseUtils.VALIDATION_FAILED), null);
        List<Video> videoList = videoRepository.findAll();
        videoList.forEach(video -> {
            video.setLink(video.getLink().replace("watch", "embed").replace("?v=", "/"));
        });
        Response response = new Response(ResponseUtils.SUCCESS_CODE, ResponseUtils.SUCCESS_DESC);
        return new VideoListDto(response, videoList);
    }
}
