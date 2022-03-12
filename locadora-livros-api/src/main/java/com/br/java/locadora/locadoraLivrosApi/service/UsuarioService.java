package com.br.java.locadora.locadoraLivrosApi.service;

import com.br.java.locadora.locadoraLivrosApi.entity.Usuario;
import com.br.java.locadora.locadoraLivrosApi.repo.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService{
	
	@Autowired
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Optional<Usuario> getUserById(Long id) {
        return usuarioRepository.findById(id);
    }

    public List<Usuario> getAllUsers() {
        return usuarioRepository.findAll();
    }

    public Usuario createUser(Usuario user) {
        return usuarioRepository.save(user);
    }

    public Usuario updateUser(Usuario user) {
        return usuarioRepository.save(user);
    }

    public void deleteUser(Long userId) {
    	usuarioRepository.deleteById(userId);
    }

}
