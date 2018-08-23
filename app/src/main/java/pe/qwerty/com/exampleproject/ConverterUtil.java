package pe.qwerty.com.exampleproject;

public class ConverterUtil {
    public static float convertFahrenheitToCelsius(float fahrenheit){
        float result = (((fahrenheit -32)*5)/9);
        return  result;
    }

    public static float convertCelsiusToFahrenheit(float celsius){
        float result = (((celsius *9)/5)+32);
        return  result;
    }
}
