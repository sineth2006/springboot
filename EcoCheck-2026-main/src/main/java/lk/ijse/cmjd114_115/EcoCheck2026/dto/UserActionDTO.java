package lk.ijse.cmjd114_115.EcoCheck2026.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserActionDTO implements Serializable {
    private String userActionId;
    private String quantity;
    private String totalReduction;
    private String completedDate;
    private String userId;
    private String actionId;-cdc
}
