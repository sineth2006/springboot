package lk.ijse.cmjd114_115.EcoCheck2026.Serive.impl;

import jakarta.transaction.Transactional;
import lk.ijse.cmjd114_115.EcoCheck2026.Exception.DataNotFoundException;
import lk.ijse.cmjd114_115.EcoCheck2026.Serive.UserActionService;
import lk.ijse.cmjd114_115.EcoCheck2026.Utill.Conversion;
import lk.ijse.cmjd114_115.EcoCheck2026.Utill.IdGenerate;
import lk.ijse.cmjd114_115.EcoCheck2026.dao.ClimateActionDao;
import lk.ijse.cmjd114_115.EcoCheck2026.dao.UserActionDao;
import lk.ijse.cmjd114_115.EcoCheck2026.dao.UserDao;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.ClimateActionEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.UserActionEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class UserActionIMPL implements UserActionService {
    private final UserActionDao useractionDao;
    private final Conversion conversion;
    private final UserDao userDao;
    private final ClimateActionDao climateActionDao;

    @Override
    public void saveuserAction(UserActionDTO userAction) {
        //    -----Generate User Id
        userAction.setUserActionId(IdGenerate.userActionId());
//        -----Save the data
        UserActionEntity userActionEntity = conversion.toUserActionEntity(userAction);
        useractionDao.save(userActionEntity);
    }

    @Override
    public UserActionDTO getselecteduserAction(String userActionid) {
        UserActionEntity userActionEntity =useractionDao.findById(userActionid)
                .orElseThrow(() -> new DataNotFoundException("UserAction not found!"));
        return conversion.toUserActionDTO(userActionEntity);
    }

    @Override
    public List<UserActionDTO> getalluserActions() {
        return conversion.toUserActionDTOList(useractionDao.findAll());
    }

    @Override
    public void updateuserAction(String userActionid, UserActionDTO userAction) {
        UserActionEntity foundUser = useractionDao.findById(userActionid)
                .orElseThrow(() -> new RuntimeException("User not found!"));
        foundUser.setCompletedDate(userAction.getCompletedDate());
        foundUser.setQuantity(userAction.getQuantity());
        foundUser.setTotalReduction(userAction.getTotalReduction());
    //foreign keys
        UserEntity userEntity = userDao.findById(userAction.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + userAction.getUserId()));
        foundUser.setUser(userEntity);

        ClimateActionEntity climateActionEntity = climateActionDao.findById(userAction.getActionId())
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + userAction.getActionId()));
        foundUser.setClimateAction(climateActionEntity);
    }

    @Override
    public void deleteuserAction(String userActionid) {
        System.out.println("To be updated the user id " + userActionid +" as: " + userActionid.toString());
    }
}
