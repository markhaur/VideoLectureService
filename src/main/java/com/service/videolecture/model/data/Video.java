package com.service.videolecture.model.data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "video")
public class Video {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "link")
    private String link;

    @Column(name = "created_date")
    private Timestamp created_date;

    public Video(Integer id, String title, String link, Timestamp created_date) {
        this.id = id;
        this.title = title;
        this.link = link;
        this.created_date = created_date;
    }

    public Video(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Timestamp getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Timestamp created_date) {
        this.created_date = created_date;
    }
}
