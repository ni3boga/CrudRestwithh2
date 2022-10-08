package com.jupiter.task1.CrudRESTTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jupiter.task1.CrudRESTTask.model.OfficeMaster;

public interface OfficeRepo extends JpaRepository<OfficeMaster, Long>{

}
