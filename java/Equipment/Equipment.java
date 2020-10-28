package Equipment;

public abstract class Equipment {
    private int id;
    private String uniqueName;

    public Equipment(String uniqueName) {
        this.id = this.hashCode();
        this.uniqueName = uniqueName;
    }

    public int getId() {
        return id;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    @Override
    public String toString() {
        return "item id:" + this.id + " " + " name: " + this.uniqueName;
    }
}
