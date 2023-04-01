package com.crm.remman.service;

import com.crm.remman.model.Remnant;
import com.crm.remman.repository.RemnantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemnantService {

    @Autowired
    private RemnantRepository remnantRepository;

    public List<Remnant> getRemnantsForOrderID(Long orderID) {
        List<Remnant> remnants = remnantRepository.findByCustomerOrderOrderID(orderID);
        return remnants;
    }
}