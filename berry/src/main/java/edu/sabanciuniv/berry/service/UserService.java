package edu.sabanciuniv.berry.service;

import edu.sabanciuniv.berry.domain.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);

}
