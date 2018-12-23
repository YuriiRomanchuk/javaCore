package core.task4_2;

import java.io.InputStream;
import java.util.Scanner;

public class TemperatureInputController {
    // TODO: (Eugene) 23.12.2018 private...
    Scanner in;

    public TemperatureInputController(InputStream inputStream) {
        this.in = new Scanner(inputStream);
    }

    public int getVariantOfTemperature() {
        System.out.print("Choose a variant (1 - C to F 2 - F to C): ");
        return in.nextInt();
    }

    public double getTemperature(String degreeUnitName) {
        System.out.print("Input " + degreeUnitName);
        return in.nextDouble();
    }

}
