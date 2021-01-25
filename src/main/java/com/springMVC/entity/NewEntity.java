package com.springMVC.entity;

import javax.persistence.*;

@Entity
@Table(name = "new")
public class NewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "thumbnail")
    private String thumbnail;

    //  columnDefinition cấu hình kiểu dữ liệu cụ thể
    @Column(name = "shortdescription", columnDefinition = "TEXT")
    private String shortDescription;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getContent() {
        return content;
    }
}
