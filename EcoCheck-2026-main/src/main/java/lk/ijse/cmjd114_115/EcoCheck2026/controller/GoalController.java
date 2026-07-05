package lk.ijse.cmjd114_115.EcoCheck2026.controller;

import lk.ijse.cmjd114_115.EcoCheck2026.Serive.GoalService;
import lk.ijse.cmjd114_115.EcoCheck2026.Serive.UserService;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.GoalDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/goals")
@RestController
@RequiredArgsConstructor
public class GoalController {
    private final GoalService goalService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> savegoal(@RequestBody GoalDTO goalDTO) {
        goalService.savegoal(goalDTO);
        return new  ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value= "{goalid}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GoalDTO> getSelectedGoal(@PathVariable String goalid) {
        System.out.println("Selected Goal: " + goalid);
        goalService.getselectecgoal(goalid);
        return new  ResponseEntity<>(goalService.getselectecgoal(goalid), HttpStatus.OK);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GoalDTO>> getallgoals() {
        goalService.getallgoals();///github eke meka gahaa thibbe na poddak balanna
        return new ResponseEntity<>(goalService.getallgoals(), HttpStatus.OK);

    }
    @PatchMapping(value = "{goalid}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updategoal(@PathVariable String goalid,@RequestBody GoalDTO goalDTO) {
        goalService.updategoal(goalid,goalDTO);
        return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping(value = "{goalid}")
    public ResponseEntity<Void> deleteUser(@PathVariable String goalid) {
        goalService.deletegoal(goalid);
        return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
