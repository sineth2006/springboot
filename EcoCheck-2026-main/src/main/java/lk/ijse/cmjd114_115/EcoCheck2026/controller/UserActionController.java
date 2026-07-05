package lk.ijse.cmjd114_115.EcoCheck2026.controller;

import lk.ijse.cmjd114_115.EcoCheck2026.Serive.UserActionService;
import lk.ijse.cmjd114_115.EcoCheck2026.Serive.UserService;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/usersAction")
@RestController
@RequiredArgsConstructor

public class UserActionController {
    private final UserActionService userActionService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createUserAction(@RequestBody UserActionDTO userActionDTO) {
        userActionService.saveuserAction(userActionDTO);
        return new  ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value= "{userActionId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserActionDTO> getSelectedUser(@PathVariable String userActionId) {
        System.out.println("Selected User: " + userActionId);
        userActionService.getselecteduserAction(userActionId);
        return new  ResponseEntity<>(userActionService.getselecteduserAction(userActionId), HttpStatus.OK);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserActionDTO>> getUserActions() {
        userActionService.getalluserActions();///github eke meka gahaa thibbe na poddak balanna
        return new ResponseEntity<>(userActionService.getalluserActions(), HttpStatus.OK);

    }

    @PatchMapping(value = "{userActionId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateUserAction(@PathVariable String userActionId,@RequestBody UserActionDTO userActionDTO) {
        userActionService.updateuserAction(userActionId,userActionDTO);
        return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(value = "{userActionId}")
    public ResponseEntity<Void> deleteUserAction(@PathVariable String userActionId) {
        userActionService.deleteuserAction(userActionId);
        return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
