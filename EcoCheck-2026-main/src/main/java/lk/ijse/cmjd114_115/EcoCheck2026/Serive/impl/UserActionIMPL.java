package lk.ijse.cmjd114_115.EcoCheck2026.Serive.impl;

import lk.ijse.cmjd114_115.EcoCheck2026.Serive.UserActionService;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserActionIMPL implements UserActionService {

    @Override
    public void saveuserAction(UserActionDTO userAction) {
        System.out.println("Save user"+userAction.toString());
    }

    @Override
    public UserActionDTO getselecteduserAction(String userActionid) {
        return new UserActionDTO("UA001","10","50","02/12/2026","U001","A001");
    }

    @Override
    public List<UserActionDTO> getalluserActions() {
        List<UserActionDTO> userList = List.of(
                new UserActionDTO(
                        "UA001",
                        "10",
                        "50",
                        "02/12/2026",
                        "U001",
                        "A001"
                ),
                new UserActionDTO(
                        "UA002",
                        "100",
                        "80",
                        "09/08/2026",
                        "U002",
                        "A002"
                ),
                new UserActionDTO(
                        "UA003",
                        "104",
                        "99",
                        "12/12/2026",
                        "U003",
                        "A003"
                ));
        return userList;
    }

    @Override
    public void updateuserAction(String userActionid, UserActionDTO userAction) {
        System.out.println("Updated user id is " + userActionid +" and the user is: " + userAction.toString());
    }

    @Override
    public void deleteuserAction(String userActionid) {
        System.out.println("To be updated the user id " + userActionid +" as: " + userActionid.toString());
    }
}
