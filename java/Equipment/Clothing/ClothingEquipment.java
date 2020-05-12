package Equipment.Clothing;

import Equipment.Equipment;

public abstract class ClothingEquipment extends Equipment {
    private String size;

    public ClothingEquipment(String uniqueName, String size) {
        super(uniqueName);
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " size: " + this.size;
    }

}
