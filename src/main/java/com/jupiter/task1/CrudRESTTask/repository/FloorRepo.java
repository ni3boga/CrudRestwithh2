package com.jupiter.task1.CrudRESTTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jupiter.task1.CrudRESTTask.model.Floormaster;

public interface FloorRepo extends JpaRepository<Floormaster, Long>{

}
