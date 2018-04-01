package com.example;

public class PageUtil {
    
    private static final String DEFAULT_PATH = "/WEB-INF/views";
    
    public static String getPage(String page) {
        
        return getPage(DEFAULT_PATH, page);
    }
    
    public static String getPage(String path, String pageName) {
        
        if(!path.startsWith("/")) {
            path = "/" + path;
        }
        
        if(!(path.endsWith("/") || pageName.startsWith("/")) ) {
            path += "/";
        }
        
        if(!pageName.endsWith(".jsp")) {
            pageName += ".jsp";
        }
        
        return path + pageName;
    }
    
}
