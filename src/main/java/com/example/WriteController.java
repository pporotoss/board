package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "WriteController", value = "/write")
public class WriteController extends HttpServlet {
    
    private BoardService boardService = BoardService.getInstance();
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String title = req.getParameter("title");
        String content =req.getParameter("content");
        
        Content writeContent = new Content();
        writeContent.setName(name);
        writeContent.setTitle(title);
        writeContent.setContent(content);
        writeContent.setRegDate(new Date());
    
        boardService.addContent(writeContent);
        
        resp.sendRedirect("/list");
    }
}
