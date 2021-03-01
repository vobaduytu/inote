package controller;

import dao.NoteTypeDAO;
import model.Login;
import model.Note;
import model.NoteType;
import service.NoteService;
import service.NoteTypeService;

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

@WebServlet(name = "NoteServlet", urlPatterns = "/note")
public class NoteServlet extends HttpServlet {
    NoteService noteService = new NoteService();
    NoteTypeService noteTypeService = new NoteTypeService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "insertNote":
                try {
                    insertnote(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case "updateNote":
                updateNote(request, response);
                break;
            case "search":
                try {
                    search(request,response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            default:
                listNote(request, response);
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException, ServletException {
       
        int id = Integer.parseInt(request.getParameter("id"));
        Note note = noteService.findById(id);
        request.setAttribute("note",note);
        RequestDispatcher dispatcher = request.getRequestDispatcher("search.jsp");
        dispatcher.forward(request,response);
    }
    private void updateNote(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        int idNoteType = Integer.parseInt(request.getParameter("noteType"));
        NoteType noteType = new NoteType(idNoteType);
        Note note = new Note(id, title, content, noteType);
        try {
            noteService.update(note);
            request.setAttribute("note", note);
            List<NoteType> list = noteTypeService.selectAll();
            request.setAttribute("listNoteType", list);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        response.sendRedirect(request.getContextPath() + "/note");

    }

    private void insertnote(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        int idNoteType = Integer.parseInt(request.getParameter("NoteType"));

        HttpSession session = request.getSession();
        Login login = (Login) session.getAttribute("user");

        NoteType noteType = new NoteType(idNoteType);
        Note note = new Note(title, content, noteType,login);
            noteService.insert(note);
        request.setAttribute("message","Thêm  moi thanh cong");
        insernote(request, response);
//        response.sendRedirect(request.getContextPath() + "/note");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "insertNote":
                insernote(request, response);
                break;
            case "delete":
                try {
                    deleteNote(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case "updateNote":
                updateForm(request, response);
                break;
            default:
                listNote(request, response);
        }
    }

    private void updateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        try {
            Note note = noteService.findById(id);
            List<NoteType> list = noteTypeService.selectAll();
            request.setAttribute("note", note);
            request.setAttribute("listNoteType", list);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("update.jsp");
        dispatcher.forward(request, response);
    }



    private void deleteNote(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        noteService.delete(id);
        try {
            List<Note> noteList = noteService.selectAll();
            request.setAttribute("noteList", noteList);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        RequestDispatcher dispatcher=request.getRequestDispatcher("listNote.jsp");
        dispatcher.forward(request,response);

    }

    private void insernote(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<NoteType> list = noteTypeService.selectAll();
            request.setAttribute("listNoteType", list);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("add.jsp");
        requestDispatcher.forward(request, response);

    }

    private void listNote(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();
            Login login = (Login) session.getAttribute("user");

            List<Note> noteList = noteService.selectByUserID(login.getId());
            request.setAttribute("noteList", noteList);
            System.out.println(noteList);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("listNote.jsp");
        dispatcher.forward(request, response);
    }
}
