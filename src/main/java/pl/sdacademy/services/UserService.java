package pl.sdacademy.services;


import org.springframework.stereotype.Service;
import pl.sdacademy.entities.User;
import pl.sdacademy.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final  UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public User getUserByEmail(String email) {
        return userRepository.getUserByEmail(email).orElse(null);
    }
}
