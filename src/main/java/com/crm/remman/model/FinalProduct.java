package com.crm.remman.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "FinalProduct")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FinalProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manufacturingUnitID")
    private ManufacturingUnit manufacturingUnit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderID")
    private CustomerOrder customerOrder;

    private String type;
    private String size;
    private Double quantity;
}
