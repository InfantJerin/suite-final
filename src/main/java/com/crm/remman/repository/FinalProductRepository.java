package com.crm.remman.repository;

import com.crm.remman.model.FinalProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinalProductRepository extends JpaRepository<FinalProduct, Long> {
}