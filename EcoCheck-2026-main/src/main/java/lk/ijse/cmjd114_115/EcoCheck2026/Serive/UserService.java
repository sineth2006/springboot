package lk.ijse.cmjd114_115.EcoCheck2026.Serive;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface UserService {
    void saveuser(UserDTO user);
    UserDTO  getselecteduser(String userid) throws ChangeSetPersister.NotFoundException;
    List<UserDTO> getallusers();
    void updateuser(String userId,UserDTO user);
    void deleteuser(String userId);
}
