package lk.ijse.cmjd114_115.EcoCheck2026.Serive.impl;

import lk.ijse.cmjd114_115.EcoCheck2026.Serive.CategoryService;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.ActionCategoryDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service//this shoud use when you write final private final method in actioncategorycontroller
public class ActionCategoryIMPL implements CategoryService {

    @Override
    public void saveaction(ActionCategoryDTO category) {
        System.out.println("Save user"+category.toString());
    }

    @Override
    public ActionCategoryDTO getselecteduser(String categoryid) {
        return new ActionCategoryDTO("AC-005",
                "Transport",
                "Transportation related climate actions"
        );
    }

    @Override
    public List<ActionCategoryDTO> getallusers() {
        List<ActionCategoryDTO> categoryList = List.of(
                new ActionCategoryDTO(
                        "AC-001",
                        "Energy Saving",
                        "Actions related to reducing electricity and fuel consumption"
                ),
                new ActionCategoryDTO(
                        "AC-002",
                        "Waste Management",
                        "Actions related to waste reduction, recycling, and composting"
                ),
                new ActionCategoryDTO(
                        "AC-003",
                        "Tree Planting",
                        "Actions related to afforestation and increasing green cover"
                ),
                new ActionCategoryDTO(
                        "AC-004",
                        "Water Conservation",
                        "Actions related to reducing water usage and improving efficiency"
                ));
        return categoryList;
    }

    @Override
    public void updatecategory(String actionCategoryId, ActionCategoryDTO actionCategory) {
        System.out.println("Updated action category id is " + actionCategoryId +" as: " + actionCategory.toString());
    }

    @Override
    public void deleteuser(String categoryid) {
        System.out.println("Deleted User id is " + categoryid);
    }
}
