package Equipment.Computing;

import Configuration.ConfigReader;

import java.io.IOException;

public class Nasserim extends ComputingEquipment {

    public Nasserim(String ip, String configPath) throws IOException {
        super(ConfigReader.read(configPath, "nasserim.name"), ip);


    }
}
