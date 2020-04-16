package Equipment.Computing;

import Configuration.ConfigReader;

public class Nasserim extends ComputingEquipment {

    public Nasserim(String ip) {
        super(ConfigReader.read("src/main/java/Configuration/config.properties",
                "NasserimName"), ip);


    }
}
