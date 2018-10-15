package com.sa.opsift.repository;



import com.sa.opsift.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Authur : sujitagarwal
 * Created: 09/10/18.
 */
public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findAll();
}
