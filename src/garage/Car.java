package garage;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle  {
    private int door;
    private int litrePer100km;
    private String motor;
    private List<String> options =new ArrayList<String>();

    public Car(String modelName; String description, String manufacturer, int year, String color, int spedd, int[] dimension, int weight) {
        super(modelName, description, manufacturer, year, color, spedd, dimension, weight);
    }

    public Car(String modelName; String description, String manufacturer, int year, String color, int spedd, int[] dimension, int weightint door, int litrePer100km, String motor, List<String> options)) {
        this.door = door;
        this.litrePer100km = litrePer100km;
        this.motor = motor;
        this.options = options;
    }
    @Override
    public void start() {
        System.out.println("Je suis " + modelName + "je consomme " + litrePer100km + "l au 100km et je démarre !");
    }
    @Override
    public void stop() {
        System.out.println("Je suis" + modelName + "j'arrête mon moteur" + motor);
    }
    public void startHeadLight() {
        System.out.println("J'allume mes phares");
    }
    public void openTrunk() {
        System.out.println("J'ouvre mon coffre");
    }

    public int getDoor() {
        return door;
    }

    public int getLitrePer100km() {
        return litrePer100km;
    }

    public String getMotor() {
        return motor;
    }

    public List<String> getOptions() {
        return options;
    }
}
