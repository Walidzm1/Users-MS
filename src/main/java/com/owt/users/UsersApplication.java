package com.owt.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.owt.users.service.UserService;

@SpringBootApplication
public class UsersApplication {

    @Autowired
    UserService userService;
    public static void main(String[] args) {
        SpringApplication.run(UsersApplication.class, args);
    }

    /*
    @PostConstruct void init_users() {
         //ajouter les rôles
        userService.addRole(new Role(null,"ADMIN"));
        userService.addRole(new Role(null,"USER"));

        // ajouter les users
        userService.saveUser(new User(null,"admin","123",true,null));
        userService.saveUser(new User(null,"walid","123",true,null));
        userService.saveUser(new User(null,"didou","123",true,null));

         // ajouter les rôles aux users
        userService.addRoleToUser("admin", "ADMIN");
        userService.addRoleToUser("admin", "USER");
        userService.addRoleToUser("walid", "USER");
        userService.addRoleToUser("didou", "USER");
    }
    */


    @Bean
    BCryptPasswordEncoder getBCE() {
        return new BCryptPasswordEncoder();

    }
}
