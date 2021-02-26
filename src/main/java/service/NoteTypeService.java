package service;

import dao.NoteTypeDAO;
import model.NoteType;

import java.sql.SQLException;
import java.util.List;

public class NoteTypeService implements IBaseService<NoteType> {
    NoteTypeDAO noteTypeDAO = new NoteTypeDAO();
    @Override
    public List<NoteType> selectAll() throws SQLException {
        return noteTypeDAO.selectAll();
    }

    @Override
    public void insert(NoteType noteType) throws SQLException {

    }

    @Override
    public NoteType findById(int id) throws SQLException {
        return null;
    }

    @Override
    public void delete(int id) throws SQLException {

    }

    @Override
    public void update(NoteType noteType) throws SQLException {

    }
}
