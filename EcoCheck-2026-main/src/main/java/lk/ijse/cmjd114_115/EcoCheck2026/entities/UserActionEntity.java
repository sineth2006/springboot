package lk.ijse.cmjd114_115.EcoCheck2026.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="user_action")
@Entity
@Builder
public class UserActionEntity implements Serializable {
    @Id
    private String userActionId;
    private String quantity;
    private String totalReduction;
    private String completedDate;

    @ManyToOne
    @JoinColumn(name = "climate_action_id")
    private ClimateActionEntity climateAction;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
