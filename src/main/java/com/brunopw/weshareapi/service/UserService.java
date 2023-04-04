package com.brunopw.weshareapi.service;

import com.brunopw.weshareapi.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long userId);

    User create(User user);

    void delete(Long userId);

    Optional<User> update(Long id, User details);
}
