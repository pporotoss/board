package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DetailController", value = "/detail")
public class DetailController extends HttpServlet {
    
    private BoardService boardService = BoardService.getInstance();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String boardId = req.getParameter("boardId");
    
        System.out.println(boardService.getContent(Long.valueOf(boardId)));
        
        req.setAttribute("content", boardService.getContent(Long.valueOf(boardId)));
        
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(PageUtil.getPage("detail"));
        
        requestDispatcher.forward(req, resp);
    }
    
}