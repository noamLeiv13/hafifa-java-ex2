package Equipment.Computing;

import Configuration.ConfigReader;

import java.io.IOException;

public class InternetComputer extends ComputingEquipment {
    public InternetComputer(String ip, String configPath) throws IOException {
        super(ConfigReader.read(configPath, "internet.computer.name"), ip);
    }
}
