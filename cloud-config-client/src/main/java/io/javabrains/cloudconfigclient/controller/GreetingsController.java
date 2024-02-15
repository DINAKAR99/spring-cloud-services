package io.javabrains.cloudconfigclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingsController {
    @Value("${my.greeting}")
    private String greet;
    @Value("${my.list.values}")
    private List<String> list;
    @Autowired
    Dbsetting dbsetting;

    @GetMapping("/greeting")
    public String greetings() {

        return (greet + dbsetting);

    }

    @GetMapping("/list")
    public List<String> greeting() {

        return list;

    }

}
