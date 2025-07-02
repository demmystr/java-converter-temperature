public class Main {
    public static void main(String[] args) {
        System.out.println("Celsius Fahrenheit converter");
        double fahrenheit = 100.0;
        double celsius = f2c(fahrenheit);
        System.out.printf("%s fahrenheit = %s celsius\n", fahrenheit, celsius);
        fahrenheit = c2f(celsius);
        System.out.printf("%s celsius = %s fahrenheit\n",  celsius, fahrenheit);
    }

    public static double f2c(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double c2f(double celsius) {
        return (celsius * 9/5) + 32;
    }
}