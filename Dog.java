public class Car {

    String model;
    int engine;
    String[] gearsShifted = {"first", "second", "third", "fourth"};
    private int shiftCounter = 0;

    public Car(String model, int engine) {
        this.model = model;
        this.engine = engine;
    }

    public void rev() {
        System.out.println("Vroom!");
    }

    public int getCylinderCount() {
        // Assume v8 engine
        return this.engine * 8;
    }

    public void shift() {
        this.shiftCounter = (this.shiftCounter + 1) % 4;
        String gear = this.gearsShifted[this.shiftCounter];
        System.out.println(model + " shifted into " + gear + ".");
    }

}