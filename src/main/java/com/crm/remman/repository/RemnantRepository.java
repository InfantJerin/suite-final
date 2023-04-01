package com.crm.remman.repository;

import com.crm.remman.model.Remnant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RemnantRepository extends JpaRepository<Remnant, Long> {
    List<Remnant> findByCustomerOrderOrderID(Long orderID);
}