package com.soo.day0start.swagar.springswagger;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/api/hello")
    public String getHello(){
        return "hey how are you.!!!";
    }

    @PostMapping("/api/post")
    public String setPost(@RequestBody String message){
        return message;
    }
}
