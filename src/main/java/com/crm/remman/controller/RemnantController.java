package com.crm.remman.controller;

import com.crm.remman.model.Remnant;
import com.crm.remman.service.RemnantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders/{orderID}/remnants")
public class RemnantController {

    @Autowired
    private RemnantService remnantService;

    @GetMapping("")
    public List<Remnant> getRemnantsForOrderID(@PathVariable Long orderID) {
        List<Remnant> remnants = remnantService.getRemnantsForOrderID(orderID);
        return remnants;
    }
}