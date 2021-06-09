package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

	@Autowired
	private MedicamentoRepository repository;

	@Override
	public List<Medicamento> listaMedicamento() {
		
		return repository.findAll();
	}

	@Override
	public Medicamento insertaActualizaMedicamento(Medicamento obj) {
		
		return repository.save(obj);
	}

	@Override
	public void eliminaMedicamento(int id) {
		repository.deleteById(id);
	}

	@Override
	public List<Medicamento> listaMedicamentoPorNombreLike(String filtro) {
		return repository.listaMedicamentoPorNombreLike(filtro);
	}

	@Override
	public Optional<Medicamento> obtienePorId(int idAlumno) {
		return repository.findById(idAlumno);
	}


	

}
