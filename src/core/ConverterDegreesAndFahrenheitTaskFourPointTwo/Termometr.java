package core.ConverterDegreesAndFahrenheitTaskFourPointTwo;

import java.util.Scanner;

public class Termometr {

    Scanner in = new Scanner(System.in);

    public void Termometr() {

        System.out.print("Choose a variant (1 - C to F 2 - F to C): ");
        int typeGrad = in.nextInt( );

        switch (typeGrad) {

            case 1:
                double celsius = getGrad("Celsius");
                System.out.println(calculateCelsiusTpFahrenheit(celsius));
                break;
            case 2:
                double fahrenheit = getGrad("Fahrenheit");
                System.out.println(calculateFahrenheitToCelsius(fahrenheit));
                break;
            default:
                System.out.println("Сurrent number is not equal 1 or 2");

        }

    }

    private double getGrad(String nameSide) {
        System.out.print("Input " + nameSide);
        return in.nextDouble( );
    }

    private double calculateCelsiusTpFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    private double calculateFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 0.56;
    }

}



