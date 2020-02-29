package com.service.videolecture.repository;

import com.service.videolecture.model.data.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {

    List<Video> findAll();

    Video findVideoById(Integer id);
}
