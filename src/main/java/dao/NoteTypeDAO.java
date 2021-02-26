package dao;

import model.Note;
import model.NoteType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NoteTypeDAO extends BaseDAO implements IBaseDAO<NoteType> {
    private final String SELECT_ALL = "Select * from note_type";
    public List<NoteType> selectAll() throws SQLException {
        List<NoteType> noteTypeList = new ArrayList<>();
      try
              (
                      Connection connection = getConnection();
                      PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
                      ResultSet rs = statement.executeQuery();
                      ){
             while (rs.next()){
                 int id = rs.getInt("id");
                 String name = rs.getString("name");
                 String description = rs.getString("description");

                 NoteType noteType = new NoteType(id, name, description);
                 noteTypeList.add(noteType);
             }
      }
      return noteTypeList;
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
