package core;

import core.ConverterTemperatureTaskFourPointTwo.TemperatureConverter;
import core.ConverterTemperatureTaskFourPointTwo.TemperatureInputController;

public class MainClassTaskFourPointTwo {

    public static void main(String[] args) {

        TemperatureInputController temperatureInputController = new TemperatureInputController(System.in);
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        int variantOfTemperature = temperatureInputController.getVariantOfTemperature();

        switch (variantOfTemperature) {

            case 1:
                double celsius = temperatureInputController.getTemperature("Celsius");
                System.out.println(temperatureConverter.convertCelsiusToFahrenheit(celsius));
                break;
            case 2:
                double fahrenheit = temperatureInputController.getTemperature("Fahrenheit");
                System.out.println(temperatureConverter.convertFahrenheitToCelsius(fahrenheit));
                break;
            default:
                System.out.println("Сurrent number is not equal 1 or 2");

        }

    }
}
