package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ListController", value = "/list")
public class ListController extends HttpServlet {
    
    private BoardService boardService = BoardService.getInstance();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.setAttribute("list", boardService.getContents());
        
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(PageUtil.getPage("list"));
        
        requestDispatcher.forward(req, resp);
    }
    
}