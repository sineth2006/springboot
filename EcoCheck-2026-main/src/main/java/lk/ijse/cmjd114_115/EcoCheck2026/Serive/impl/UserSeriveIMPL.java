package lk.ijse.cmjd114_115.EcoCheck2026.Serive.impl;

import jakarta.transaction.Transactional;
import lk.ijse.cmjd114_115.EcoCheck2026.Exception.DataNotFoundException;
import lk.ijse.cmjd114_115.EcoCheck2026.Serive.UserService;
import lk.ijse.cmjd114_115.EcoCheck2026.Utill.Conversion;
import lk.ijse.cmjd114_115.EcoCheck2026.Utill.IdGenerate;
import lk.ijse.cmjd114_115.EcoCheck2026.dao.UserDao;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
@RequiredArgsConstructor
public class UserSeriveIMPL implements UserService {
    private final UserDao userDao;
    private final Conversion conversion;

    @Override
    public void saveuser(UserDTO user) {
    //    -----Generate User Id
        user.setUseId(IdGenerate.userId());
//        -----Save the data
       UserEntity userEntity = conversion.toUserEntity(user);
      userDao.save(userEntity);

    }

    @Override
    public UserDTO getselecteduser(String userId) {
        UserEntity userEntity = userDao.findById(userId)
                .orElseThrow(() -> new DataNotFoundException("User not found!"));
        return conversion.toUserDTO(userEntity);

    }

    @Override
    public List<UserDTO> getallusers() {
        return conversion.toUserDTOList(userDao.findAll());
    }

    @Override
    public void updateuser(String userId, UserDTO user) {
        UserEntity foundUser = userDao.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found!"));
        foundUser.setFirstName(user.getFirstName());
        foundUser.setLastName(user.getLastName());
        foundUser.setEmail(user.getEmail());
        foundUser.setPassword(user.getPassword());
        foundUser.setRole(user.getRole());

    }

    @Override
    public void deleteuser(String userId) {
        UserEntity foundUser = userDao.findById(userId)
                .orElseThrow(() -> new DataNotFoundException("User not found!"));
        userDao.delete(foundUser);
    }

}
