package Equipment.Clothing;


import Configuration.ConfigReader;

public class FestiveCoat extends ClothingEquipment {
    public FestiveCoat(String size) {
        super(ConfigReader.read("src/main/java/Configuration/config.properties",
                "FestiveCoatName"), size);
    }


}

