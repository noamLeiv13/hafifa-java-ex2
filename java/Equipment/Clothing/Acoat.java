package Equipment.Clothing;


import Configuration.ConfigReader;

import java.io.IOException;

public class Acoat extends ClothingEquipment {
    public Acoat(String size, String configPath) throws IOException {
        super(ConfigReader.read(configPath,
                "Acoat"), size);
    }


}

