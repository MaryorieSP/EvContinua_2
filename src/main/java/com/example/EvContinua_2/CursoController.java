package com.example.EvContinua_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/api/curso")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping(path = "/listar")
    public @ResponseBody Iterable<Curso> getAllCurso(){
        return cursoRepository.findAll();
    }

    @PostMapping(path="/nuevo")
    public @ResponseBody String addNewCurso(@RequestParam String nombre,@RequestParam Integer creditos){
        Curso c = new Curso();
        c.setNombre(nombre);
        c.setCreditos(creditos);
        cursoRepository.save(c);
        return "Guardado";
    }

    @DeleteMapping(path = "/eliminar")
    public @ResponseBody String delCurso (@RequestParam Integer id){
        Curso c = new Curso();
        c.setId(id);
        cursoRepository.delete(c);
        return "Eliminado";
    }
    
}
