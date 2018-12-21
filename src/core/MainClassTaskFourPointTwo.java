package core;

import core.ConverterTemperatureTaskFourPointTwo.TemperatureConverter;
import core.ConverterTemperatureTaskFourPointTwo.TemperatureInputController;

public class MainClassTaskFourPointTwo {

    public static void main(String[] args) {

        TemperatureInputController TemperatureInputController = new TemperatureInputController(System.in);
        TemperatureConverter TemperatureConverter = new TemperatureConverter();

        int variantOfTemperature = TemperatureInputController.getVariantOfTemperature();

        switch (variantOfTemperature) {

            case 1:
                double celsius = TemperatureInputController.getTemperature("Celsius");
                System.out.println(TemperatureConverter.convertCelsiusToFahrenheit(celsius));
                break;
            case 2:
                double fahrenheit = TemperatureInputController.getTemperature("Fahrenheit");
                System.out.println(TemperatureConverter.convertFahrenheitToCelsius(fahrenheit));
                break;
            default:
                System.out.println("Сurrent number is not equal 1 or 2");

        }

    }
}
