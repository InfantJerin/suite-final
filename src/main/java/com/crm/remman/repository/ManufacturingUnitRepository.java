package com.crm.remman.repository;

import com.crm.remman.model.ManufacturingUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturingUnitRepository extends JpaRepository<ManufacturingUnit, Long> {
}
