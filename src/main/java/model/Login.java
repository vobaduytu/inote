package model;

public class Login {

    private int id;
    private String username;
    private String password;
    private String fullname;
    private int status;
    private boolean is_deleted;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public boolean isIs_deleted() {
        return is_deleted;
    }
    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }
    //Constructor


    public Login(int id, String fullname, String password) {
        this.id = id;
        this.fullname = fullname;
        this.password = password;

    }

    public Login(String password, String fullname, int status, boolean is_deleted) {
        this.password = password;
        this.fullname = fullname;
        this.status = status;
        this.is_deleted = is_deleted;
    }

    public Login(String password, String fullname) {
        this.password = password;
        this.fullname = fullname;
    }

}
