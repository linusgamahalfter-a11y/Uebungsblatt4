package h3;

public class H3_main {
    public static void main(String[] args) {
        // Float-Variablen
        float celsiusFloat = 14.2f;  // Beispielwert
        float fahrenheitFloat;

        // Double-Variablen
        double celsiusDouble = 14.2;  // Beispielwert
        double fahrenheitDouble;

        // Konvertierung Celsius -> Fahrenheit für float
        fahrenheitFloat = celsiusFloat * 9 / 5 + 32;

        // Konvertierung Celsius -> Fahrenheit für double
        fahrenheitDouble = celsiusDouble * 9 / 5 + 32;

        // Ausgabe
        System.out.println("Float-Konvertierung:");
        System.out.println(celsiusFloat + " °C = " + fahrenheitFloat + " °F");

        System.out.println("\nDouble-Konvertierung:");
        System.out.println(celsiusDouble + " °C = " + fahrenheitDouble + " °F");
    }
}