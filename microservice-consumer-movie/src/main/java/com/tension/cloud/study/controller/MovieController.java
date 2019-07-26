package com.tension.cloud.study.controller;

import com.tension.cloud.study.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangli
 */
@RequestMapping("/movies")
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

//    @GetMapping("/users/{id}")
//    public User findById(@PathVariable Long id) {
//        return restTemplate().getForObject("http://localhost:8080/users/{id}", User.class, id);
//    }

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://microservice-provider-user/users/{id}", User.class, id);
    }
}
