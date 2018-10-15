package com.sa.opsift.service.impl;


import com.sa.opsift.entity.User;
import com.sa.opsift.repository.UserRepository;
import com.sa.opsift.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Authur : sujitagarwal
 * Created: 09/10/18.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

}
