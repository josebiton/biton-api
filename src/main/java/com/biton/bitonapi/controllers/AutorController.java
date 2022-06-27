package com.biton.bitonapi.controllers;

import com.biton.bitonapi.entity.Autor;
import com.biton.bitonapi.service.AutorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/autor")
@Api(value = "Gestion de Autores", description = "crud de autores")
public class AutorController {

    @Autowired
    private AutorService service;

    @ApiOperation(value = "lista de autores")
    @GetMapping
    public ResponseEntity<List<Autor>> findAll(@RequestParam(name = "nombre",required = false)String nombre){

        List<Autor> autors = new ArrayList<>();

        if(nombre==null){
            autors=service.findAll();
            if(autors.isEmpty())
                return ResponseEntity.noContent().build();
        }else {
            autors = (List<Autor>) service.findByNombres(nombre);
            if(autors.isEmpty())
                return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(autors);
    }
    @ApiOperation(value = "buscar por id")
    @GetMapping("/{id}")
    public Autor findById(@PathVariable Integer id){
        return service.findById(id);
    }


}
