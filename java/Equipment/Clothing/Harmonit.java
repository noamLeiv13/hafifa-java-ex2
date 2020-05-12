package Equipment.Clothing;

import Configuration.ConfigReader;

import java.io.IOException;

public class Harmonit extends ClothingEquipment {

    public Harmonit(String size, String configPath) throws IOException {
        super(ConfigReader.read(configPath, "harmonit.name"), size);
    }
}
