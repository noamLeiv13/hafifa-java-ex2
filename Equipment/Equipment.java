package Equipment;

import Configuration.ConfigReader;

public abstract class Equipment {
    private int id;
    private String uniqueName;
    private static int UNIQUE_ID = 0;


    public Equipment(String uniqueName) {
        this.id = ++UNIQUE_ID;
        this.uniqueName = uniqueName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    @Override
    public String toString() {
        return "item id:" + this.id + " " + " name: " + this.uniqueName;
    }
}
