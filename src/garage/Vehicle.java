package garage;

public abstract class Vehicle {
    protected String modelName;
    private String description;
    private String manufacturer;
    private int year;
    private String color;
    private int speed;
    private int [] dimension = new int [3];
    private int weight;

    public Vehicle() {
    }

    public vehicle(String modelName, String description, String manufacturer, int year, String color, int speed, int [] dimension, int weight) {
        this.modelName = modelName;
        this.description = description;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.dimension = dimension;
        this.weight = weight;
    }
    public abstract void start() {
        System.out.println("je suis " + modelName + "et je démarre");
    }
    public abstract void stop() {
        System.out.println("Je suis" + modelName + "et je m'arrète");
    }

    public String getModelName() {
        return modelName;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int[] getDimension() {
        return dimension;
    }

    public int getWeight() {
        return weight;
    }
}

