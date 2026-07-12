package lk.ijse.cmjd114_115.EcoCheck2026.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "climate_actions") // Fixed hyphen to underscore
@Builder
public class ClimateActionEntity implements Serializable {
    @Id
    private String climateActionId;
    private String title;
    private String description;
    private String estimatedCO2Reduction;
    private String points;

    @ManyToOne
    @JoinColumn(name = "action_category_id") // Avoid hyphens in column names
    private ActionCategoryEntity actionCategory;

    @JsonIgnore
    @OneToMany(mappedBy = "climateAction")
    private List<UserActionEntity> userActions;
}
