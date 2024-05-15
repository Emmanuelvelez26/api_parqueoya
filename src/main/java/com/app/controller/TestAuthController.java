package com.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class TestAuthController {

    @GetMapping("/get")
    public String helloGet(){
        return "ERES ADMINISTRADOR";
    }

    @PostMapping("/post")
    public String helloPost(){
        return "ENVIASTE LA INFORMACION";
    }

    @PutMapping("/put")
    public String helloPut(){
        return "CAMBIASTE LA INFORMACION";
    }

    @DeleteMapping("/delete")
    public String helloDelete(){
        return "BORRASTE LA INFORMACION";
    }

    @PatchMapping("/patch")
    public String helloPatch(){
        return "ACTUALIZADO";
    }
}
