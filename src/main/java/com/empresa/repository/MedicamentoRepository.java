package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {

	
	@Query("Select a from Medicamento a where nombre like :fil")
	public abstract List<Medicamento> listaMedicamentoPorNombreLike(@Param("fil") String filtro);

	
}
