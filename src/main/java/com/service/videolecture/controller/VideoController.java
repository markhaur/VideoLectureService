package com.service.videolecture.controller;

import com.service.videolecture.model.dto.VideoListDto;
import com.service.videolecture.service.VideoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VideoController {

    @Autowired
    private VideoServiceImpl videoService;

    @RequestMapping(path = "/video/{emailId}", method = RequestMethod.GET)
    public VideoListDto getAllVideos(@PathVariable(value = "emailId", required = true) String emailId){
        return videoService.getAllVideos(emailId);
    }
}
