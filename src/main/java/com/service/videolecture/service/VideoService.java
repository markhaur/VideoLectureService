package com.service.videolecture.service;

import com.service.videolecture.model.dto.VideoListDto;
import org.springframework.stereotype.Service;

@Service
public interface VideoService {

    VideoListDto getAllVideos(String emailId);
}
