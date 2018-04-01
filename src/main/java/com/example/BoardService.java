package com.example;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import static java.util.Comparator.comparingLong;
import static java.util.stream.Collectors.toList;

public class BoardService {
    
    private static final BoardService boardService = new BoardService();
    private static final String saveName = "board.data";
    private final String savePath;
    
    private Map<Long, Content> contents;
    
    private BoardService() {
        savePath = BoardService.class.getClassLoader().getResource("").getPath();
        this.contents = readSavedData().orElse(new ConcurrentHashMap<>());
    }
    
    public static BoardService getInstance() {
        return boardService;
    }
    
    public boolean addContent(Content content) {
        return this.contents.put(content.getBoardId(), content) != null;
    }
    
    public Content getContent(long boardId) {
        return this.contents.get(boardId);
    }
    
    
    public List<Content> getContents() {
        Set<Long> keys = this.contents.keySet();
    
        List<Content> list = keys.stream().sorted(comparingLong(Long::longValue).reversed()).map(key -> this.contents.get(key)).collect(toList());
        
        return list;
    }
    
    public void save() {
        if(!this.contents.isEmpty()) {
            System.out.println(savePath + "에 저장 시작!!");
            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(savePath+saveName));) {
                outputStream.writeObject(this.contents);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("저장 끝!!!");
        }
    }
    
    private Optional<Map<Long, Content>> readSavedData() {
        File savedFile = new File(savePath+saveName);
        System.out.println(savePath+"에서 읽기 시작!!!");
        Map<Long, Content> savedData = null;
        if(savedFile.exists()) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(savedFile))) {
                savedData = (Map<Long, Content>)objectInputStream.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return Optional.ofNullable(savedData);
    }
    
}
