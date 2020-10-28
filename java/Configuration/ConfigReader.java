package Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    public static String read(String configFile, String variable) throws IOException {
        InputStream input = new FileInputStream(configFile);
        Properties prop = new Properties();
        prop.load(input);
        return prop.getProperty(variable);
    }

}
