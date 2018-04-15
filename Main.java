import java.awt.*;
import java.lang.reflect.Array;
import java.util.concurrent.Future;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Car c = new Car("Camaro", 1);

        c.rev();

        int cylinderCount = c.getCylinderCount();
        System.out.println(cylinderCount + " cylinder engine.");

        c.shift();
        c.shift();
        c.shift();
        c.shift();

    }

}
