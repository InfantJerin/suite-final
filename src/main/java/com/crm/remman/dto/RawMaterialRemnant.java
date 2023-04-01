package com.crm.remman.dto;

import com.crm.remman.model.RawMaterial;
import com.crm.remman.model.Remnant;
import lombok.Data;

@Data
public class RawMaterialRemnant {

    private RawMaterial rawMaterial;

    private Double remnant;
}
