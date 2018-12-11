package core;

import java.util.Scanner;

public class Termometr {


    public void Termometr() {

        Scanner in = new Scanner(System.in);
        System.out.print("Choose a variant (1 - C to F 2 - F to C): ");
        int typeGrad = in.nextInt();

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

        Scanner in = new Scanner(System.in);
        System.out.print("Input " + nameSide);
        double grad = in.nextDouble();

        return grad;
    }

    private double calculateCelsiusTpFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    private double calculateFahrenheitToCelsius (double fahrenheit) {
        return (fahrenheit-32) * 0.56;
    }

}



