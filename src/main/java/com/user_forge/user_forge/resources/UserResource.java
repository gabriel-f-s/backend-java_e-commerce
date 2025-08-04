package com.user_forge.user_forge.resources;

import com.user_forge.user_forge.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Gabriel", "gabriel@gmail.com", "98765-4321", "senha");
        return ResponseEntity.ok(u);
    }
}
