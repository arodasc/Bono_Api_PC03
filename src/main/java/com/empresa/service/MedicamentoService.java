package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {

	public abstract List<Medicamento> listaMedicamento();
	
	public abstract Medicamento insertaActualizaMedicamento(Medicamento obj);
	
	public abstract Optional<Medicamento> obtienePorId(int idMedicamento);
	
	public abstract void eliminaMedicamento(int id);
	
	public abstract List<Medicamento> listaMedicamentoPorNombreLike(String filtro);
	

	
}
