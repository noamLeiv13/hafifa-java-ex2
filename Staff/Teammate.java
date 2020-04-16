package Staff;


import Equipment.Equipment;

import java.util.ArrayList;

public class Teammate {
    private ArrayList<Equipment> equipment;
    private int id;

    public Teammate(int id) {
        this.id = id;
        equipment = new ArrayList<Equipment>();
    }


    public void addItem(Equipment newEquipment) {
        equipment.add(newEquipment);
    }

    private Equipment getItemById(int equipmentId) {
        return equipment.stream().
                filter(item -> item.getId() == equipmentId).
                findAny().orElse(null);
    }

    public Equipment removeItemById(int equipmentId) {
        Equipment toRemove = getItemById(equipmentId);
        if (toRemove != null) {
            equipment.remove(toRemove);
        }
        return toRemove;
    }


    public ArrayList<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<Equipment> equipment) {
        this.equipment = equipment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
