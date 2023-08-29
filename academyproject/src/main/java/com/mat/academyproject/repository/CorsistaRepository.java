package com.mat.academyproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mat.academyproject.model.Corsista;

@Repository("corsistaRepository")
public interface CorsistaRepository extends JpaRepository<Corsista, Long>{
	@Query(value = "Select c from Corsista c JOIN c.corsi corso where corso.codCorso = c.codCorso")
	List<Corsista> findByCodCorso(@Param("codCorso")Long codCorso);
}
