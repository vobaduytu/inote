package service;

import dao.BaseDAO;
import model.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UserService implements BaseService<Login> {

    private final String FINDALL_SQL="SELECT * FROM login";
    private final String FINDBYID_SQL="SELECT * FROM login WHERE id=?";
    private final String FINDBYUP_SQL= "SELECT * FROM login WHERE fullname=? AND pass=?";
    private final String SAVE_SQL="INSERT INTO login(pass,fullname) VALUES(?,?)";
    private final String UPDATE_SQL="UPDATE login SET pass=?,fullname=? WHERE id=?";
    private final String DELETE_SQL="DELETE FROM login WHERE id=?";

    BaseDAO baseDAO = new BaseDAO();
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
                String username = rs.getString("username");
                rt.add(new Login(id,username,fullname));
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
            st.setString(1, object.getUsername());
            st.setString(2, object.getPassword());
            st.setString(3, object.getFullname());

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
        try (Connection connection =baseDAO.getConnection();
             PreparedStatement st = connection.prepareStatement(this.DELETE_SQL)) {
            //THIET LAP THAM SO

            st.setInt(1,id );

            st.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }



}