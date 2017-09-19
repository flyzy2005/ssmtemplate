package cn.edu.whu.common.pojo;

import java.util.Date;

public class Book {
    private Long id;

    private String name;

    private String author;

    private String publisher;

    private Date time;

    private byte[] large;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public byte[] getLarge() {
        return large;
    }

    public void setLarge(byte[] large) {
        this.large = large;
    }
}