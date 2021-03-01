package service;

import dao.BaseDAO;
import model.Login;
import model.Note;
import model.NoteType;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UserService implements BaseService<Login> {
  BaseDAO baseDAO = new BaseDAO();
    private final String FINDALL_SQL="SELECT * FROM login";
    private final String FINDBYID_SQL="SELECT * FROM login WHERE id=?";
    private final String FINDBYUP_SQL= "SELECT * FROM login WHERE fullname=? AND pass=?";
    private final String SAVE_SQL="INSERT INTO login(pass,fullname) VALUES(?,?)";
    private final String UPDATE_SQL="UPDATE login SET pass=?,fullname=? WHERE id=?";
    private final String DELETE_SQL="DELETE FROM login WHERE id=?";

    private final String SELECTBY_USER_ID ="call deleteLogin(?)";
    private final String SELECT_LOGIN="call inotes.select_login(?)";

    @Override
    public List<Login> findAll() {
        // TODO Auto-generated method stub

        List<Login> rt = new ArrayList<>();


        try (Connection connection = baseDAO.getConnection();
           PreparedStatement st = connection.prepareStatement(FINDALL_SQL)) {

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String fullname = rs.getString("fullname");
                String password = rs.getString("pass");
              Login login = new Login(id,fullname,password);
              rt.add(login);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return rt;
    }

    @Override
    public Login findById(int id) {
        // TODO Auto-generated method stub
        Login login =null;

        try (Connection connection = baseDAO.getConnection();
             PreparedStatement st = connection.prepareStatement(FINDBYID_SQL)) {
            //THIET LAP THAM SO
            st.setInt(1, id);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                String fullname = rs.getString("fullname");
                String username = rs.getString("username");
                login = new Login(id,username,fullname);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return login;
    }




    public Login findByUsernamePassword(String username, String password) {
        Login login = null;
        try (Connection connection = baseDAO.getConnection();
             PreparedStatement st = connection.prepareStatement(this.FINDBYUP_SQL)) {
            //THIET LAP THAM SO
            st.setString(1, username);
            st.setString(2,password);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String fullname = rs.getString("fullname");
                int id = rs.getInt("id");
                login = new Login(id,username,fullname);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return login;
    }


    @Override
    public void save(Login object) {
        // TODO Auto-generated method stub
        try (Connection connection = baseDAO.getConnection();
             PreparedStatement st = connection.prepareStatement(this.SAVE_SQL)) {
            //THIET LAP THAM SO
            st.setString(2, object.getPassword());
            st.setString(1, object.getFullname());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Login object) {
        // TODO Auto-generated method stub
        try (Connection connection = baseDAO.getConnection();
             PreparedStatement st = connection.prepareStatement(this.UPDATE_SQL)) {
            //THIET LAP THAM SO
            st.setString(1, object.getUsername());
            st.setString(2, object.getFullname());
            st.setInt(3, object.getId());

            st.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        try (Connection connection = baseDAO.getConnection();
             PreparedStatement st = connection.prepareStatement(this.DELETE_SQL)) {
            st.setInt(1, id);

            st.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
        public void deletelogin(int id) {
            // TODO Auto-generated method stub
            try (Connection connection =baseDAO.getConnection();
                 CallableStatement st = connection.prepareCall(this.SELECTBY_USER_ID)) {
                st.setInt(1,id );
                st.executeUpdate();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }

    public List<Note> selectlogin(int iddata) {
        List<Note> rt = new ArrayList<>();
        try (Connection connection = baseDAO.getConnection();
             CallableStatement st = connection.prepareCall(this.SELECT_LOGIN)) {
            st.setInt(1,iddata );
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                int type_id = rs.getInt("type_id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                NoteType noteType = new NoteType(type_id,name,description);
                Note note = new Note(id, title, content, noteType);
                rt.add(note);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return rt;
    }

}