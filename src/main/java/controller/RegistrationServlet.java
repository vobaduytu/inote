package controller;

import model.Login;
import model.Note;
import model.NoteType;
import service.LoginServive;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "RegistrationServlet", urlPatterns = "/addUser")
public class RegistrationServlet extends HttpServlet {
    LoginServive loginServive = new LoginServive();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String password = request.getParameter("password");
        String fullname = request.getParameter("fullname");
        Login login = new Login(fullname, password);
        loginServive.addUser(login);
        request.setAttribute("message", "Thêm  moi thanh cong");
        doGet(request, response);
//        response.sendRedirect(request.getContextPath() + "/note");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("player.jsp");
        requestDispatcher.forward(request, response);

    }
}
