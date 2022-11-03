package com.owt.users.service;

import com.owt.users.model.User;
import com.owt.users.model.Role;

public interface UserService {

    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
}
