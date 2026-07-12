package lk.ijse.cmjd114_115.EcoCheck2026.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO implements Serializable {
    private String useId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
}
