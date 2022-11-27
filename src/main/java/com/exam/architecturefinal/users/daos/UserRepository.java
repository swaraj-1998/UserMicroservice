package com.exam.architecturefinal.users.daos;

import com.exam.architecturefinal.users.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
    User findUserByEmailAndAndPassword(String email, String password);
}
