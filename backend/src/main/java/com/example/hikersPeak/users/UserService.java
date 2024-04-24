package com.example.hikersPeak.users;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) { this.userRepository = userRepository; }

    public void saveData(Users users) {
        userRepository.save(users);
    }


}
