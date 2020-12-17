package com.api.rest.domain.repository;


import com.api.rest.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    List<User> getAll();
    Optional<List<User>> getByUserId(String userId);
    User save(User user);
}
