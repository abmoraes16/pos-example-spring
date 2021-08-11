package com.example.dummy.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dummy")
public class DummyController {
    @GetMapping("/")
    public String getHi() {
        return "Hi!";
    }

    @PostMapping("/")
    public Map<String, String> postHi() {
        var map = new HashMap<String, String>();
        map.put("nome", "Emilio");
        map.put("links", "http://localhost:3000/api/dummy/1");

        return map;
    }
}