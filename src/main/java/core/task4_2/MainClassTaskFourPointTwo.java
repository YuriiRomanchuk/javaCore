package core.task4_2;

public class MainClassTaskFourPointTwo {

    public static void main(String[] args) {

        TemperatureInputController temperatureInputController = new TemperatureInputController(System.in);
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        int variantOfTemperature = temperatureInputController.receiveVariantOfTemperature();

        switch (variantOfTemperature) {

            case 1:
                double celsius = temperatureInputController.receiveTemperature("Celsius");
                System.out.println(temperatureConverter.convertCelsiusToFahrenheit(celsius));
                break;
            case 2:
                double fahrenheit = temperatureInputController.receiveTemperature("Fahrenheit");
                System.out.println(temperatureConverter.convertFahrenheitToCelsius(fahrenheit));
                break;
            default:
                System.out.println("Сurrent number is not equal 1 or 2");

        }

    }
}
