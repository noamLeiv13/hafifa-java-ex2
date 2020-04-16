package Equipment.Computing;

import Equipment.Equipment;

public abstract class ComputingEquipment extends Equipment {
    private String ip;

    public ComputingEquipment(String uniqueName, String ip) {
        super(uniqueName);
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }


    @Override
    public String toString() {
        return super.toString() + " IP address: " + this.ip;
    }
}
