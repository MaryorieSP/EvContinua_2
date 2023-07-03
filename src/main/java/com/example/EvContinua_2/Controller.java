package com.example.EvContinua_2;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/")
public class Controller{

    @GetMapping(path="/")
    public String home (){
        return "AT70719936 - Maryorie Sánchez";
    }

    @GetMapping(path="idat/codigo")
    public String codigo(){
        return "AT70719936";
    }

    @GetMapping(path="idat/nombre-completo")
    public String nombre(){
        return "Maryorie Yulissa Sánchez Pérez";
    }

}
