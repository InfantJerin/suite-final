package com.crm.remman.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ManufacturingUnit")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManufacturingUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long manufacturingUnitID;
    private String name;
    private String address;
    private String contactNumber;
}