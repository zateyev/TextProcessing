package com.epam.textprocessing;

import com.epam.textprocessing.entity.Paragraph;
import com.epam.textprocessing.entity.Sentence;
import com.epam.textprocessing.logic.Parser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class OldServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String textString = request.getParameter("text");
        Parser parser = new Parser();
        try {
            Paragraph paragraph = parser.parse(textString, Paragraph.class);

//            HttpSession session = request.getSession();
//            session.setAttribute("text", sentence);
//            response.sendRedirect(request.getContextPath() + "/result.jsp");

            request.setAttribute("text", paragraph);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
            dispatcher.forward(request, response);

        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Hello");
        out.println("World!");
    }
}