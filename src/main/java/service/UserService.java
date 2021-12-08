package service;

import model.User;
import repository.hibernate.UserRepositoryImpl;

import java.util.List;

/**
 * @author Nikita Gvardeev
 * 07.12.2021
 */
public class UserService {

    private final UserRepositoryImpl userRepository;

    public UserService() {
        userRepository = new UserRepositoryImpl();
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User getById(Long id) {
        return userRepository.getById(id);
    }

    public User getByUserName(String name) {
        return userRepository.getByUserName(name);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void update(User user) {
        userRepository.update(user);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}