package lk.ijse.cmjd114_115.EcoCheck2026.Serive.impl;

import jakarta.transaction.Transactional;
import lk.ijse.cmjd114_115.EcoCheck2026.Serive.ClimateService;
import lk.ijse.cmjd114_115.EcoCheck2026.Utill.Conversion;
import lk.ijse.cmjd114_115.EcoCheck2026.Utill.IdGenerate;
import lk.ijse.cmjd114_115.EcoCheck2026.dao.ClimateActionDao;
import lk.ijse.cmjd114_115.EcoCheck2026.dao.UserActionDao;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.ClimateActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.ClimateActionEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.UserActionEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class ClimateActionIMPL implements ClimateService {
    private final ClimateActionDao climateactionDao;
    private final Conversion conversion;

    @Override
    public void saveclimate(ClimateActionDTO climate) {
        //    -----Generate User Id
        climate.setClimateActionId(IdGenerate.climateActionId());
//        -----Save the data
        ClimateActionEntity climateActionEntity = conversion.toclimateActionEntity(climate);
        climateactionDao.save(climateActionEntity);
    }

    @Override
    public ClimateActionDTO getselecteclimate(String climateid) {
        return new ClimateActionDTO("C001","Weather","aaaaaaaaaaaaa","50%","Two Points");
    }

    @Override
    public List<ClimateActionDTO> getallclimates() {
        List<ClimateActionDTO> climateList = List.of(
                new ClimateActionDTO(
                        "C001",
                        "Weather",
                        "aaaaaaaaaaaaa",
                        "50%",
                        "Two Points"
                ),
                new ClimateActionDTO(
                        "C002",
                        "Rainny",
                        "Heavy rain",
                        "20%",
                        "Five Points"
                ),
                new ClimateActionDTO(
                        "C003",
                        "Sunny",
                        "It shines brightly.",
                        "95%",
                        "Ten Points"
                ));
        return climateList;
    }

    @Override
    public void updateclimate(String climateid, ClimateActionDTO climate) {
        System.out.println("Updated climate id is " + climateid +" and the climate is: " + climate.toString());
    }

    @Override
    public void deleteclimate(String climateid) {
        System.out.println("To be updated the climate id " + climateid +" as: " + climateid.toString());
    }
}
