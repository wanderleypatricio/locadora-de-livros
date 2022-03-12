package com.br.java.locadora.locadoraLivrosApi.web.controller;

import com.br.java.locadora.locadoraLivrosApi.entity.Usuario;
import com.br.java.locadora.locadoraLivrosApi.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/users")
@Slf4j
public class UsuarioController {
	
	@Autowired
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService userService) {
        this.usuarioService = userService;
    }

    @GetMapping("")
    public List<Usuario> getUsers() {
        return usuarioService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUser(@PathVariable Long id) {
        Optional<Usuario> user = usuarioService.getUserById(id);
        return user.map( u -> ResponseEntity.ok(u))
                   .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("")
    @ResponseStatus(CREATED)
    public Usuario createUser(@RequestBody Usuario user) {
        return usuarioService.createUser(user);
    }

    @PutMapping("/{id}")
    public Usuario updateUser(@PathVariable Long id, @RequestBody Usuario user) {
        user.setId(id);
        return usuarioService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        usuarioService.deleteUser(id);
    }

}
