package Equipment.Clothing;

import Configuration.ConfigReader;

public class Harmonit extends ClothingEquipment {

    public Harmonit(String size) {
        super(ConfigReader.read("src/main/java/Configuration/config.properties",
                "HarmonitName"), size);
    }
}
