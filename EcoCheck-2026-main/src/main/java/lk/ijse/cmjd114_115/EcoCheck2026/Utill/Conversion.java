package lk.ijse.cmjd114_115.EcoCheck2026.Utill;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.ClimateActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.ClimateActionEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.UserActionEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.UserEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Conversion {
    private final ModelMapper mapper;

    //--------------User-Conversion--------------
    public UserDTO toUserDTO(UserEntity userEntity) {
        return mapper.map(userEntity, UserDTO.class);
    }

    public UserEntity toUserEntity(UserDTO userDTO) {
        return mapper.map(userDTO, UserEntity.class);
    }

    public List<UserDTO> toUserDTOList(List<UserEntity> userEntityList) {
        return mapper.map(userEntityList,
                new TypeToken<List<UserDTO>>() {
                }.getType()
        );
    }

    //--------------UserAction-Conversion--------------
    public UserActionDTO toUserActionDTO(UserActionEntity userActionEntity) {
        return mapper.map(userActionEntity, UserActionDTO.class);
    }

    public UserActionEntity toUserActionEntity(UserActionDTO userActionDTO) {
        return mapper.map(userActionDTO, UserActionEntity.class);
    }

    public List<UserActionDTO> toUserActionDTOList(List<UserActionEntity> userActionEntityList) {
        return mapper.map(userActionEntityList,
                new TypeToken<List<UserActionDTO>>() {
                }.getType()
        );
    }

    //--------------UserAction-Conversion--------------
    public ClimateActionDTO toclimateActionDTO(ClimateActionEntity climateActionEntity) {
        return mapper.map(climateActionEntity, ClimateActionDTO.class);
    }

    public ClimateActionEntity toclimateActionEntity(ClimateActionDTO climateActionDTO) {
        return mapper.map(climateActionDTO, ClimateActionEntity.class);
    }

    public List<ClimateActionDTO> toclimateActionDTOList(List<ClimateActionEntity> climateActionEntityList) {
        return mapper.map(climateActionEntityList,
                new TypeToken<List<ClimateActionDTO>>() {
                }.getType()
        );
    }
}
