package lk.ijse.cmjd114_115.EcoCheck2026.Serive.impl;

import lk.ijse.cmjd114_115.EcoCheck2026.Serive.GoalService;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.ClimateActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.GoalDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoalIMPL implements GoalService {
    @Override
    public void savegoal(GoalDTO goal) {
        System.out.println("Save climate"+goal.toString());
    }

    @Override
    public GoalDTO getselectecgoal(String goalid) {
        return new GoalDTO("G002","joshep","50%","2025/04/04","ACTIVE","U001");
    }

    @Override
    public List<GoalDTO> getallgoals() {
        List<GoalDTO> goalList = List.of(
                new GoalDTO(
                        "G001",
                        "joshep",
                        "50%",
                        "2025/04/04",
                        "ACTIVE",
                        "U001"
                ),
                new GoalDTO(
                        "G002",
                        "france",
                        "10%",
                        "2025/04/08",
                        "CANCEL",
                        "U002"

                ),
                new GoalDTO(
                        "G003",
                        "FRANK",
                        "24%",
                        "2025/06/04",
                        "COMPLETED",
                        "U003"

                ));
        return goalList;
    }

    @Override
    public void updategoal(String goalid, GoalDTO goal) {
        System.out.println("Updated climate id is " + goalid +" and the climate is: " + goal.toString());
    }

    @Override
    public void deletegoal(String goalid) {
        System.out.println("To be updated the climate id " + goalid +" as: " + goalid.toString());
    }
}
