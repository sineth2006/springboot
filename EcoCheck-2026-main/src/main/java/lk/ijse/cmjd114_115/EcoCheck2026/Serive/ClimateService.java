package lk.ijse.cmjd114_115.EcoCheck2026.Serive;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.ClimateActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;

import java.util.List;

public interface ClimateService {
    void saveclimate(ClimateActionDTO climate);
    ClimateActionDTO  getselecteclimate(String climateid);
    List<ClimateActionDTO> getallclimates();
    void updateclimate(String climateid, ClimateActionDTO climate);
    void deleteclimate(String climateid);
}
