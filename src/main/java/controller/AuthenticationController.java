package controller;

import model.Login;
import service.LoginServive;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet(name = "AuthenticationController", urlPatterns = "/login")
public class AuthenticationController extends HttpServlet {

     LoginServive loginServive = new LoginServive();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("email");
        String password = request.getParameter("password");
        Login login = loginServive.findByUsernamePassword(username,password);
        if (login != null){
            HttpSession session = request.getSession();
            session.setAttribute("user", login);
            response.sendRedirect("/dashboard");
        }else {
            request.setAttribute("message","Username, password could wrong, pls try again!");
            showLogin(request,response);
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "login";
        switch (action) {
            case "login":
                showLogin(request, response);
                break;
            case "logout":
                showLogout(request,response);
                break;
        }
    }
    private void showLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.jsp");
        requestDispatcher.forward(request, response);
    }
    private void showLogout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //XOA HET CAC SESSION DE TRA VE LOGIN
        session.invalidate();
        RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
        rd.forward(request, response);
    }
}