package lk.ijse.cmjd114_115.EcoCheck2026.Serive;


import lk.ijse.cmjd114_115.EcoCheck2026.dto.GoalDTO;

import java.util.List;

public interface GoalService {
    void savegoal(GoalDTO goal);
    GoalDTO  getselectecgoal(String goalid);
    List<GoalDTO> getallgoals();
    void updategoal(String goalid, GoalDTO goal);
    void deletegoal(String goalid);
}
