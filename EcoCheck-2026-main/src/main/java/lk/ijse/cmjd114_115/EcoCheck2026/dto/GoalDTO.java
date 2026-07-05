package lk.ijse.cmjd114_115.EcoCheck2026.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoalDTO {
    private String id;
    private  String title;
    private String targetReduction;
    private String  targetDate;
    private  String status ;
    private  String userId ;
}
