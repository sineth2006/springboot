package lk.ijse.cmjd114_115.EcoCheck2026.Serive;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;

import java.util.List;

public interface UserService {
    void saveuser(UserDTO user);
    UserDTO  getselecteduser(String userid);
    List<UserDTO> getallusers();
    void updateuser(String userId,UserDTO user);
    void deleteuser(String userId);
}
