package service;

import dao.NoteDAO;
import model.Note;

import java.sql.SQLException;
import java.util.List;

public class NoteService implements IBaseService<Note>{

    NoteDAO noteDAO = new NoteDAO();

    @Override
    public List<Note> selectAll() throws SQLException {
        return noteDAO.selectAll();
    }

    @Override
    public void insert(Note note) throws SQLException {
       noteDAO.insert(note);
    }

    @Override
    public Note findById(int id) throws SQLException {
        return noteDAO.findById(id);
    }

    @Override
    public void delete(int id) throws SQLException {
           noteDAO.delete(id);
    }

    @Override
    public void update(Note note) throws SQLException {
        noteDAO.update(note);
    }
    public List<Note> selectByUserID(int userID) throws SQLException {
        return noteDAO.selectByUserID(userID);
    }
}
