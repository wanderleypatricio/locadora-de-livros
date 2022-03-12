package com.br.java.locadora.locadoraLivrosApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.java.locadora.locadoraLivrosApi.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

}
