public class Main {
    public static void main(String[] args) {
        System.out.println("Celsius Fahrenheit converter");
        double fahrenheit = 100.0;
        double celsius = f2c(fahrenheit);
        System.out.printf("%s fahrenheit = %s celsius\n", fahrenheit, celsius);
    }

    public static double f2c(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}