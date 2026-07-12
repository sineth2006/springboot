package lk.ijse.cmjd114_115.EcoCheck2026.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "goals")
@Builder
@Entity
public class GoalEntity {
    @Id
    private String id;
    private String title;
    private String targetReduction;
    private String targetDate;

    // Changed this to String format since your entity config treats it as string
    private String status;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
