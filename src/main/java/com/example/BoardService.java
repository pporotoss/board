package com.example;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

import static java.util.Comparator.comparingLong;
import static java.util.stream.Collectors.toList;

public class BoardService {
    
    private static final BoardService boardService = new BoardService();
    
    private Map<Long, Content> contents;
    
    private BoardService() {
        this.contents = new ConcurrentHashMap<>();
    }
    
    public static BoardService getInstance() {
        return boardService;
    }
    
    public boolean addContent(Content content) {
        return this.contents.put(content.getBoardId(), content) != null;
    }
    
    public Content getContent(int boardId) {
        return this.contents.get(boardId);
    }
    
    
    public List<Content> getContents() {
        Set<Long> keys = this.contents.keySet();
    
        List<Content> list = keys.stream().sorted(comparingLong(Long::longValue)).map(key -> this.contents.get(key)).collect(toList());
        
        return list;
    }
    
}
