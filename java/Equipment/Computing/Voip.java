package Equipment.Computing;

import Configuration.ConfigReader;

import java.io.IOException;

public class Voip extends ComputingEquipment {
    public Voip(String ip, String configPath) throws IOException {
        super(ConfigReader.read(configPath, "voip.name"), ip);
    }
}
