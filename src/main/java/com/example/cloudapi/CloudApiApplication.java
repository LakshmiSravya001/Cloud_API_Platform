package com.example.cloudapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
@RestController
@RequestMapping("/users")
public class CloudApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudApiApplication.class, args);
    }

    private Map<Long, User> userDB = new HashMap<>();
    private AtomicLong counter = new AtomicLong();

    @GetMapping
    public List<User> getAllUsers() {
        return new ArrayList<>(userDB.values());
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        long id = counter.incrementAndGet();
        user.setId(id);
        userDB.put(id, user);
        return user;
    }

    static class User {
        private Long id;
        private String name;
        private String email;
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
    }
}