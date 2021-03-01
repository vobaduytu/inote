package filter;

import model.AdminLogin;
import model.Login;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "ADMINFilter",urlPatterns = "/adminlogin")
public class ADMINFilter implements Filter {


    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession();
        AdminLogin login = (AdminLogin) session.getAttribute("user");

        if (login == null) {
            request.setAttribute("mess","Nhập sai");
            ((HttpServletResponse) resp).sendRedirect("/adminlogin1");
        } else {
            chain.doFilter(req, resp);
        }
    }


}


