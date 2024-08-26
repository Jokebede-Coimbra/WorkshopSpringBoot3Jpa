package com.jkbd.course.resources;

import com.jkbd.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(101L, "Jayanne", "jay@gmail.com", "1234567", "1234");
        return ResponseEntity.ok().body(user);
    }
}
