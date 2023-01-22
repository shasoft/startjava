public class Jaeger {
    private String modelName = "Bracer Phonix";
    private String mark = "Mark-3";
    private String origin = "USA";
    private int strength = 8;

    public Jaeger(String modelName, String mark, String origin, int strength) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.strength = strength;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return this.strength;
    }

    public boolean drift() {
        return true;
    }

    public void move() {
        System.out.println("moving");
    }

    public String scanKiju() {
        return "scanning";
    }

    public void useVortexCannon() {
        System.out.println("activated");
    }

    public void print(String title) {
        System.out.println(
                title + "\n"
                        + "\tmodelname: " + this.getModelName() + "\n"
                        + "\t   origin: " + this.getOrigin() + "\n"
                        + "\t     mark: " + this.getMark() + "\n"
                        + "\t strength: " + this.getStrength());
    }
}