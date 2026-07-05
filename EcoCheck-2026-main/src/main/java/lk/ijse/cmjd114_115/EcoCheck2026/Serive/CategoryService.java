package lk.ijse.cmjd114_115.EcoCheck2026.Serive;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.ActionCategoryDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;

import java.util.List;

public interface CategoryService {
    void saveaction(ActionCategoryDTO category);
    ActionCategoryDTO  getselecteduser(String categoryid);
    List<ActionCategoryDTO> getallusers();
    void updatecategory(String categoryid,ActionCategoryDTO category);
    void deleteuser(String categoryid);

}
