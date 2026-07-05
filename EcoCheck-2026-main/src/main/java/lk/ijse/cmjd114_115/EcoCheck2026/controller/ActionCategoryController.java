package lk.ijse.cmjd114_115.EcoCheck2026.controller;

import lk.ijse.cmjd114_115.EcoCheck2026.Serive.CategoryService;
import lk.ijse.cmjd114_115.EcoCheck2026.Serive.UserService;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.ActionCategoryDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/ActionCategory")
@RestController
@RequiredArgsConstructor
public class ActionCategoryController {

    private final CategoryService categoryService ;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createAction(@RequestBody ActionCategoryDTO actionCategory) {
        categoryService.saveaction(actionCategory);
        return new  ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value= "{actionId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ActionCategoryDTO> getSelectedUser(@PathVariable String actionId) {
        System.out.println("Selected User: " + actionId);
        return new  ResponseEntity<>(categoryService.getselecteduser(actionId), HttpStatus.OK);

    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ActionCategoryDTO>> getUsers() {
        categoryService.getallusers();
        return new ResponseEntity<>(categoryService.getallusers(), HttpStatus.OK);


    }
    @PatchMapping(value = "{actionId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateActionCategory(@PathVariable String actionId,@RequestBody ActionCategoryDTO actionCategorydto) {
        categoryService.updatecategory(actionId,actionCategorydto);
        return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping(value = "{actionId}")
    public ResponseEntity<Void> deleteActionCategory(@PathVariable String actionId) {
        categoryService.deleteuser(actionId);
        return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
