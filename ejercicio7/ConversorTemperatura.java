package inicio.ejercicio7;

public class ConversorTemperatura {
    //Método

    public static double celsiusAFahrenheit(double temperaturaCelsius){
        return temperaturaCelsius*9/5 + 23;
    }

    public static double fahrenheitACelsius(double temperaturaFahrenheit){
        return (temperaturaFahrenheit - 32) * 5/9;
    }
}
