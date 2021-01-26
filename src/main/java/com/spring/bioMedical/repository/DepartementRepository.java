package com.spring.bioMedical.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.bioMedical.entity.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {

}
