package controller;

import model.User;
import service.UserService;

import java.util.List;

/**
 * @author Nikita Gvardeev
 * 07.12.2021
 */
public class UserController {

    private final UserService userService;

    public UserController() {
        userService = new UserService();
    }

    public List<User> findAll() {
        return userService.findAll();
    }

    public User getById(Long id) {
        return userService.getById(id);
    }

    public User getByUserName(String name) {
        return userService.getByUserName(name);
    }

    public User save(User user) {
        return userService.save(user);
    }

    public void update(User user) {
        userService.update(user);
    }

    public void delete(Long id) {
        userService.deleteById(id);
    }

}