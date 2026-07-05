package lk.ijse.cmjd114_115.EcoCheck2026.Serive;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;

import java.util.List;

public interface UserActionService {
    void saveuserAction(UserActionDTO userAction);
    UserActionDTO  getselecteduserAction(String userActionid);
    List<UserActionDTO> getalluserActions();
    void updateuserAction(String userActionid,UserActionDTO userAction);
    void deleteuserAction(String userActionid);
}
