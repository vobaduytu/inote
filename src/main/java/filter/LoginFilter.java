package filter;

import model.Login;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebFilter(filterName = "LoginFilter", urlPatterns = {"/note","/demo","/dashboard","/logout"})
public class LoginFilter implements Filter {

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession();
        Login login = (Login) session.getAttribute("user");

        if (login == null) {
            request.setAttribute("mess","Nhập sai");
            ((HttpServletResponse) resp).sendRedirect("/login");
        } else {
            chain.doFilter(req, resp);
        }
    }
}
