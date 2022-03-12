package com.br.java.locadora.locadoraLivrosApi.utils;

import com.br.java.locadora.locadoraLivrosApi.entity.Usuario;

import java.util.Random;
import java.util.UUID;

import static java.lang.String.format;

public class TestHelper {
    public static Usuario buildUser() {
        String uuid = UUID.randomUUID().toString();
        /*return ((Object) User.builder())
                .name("name-"+uuid)
                .email(format("someone-%s@gmail.com", uuid))
                .build();*/
        
        return null;
    }

    public static Usuario buildUserWithId() {
        Random random = new Random();
        String uuid = UUID.randomUUID().toString();
        /*return User.builder()
                .id(random.nextLong())
                .name("name-"+uuid)
                .email(format("someone-%s@gmail.com", uuid))
                .build();*/
        
        return null;
    }
}
