package lk.ijse.cmjd114_115.EcoCheck2026.controller;

import lk.ijse.cmjd114_115.EcoCheck2026.Serive.ClimateService;
import lk.ijse.cmjd114_115.EcoCheck2026.Serive.UserService;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.ClimateActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/climates")
@RestController
@RequiredArgsConstructor

public class ClimateActionController {

    private final ClimateService climateService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createclimate(@RequestBody ClimateActionDTO climateDTO) {
        climateService.saveclimate(climateDTO);
        return new  ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value= "{climateId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClimateActionDTO> getSelectedClimate(@PathVariable String climateId) {
        System.out.println("Selected climate: " + climateId);
        climateService.getselecteclimate(climateId);
        return new  ResponseEntity<>(climateService.getselecteclimate(climateId), HttpStatus.OK);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ClimateActionDTO>> getClimate() {
        climateService.getallclimates();///github eke meka gahaa thibbe na poddak balanna
        return new ResponseEntity<>(climateService.getallclimates(), HttpStatus.OK);

    }
    @PatchMapping(value = "{climateId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateClimate(@PathVariable String climateId,@RequestBody ClimateActionDTO climateDTO) {
        climateService.updateclimate(climateId,climateDTO);
        return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping(value = "{climateId}")
    public ResponseEntity<Void> deleteClimate(@PathVariable String climateId) {
        climateService.deleteclimate(climateId);
        return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
