package Staff;

import Equipment.Equipment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeamLeader extends Teammate {
    ArrayList<Teammate> teammates;

    public TeamLeader(int id, ArrayList<Teammate> teammates) {
        super(id);
        this.teammates = teammates;
    }


    public List<Equipment> getTeamEquipment() {
        List<Equipment> teammatesEquipment = teammates.stream().map(Teammate::getEquipment).flatMap(Collection::stream)
                .collect(Collectors.toList());
        return Stream.concat(this.getEquipment().stream(), teammatesEquipment.stream()).
                collect(Collectors.toList());

    }


    private Teammate getTeammateById(int teammateId) {
        for (Teammate teammate : teammates) {
            if (teammate.getId() == teammateId) {
                return teammate;
            }
        }
        return null;
    }

    public boolean switchEquipment(int passerId, int equipmentId, int getterId) {
        Teammate passer = getTeammateById(passerId);
        Teammate getter = getTeammateById(getterId);
        if (passer != null && getter != null) {
            Equipment toSend = passer.removeItemById(equipmentId);
            if (toSend != null) {
                getter.addItem(toSend);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Teammate> getTeammates() {
        return teammates;
    }

    public void setTeammates(ArrayList<Teammate> teammates) {
        this.teammates = teammates;
    }
}
