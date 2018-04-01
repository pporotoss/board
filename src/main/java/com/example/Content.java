package com.example;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class Content implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private static final AtomicLong atomicLong = new AtomicLong(0);
    
    private Long boardId;
    private String name;
    private String title;
    private String content;
    private Date regDate;
    
    public Content() {
        boardId = atomicLong.incrementAndGet();
    }
    
    
    @Override
    public String toString() {
        return "Content{" +
                "boardId=" + boardId +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", regDate=" + regDate +
                '}';
    }
    
    public Long getBoardId() {
        return boardId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public Date getRegDate() {
        return regDate;
    }
    
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
