package com.crm.remman.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "Remnant")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Remnant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long remnantID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rawMaterialID")
    private RawMaterial rawMaterial;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manufacturingUnitID")
    private ManufacturingUnit manufacturingUnit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderID")
    private CustomerOrder customerOrder;

    private String type;
    private Double quantity;
    private String unit;
}