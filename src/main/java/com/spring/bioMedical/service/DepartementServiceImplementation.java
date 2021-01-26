package com.spring.bioMedical.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.bioMedical.entity.Appointment;
import com.spring.bioMedical.entity.Departement;
import com.spring.bioMedical.repository.DepartementRepository;
@Service
public class DepartementServiceImplementation {
	private DepartementRepository  departementRepository;
	public DepartementServiceImplementation(DepartementRepository obj) {
		departementRepository=obj;
	}
	public void save(Departement dep)
	{
		departementRepository.save(dep);
	}
	public List<Departement> findAll() {
		return departementRepository.findAll();
	}
	 
}
