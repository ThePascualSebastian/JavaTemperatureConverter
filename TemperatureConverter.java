import java.util.Scanner;
import java.util.InputMismatchException;

public class TemperatureConverter {
    public static void printOptions() {
        System.out.println("\nFC: Fahrenheit -> Celsius");
        System.out.println("FK: Fahrenheit -> Kelvin ");
        System.out.println("CF: Celsius -> Fahrenheit");
        System.out.println("CK: Celsius -> Kelvin");
        System.out.println("KF: Kelvin  -> Fahrenheit");
        System.out.println("KC: Kelvin  -> Celsius");
        System.out.println("Q - Quit\n");
    }
    public static void main(String[] args) { 
        Scanner scnr = new Scanner(System.in);

        boolean keepRunning = true;
        String userSelection;
        double userValue;
        double convertedValue;


        System.out.println("Welcome to The Temperature Converter Program!");
        
        while(keepRunning) {
            printOptions(); 
            System.out.println("Please select what units you would like to convert too or enter 'Q' to quit.");
            userSelection = scnr.next();

            switch (userSelection.toUpperCase()) {
                case "FC":
                    System.out.println("\nPlease enter the Fahrenheit degree to convert to Celsius.");
                    while (true) {
                        try {
                            userValue = scnr.nextDouble();
                            break; // Break out of the loop if a valid number is entered
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number.");
                            scnr.nextLine(); // Clear the input buffer
                        }
                    }
                    System.out.println();
                    convertedValue = (userValue - 32) * 5/9;
                    System.out.printf(userValue + "°F is %.2f°C%n", convertedValue);
                    break;

                case "FK":
                    System.out.println("\nPlease enter the Fahrenheit degree to convert to Kelvin.");
                    while (true) {
                        try {
                            userValue = scnr.nextDouble();
                            break; // Break out of the loop if a valid number is entered
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number.");
                            scnr.nextLine(); // Clear the input buffer
                        }
                    }
                    System.out.println();
                    convertedValue = (userValue - 32) * 5/9 + 273.15;
                    System.out.printf(userValue + "°F is %.2fK%n", convertedValue);
                    break;

                case "CF":
                    System.out.println("\nPlease enter the Celsius degree to convert to Fahrenheit.");
                    while (true) {
                        try {
                            userValue = scnr.nextDouble();
                            break; // Break out of the loop if a valid number is entered
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number.");
                            scnr.nextLine(); // Clear the input buffer
                        }
                    }
                    System.out.println();
                    convertedValue = (userValue * 9/5) + 32;
                    System.out.printf(userValue + "°C is %.2f°F%n", convertedValue);
                    break;

                case "CK":
                    System.out.println("\nPlease enter the Celsius degree to convert to Kelvin.");
                    while (true) {
                        try {
                            userValue = scnr.nextDouble();
                            break; // Break out of the loop if a valid number is entered
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number.");
                            scnr.nextLine(); // Clear the input buffer
                        }
                    }
                    System.out.println();
                    convertedValue = userValue + 273.15;
                    System.out.printf(userValue + "°C is %.2fK%n", convertedValue);
                    break;
                
                case "KF":
                    System.out.println("\nPlease enter the Kelvin degree to convert to Fahrenheit.");
                    while (true) {
                        try {
                            userValue = scnr.nextDouble();
                            break; // Break out of the loop if a valid number is entered
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number.");
                            scnr.nextLine(); // Clear the input buffer
                        }
                    }
                    System.out.println();
                    convertedValue = (userValue - 273.15) * 9/5 + 32;
                    System.out.printf(userValue + "K is %.2f°F%n", convertedValue);
                    break;
                
                case "KC":
                    System.out.println("\nPlease enter the Kelvin degree to convert to Celsius.");
                    while (true) {
                        try {
                            userValue = scnr.nextDouble();
                            break; // Break out of the loop if a valid number is entered
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number.");
                            scnr.nextLine(); // Clear the input buffer
                        }
                    }
                    System.out.println();
                    convertedValue = userValue - 273.15;
                    System.out.printf(userValue + "K is %.2f°C%n", convertedValue);
                    break;
                
                case "Q":
                    keepRunning = false;
                    System.out.println("Qutting the program....");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Please input a proper selection.");
                    continue;
            }
            System.out.println("\nWould you like to convert another unit? y/n");

            while (true) {
                userSelection = scnr.next();
                if (userSelection.equalsIgnoreCase("n")) {
                    System.out.println("\nThank you for using the program!");
                    System.exit(0);
                }
                else if (userSelection.equalsIgnoreCase("y")) {
                    break;
                }
                else {
                    System.out.println("Please enter 'y' or 'n'.");
                }
            }
        }
        System.out.println("Goodbye");
        scnr.close();
	}
}