package controller;

import model.Login;
import model.Note;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AdminServlet" , urlPatterns = "/adminl")
public class AdminServlet extends HttpServlet {
    UserService userService = new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            default:
                listNote(request, response);
        }
    }

    private void listNote(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         List<Login> loginList = userService.findAll();
        request.setAttribute("loginList", loginList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("admin.jsp");
        dispatcher.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {

            case "delete":
                deleteNote(request, response);
                break;
            case "selectlogin":
                selectlogin(request,response);
            break;
            default:
                listNote(request, response);
        }
    }

    private void selectlogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        List<Note> loginList = userService.selectlogin(id);
        request.setAttribute("noteList", loginList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listNote.jsp");
        dispatcher.forward(request, response);
    }


    private void deleteNote(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        userService.deletelogin(id);
        response.sendRedirect(request.getContextPath() + "/adminl");
    }
}
