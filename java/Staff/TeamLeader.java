package Staff;

import CustomExceptions.SwitchEquipmentException;
import Equipment.Equipment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeamLeader extends Teammate {
    private ArrayList<Teammate> teammates;

    public TeamLeader(ArrayList<Teammate> teammates) {
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

    public void switchEquipment(int passerId, int equipmentId, int getterId) throws SwitchEquipmentException {
        Teammate passer = getTeammateById(passerId);
        Teammate getter = getTeammateById(getterId);
        if (isInputUsersAreValid(passer, getter)) {
            Equipment toSend = passer.removeItemById(equipmentId);
            if (equipmentIsValid(toSend)) {
                getter.addItem(toSend);
            } else
                throw new SwitchEquipmentException();
        } else
            throw new SwitchEquipmentException();
    }

    private boolean equipmentIsValid(Equipment equipment) {
        return equipment != null;
    }

    private boolean isInputUsersAreValid(Teammate passer, Teammate getter) {
        return passer != null && getter != null;
    }

    public ArrayList<Teammate> getTeammates() {
        return teammates;
    }

    public void setTeammates(ArrayList<Teammate> teammates) {
        this.teammates = teammates;
    }
}
