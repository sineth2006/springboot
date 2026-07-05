package lk.ijse.cmjd114_115.EcoCheck2026.Serive.impl;

import lk.ijse.cmjd114_115.EcoCheck2026.Serive.UserService;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserSeriveIMPL implements UserService {

    @Override
    public void saveuser(UserDTO user) {
        System.out.println("Save user"+user.toString());
    }

    @Override
    public UserDTO getselecteduser(String userid) {
        return new UserDTO("U002","Kamali","Silva","kamal@mail.com","pw1111", Role.ADMIN);

    }

    @Override
    public List<UserDTO> getallusers() {
        List<UserDTO> userList = List.of(
                new UserDTO(
                        "U001",
                        "Kamal",
                        "Silva",
                        "kamal@mail.com",
                        "pw1111",
                        Role.ADMIN
                ),
                new UserDTO(
                        "U002",
                        "Nimal",
                        "Perera",
                        "nimal@mail.com",
                        "pw2222",
                        Role.USER
                ),
                new UserDTO(
                        "U003",
                        "Sahan",
                        "Silva",
                        "sahan@mail.com",
                        "pw1111",
                        Role.ADMIN
                ),
                new UserDTO(
                        "U004",
                        "Amali",
                        "Jayawardena",
                        "amali@mail.com",
                        "pw4444",
                        Role.ADMIN
                ));
        return userList;
    }

    @Override
    public void updateuser(String userId, UserDTO user) {
        System.out.println("Updated user id is " + userId +" and the user is: " + user.toString());
    }

    @Override
    public void deleteuser(String userId) {
        System.out.println("To be updated the user id " + userId +" as: " + userId.toString());
    }

}
