package lk.ijse.cmjd114_115.EcoCheck2026.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.PrimitiveIterator;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClimateActionDTO implements Serializable {

    private String climateActionId;
    private  String title;
    private String description;
    private String estimatedCO2Reduction;
    private  String points;
}
