package core;

import java.util.Scanner;

// TODO: (Eugene) 12/20/2018 class does multiple things - takes user input, converts CelsiusToFahrenheit and FahrenheitToCelsius
// One class - one logical responsibility. Better to split it, at least into TemperatureConverter and TemperatureInputController
public class Termometr {

    // TODO: (Eugene) 12/20/2018 Method name does not describe what it does
    // TODO: (Eugene) 12/20/2018 Method names start with lowercase
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
        // TODO: (Eugene) 12/20/2018 you create another scanner - maybe you should reuse existing one
        // or even make a field for it. But in separate class, e.g. TemperatureInputController
        Scanner in = new Scanner(System.in);
        System.out.print("Input " + nameSide);
        // TODO: (Eugene) 12/20/2018 variable don't needed. Just return the value
        double grad = in.nextDouble();

        return grad;
    }

    // TODO: (Eugene) 12/20/2018 maybe 'convertCelsiusToFahrenheit' is more descriptive name
    private double calculateCelsiusTpFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    private double calculateFahrenheitToCelsius (double fahrenheit) {
        // TODO: (Eugene) 12/20/2018 format code properly: add more spaces
        return (fahrenheit-32) * 0.56;
    }

}



