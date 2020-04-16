package Equipment.Computing;

import Configuration.ConfigReader;

public class Voip extends ComputingEquipment {
    public Voip(String ip) {
        super(ConfigReader.read("src/main/java/Configuration/config.properties",
                "VoipName"), ip);
    }
}
