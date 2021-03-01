package dao;

import model.Login;
import model.Note;
import model.NoteType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NoteDAO extends BaseDAO implements IBaseDAO<Note> {

    private final String SELECT_ALL = "SELECT note.id, note.title, note.content, note.type_id, note_type.name, note_type.description \n " +
            "FROM note LEFT JOIN note_type ON note.type_id = note_type.id ";
    private final String ADD = "insert into note(title,content,type_id,id_user) values(?,?,?,?)";
    protected final String DELETE_NOTE = "delete from note where id=?";
    private final String SEARCH = "SELECT note.id, note.title, note.content, note.type_id, note_type.name, note_type.description \n " +
            "FROM note LEFT JOIN note_type ON note.type_id = note_type.id where note.id =?";

    private final String update_note = "UPDATE note\n" +
            "SET title=?, content=?,type_id=?\n" +
            "WHERE id=? ";

    private static final String FINDBYUP_SQL = "SELECT * FROM users WHERE username=? AND password=?";
    private final String SELECTBY_USER_ID = "SELECT note.id, note.title, note.content, note.type_id, note_type.name, " +
            "note_type.description FROM note LEFT JOIN note_type ON note.type_id = note_type.id where id_user=?";


    @Override
    public List<Note> selectAll() throws SQLException {
        List<Note> list = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
             ResultSet rs = statement.executeQuery();
        ) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                int type_id = rs.getInt("type_id");
                String name = rs.getString("name");
                String description = rs.getString("description");

                NoteType noteType = new NoteType(type_id, name, description);
                Note note = new Note(id, title, content, noteType);
                list.add(note);
            }
        }
        return list;
    }

    public List<Note> selectByUserID(int userId) throws SQLException {
        List<Note> list = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(SELECTBY_USER_ID);

        ) {
            statement.setInt(1, userId);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                int type_id = rs.getInt("type_id");
                String name = rs.getString("name");
                String description = rs.getString("description");

                NoteType noteType = new NoteType(type_id, name, description);
                Note note = new Note(id, title, content, noteType);
                list.add(note);
            }
        }
        return list;
    }

    @Override
    public void insert(Note note) throws SQLException {
        try
                (Connection connection = getConnection();
                 PreparedStatement statement = connection.prepareStatement(ADD)
                ) {
            statement.setString(1, note.getTitle());
            statement.setString(2, note.getContent());
            statement.setInt(3, note.getNoteType().getId());
            statement.setInt(4, note.getLogin().getId());
            statement.executeUpdate();
        }

    }

    @Override
    public Note findById(int searchId) throws SQLException {
        Note notes = null;
        try (
                Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(SEARCH)
        ) {
            statement.setInt(1, searchId);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String title = rs.getString("title");
                String content = rs.getString("content");
                int type_id = rs.getInt("type_id");
                String name = rs.getString("name");
                String description = rs.getString("description");

                NoteType noteType = new NoteType(type_id, name, description);
                notes = new Note(searchId, title, content, noteType);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return notes;
    }

    @Override
    public void delete(int id) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_NOTE)
        ) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void update(Note note) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement statements = connection.prepareStatement(update_note);
        ) {
            statements.setString(1, note.getTitle());
            statements.setString(2, note.getContent());
            statements.setInt(3, note.getNoteType().getId());

            statements.executeUpdate();
        }
    }


}
