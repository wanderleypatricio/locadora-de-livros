package com.br.java.locadora.locadoraLivrosApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.br.java.locadora.locadoraLivrosApi.entity.Usuario;
import com.br.java.locadora.locadoraLivrosApi.repo.UsuarioRepository;

@Service
public class UsuarioDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("Chegou no userDetails");
		Usuario usuario = usuarioRepository.findUserByLogin(username);
		System.out.println("login do usuario do banco "+usuario.getLogin());
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuário não encontrado");
		}
		
		System.out.println("passou no userDetails");
		return new User(usuario.getLogin(), usuario.getPassword(), usuario.getAuthorities());
	}

}
