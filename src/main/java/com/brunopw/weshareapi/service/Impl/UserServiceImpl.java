package com.brunopw.weshareapi.service.Impl;

import com.brunopw.weshareapi.model.User;
import com.brunopw.weshareapi.repository.UserRepository;
import com.brunopw.weshareapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public Optional<User> update(Long id, User details) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setUsername(details.getUsername());
                    user.setPassword(details.getPassword());
                    user.setName(details.getName());
                    user.setPhoto(details.getPhoto());
                    user.setPassport(details.getPassport());
                    user.setPhoneNumber(details.getPhoneNumber());
                    user.setBirthday(details.getBirthday());
                    user.setUserType(details.getUserType());

                    return userRepository.save(user);
                });
                // .orElseGet(() -> {
                //     details.setId(id);
                //     return userRepository.save(details);
                // });
    }
}
