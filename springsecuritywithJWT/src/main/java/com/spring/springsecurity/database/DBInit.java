package com.spring.springsecurity.database;

import com.spring.springsecurity.dao.AuthoritiesRepository;
//import com.spring.springsecurity.dao.RoleRepository;
import com.spring.springsecurity.dao.UserRepository;
import com.spring.springsecurity.model.Authorities;
//import com.spring.springsecurity.model.Role;
import com.spring.springsecurity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBInit implements CommandLineRunner {

    private UserRepository userRepository;
    //private RoleRepository roleRepository;
    private AuthoritiesRepository authoritiesRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public DBInit(UserRepository userRepository, AuthoritiesRepository authoritiesRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        //this.roleRepository = roleRepository;
        this.authoritiesRepository = authoritiesRepository;
        this.passwordEncoder = passwordEncoder;
    }

    //@Autowired
    public DBInit(UserRepository userRepository, AuthoritiesRepository authoritiesRepository) {
        this.userRepository = userRepository;
        //this.roleRepository = roleRepository;
        this.authoritiesRepository = authoritiesRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        /*this.userRepository.deleteAll();
        User admin = new User("mostafa", passwordEncoder.encode("mostafa"), "23", "Cairo", 1);
        //admin.setRoles(this.roleRepository.findAll());
        admin.setAuthorities(this.authoritiesRepository.findAll());
        userRepository.save(admin);

        User manger = new User("ali", passwordEncoder.encode("ali"), "34", "Alex", 1);
        //Role mangerRole = roleRepository.findById(2L).get();
        //Role manger_Role = roleRepository.findById(3L).get();
        Authorities mangerAuthorities = authoritiesRepository.findById(2L).get();
        Authorities manger_Authorities = authoritiesRepository.findById(3L).get();
        Authorities mangerAuthorities3 = authoritiesRepository.findById(5L).get();
        Authorities manger_Authorities4 = authoritiesRepository.findById(6L).get();
        //manger.getRoles().add(mangerRole);
        //manger.getRoles().add(manger_Role);
        manger.getAuthorities().add(mangerAuthorities);
        manger.getAuthorities().add(manger_Authorities);
        manger.getAuthorities().add(mangerAuthorities3);
        manger.getAuthorities().add(manger_Authorities4);
        userRepository.save(manger);

        User user = new User("ahmed", passwordEncoder.encode("ahmed"), "30", "menofia", 1);
        //Role userRole = roleRepository.findById(3L).get();
        Authorities userAuthorities = authoritiesRepository.findById(3L).get();
        Authorities userAuthorities2 = authoritiesRepository.findById(6L).get();
        //user.getRoles().add(userRole);
        //user.getAuthorities().add(userAuthorities);
        user.getAuthorities().add(userAuthorities2);
        userRepository.save(user);*/

        /*User user = this.userRepository.findByUsername("ahmed");
        System.out.println(user.getAddress());*/
    }
}
