package com.mat.academyproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mat.academyproject.model.Corso;

@Repository("corsoRepository")
public interface CorsoRepositry extends JpaRepository<Corso, Long>{
	@Query(value = "Select c from Corso c Join c.corsisti corsista Group by c.codCorso Order by Count(corsista)DESC")
	Corso findCorsopiuFrequentato();
}
