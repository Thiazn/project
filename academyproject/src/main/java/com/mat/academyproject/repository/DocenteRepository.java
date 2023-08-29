package com.mat.academyproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mat.academyproject.model.Docente;

@Repository("docenteRepository")
public interface DocenteRepository extends JpaRepository<Docente, Long>{

}
