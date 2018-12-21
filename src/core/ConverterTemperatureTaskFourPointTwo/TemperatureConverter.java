package core.ConverterTemperatureTaskFourPointTwo;

public class TemperatureConverter {

    public final double waterFreezingPoint = 32;

    public double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + waterFreezingPoint;
    }

    public double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - waterFreezingPoint) * 0.56;
    }

}
