package com.user_service.controller;

import com.user_service.entity.User;
import com.user_service.service.Saving;
import com.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/userid/{id}")
    public User getUserId(@PathVariable("id") int id) {
        User user = this.userService.getUser(id);
        List co = this.restTemplate.getForObject("http://contact-service/contact/" + id, List.class);
        System.out.println(co);
        user.setContacts(co);
        return user;
        // return this.userService.getUser(id);
    }

    @Autowired
    private Saving saving;

    @PostMapping("/save")
    public User save(@RequestBody User user) {
        this.saving.save(user);
        return user;
    }
}
