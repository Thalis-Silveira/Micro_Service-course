package com.silbezthcorporation.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silbezthcorporation.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
	
	
	
}
