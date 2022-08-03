import java.util.*;

// Parent class temperature
class Temperature {
    public void toCelcius(int temp) {
    }
    
    public void toFahrenheit(int temp) {
    }

    public void toKelvin(int temp) {
    }
}

// Class that converts celcius to farenheit and kelvin
class Celcius extends Temperature {
    public void toFahrenheit(int temp) {
        double x = (temp * 1.8) + 32;
        System.out.println(x);
    }

    public void toKelvin(int temp) {
        double x = temp + 273.15;
        System.out.println(x);
    }
}

// Class that converts farenheit to celcius and kelvin
class Fahrenheit extends Temperature {
    public void toCelcius(int temp) {
        double x = (temp - 32) * 5 / 9;
        System.out.println(x);
    }

    public void toKelvin(int temp) {
        double x = (temp - 32) * 5 / 9 + 273.15;
        System.out.println(x);
    }
}

// Class that converts kelvin to celcius and farenheit
class Kelvin extends Temperature {
    public void toCelcius(int temp) {
        double x = temp - 273.15;
        System.out.println(x);
    }

    public void toFahrenheit(int temp) {
        double x = 1.8 * (temp - 273) + 32;
        System.out.println(x);
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Menu
        System.out.println("1) Celcius to Fahrenheit");
        System.out.println("2) Celcius to Kelvin");
        System.out.println("3) Fahrenheit to Celcius");
        System.out.println("4) Fahrenheit to Kelvin");
        System.out.println("5) Kelvin to Celcius");
        System.out.println("6) Kelvin to Fahrenheit");

        // taking menu
        System.out.print("Enter the conversion you want: ");
        int num = sc.nextInt();

        // taking temp
        System.out.print("Enter the temperature: ");
        int temp = sc.nextInt();

        // creating object of the classes
        Celcius C = new Celcius();
        Temperature F = new Fahrenheit();
        Kelvin K = new Kelvin();

        // conditional statement to iterate the result
        switch (num) {
            case 1:
                C.toFahrenheit(temp); // Celcius to Fahrenheit
                break;
            case 2:
                C.toKelvin(temp); // Celcius to Kelvin
                break;
            case 3:
                F.toCelcius(temp); // Fahrenheit to Celcius
                break;
            case 4:
                F.toKelvin(temp); // Fahrenheit to Kelvin
                break;
            case 5:
                K.toCelcius(temp); // Kelvin to Celcius
                break;
            case 6:
                K.toFahrenheit(temp); // Kelvin to Fahrenheit
                break;

            default:
                System.out.println("Invalid.."); // if the entered num is not in the menu
                break;
        }
    }
}