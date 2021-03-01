package service;

import model.Login;

import java.util.List;

public class LoginServive implements BaseService<Login> {
   UserService userService = new UserService();
    @Override
    public List<Login> findAll() {
        return userService.findAll();
    }

    @Override
    public Login findById(int id) {
        return userService.findById(id);
    }

    @Override
    public void save(Login object) {
          userService.save(object);
    }

    @Override
    public void update(Login object) {
       userService.update(object);
    }

    @Override
    public void delete(int id) {
    userService.delete(id);
    }
  public Login findByUsernamePassword(String username, String password){
      return  userService.findByUsernamePassword(username,password);

  }
    public void addUser(Login object) {
        userService.save(object);
    }

}
