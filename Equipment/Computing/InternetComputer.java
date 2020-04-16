package Equipment.Computing;

import Configuration.ConfigReader;
import Equipment.Equipment;

public class InternetComputer extends ComputingEquipment {
    public InternetComputer(String ip) {
        super(ConfigReader.read("src/main/java/Configuration/config.properties",
                "InternetComputerName"), ip);
    }
}
