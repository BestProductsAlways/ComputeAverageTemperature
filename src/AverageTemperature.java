import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input from the user for the number of temperatures
        System.out.print("Enter the number of temperatures: ");
        int numTemperatures = scanner.nextInt();

        // Step 2: Prompt the user to enter all the temperatures
        double[] temperatures = new double[numTemperatures];
        for (int i = 0; i < numTemperatures; i++) {
            System.out.print("Enter temperature " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Step 3: Calculate the average temperature
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        double averageTemperature = sum / numTemperatures;
        System.out.printf("The average temperature is: %.2f\n", averageTemperature);

        // Step 4: Count how many temperatures are above the average
        int countAboveAverage = 0;
        for (double temp : temperatures) {
            if (temp > averageTemperature) {
                countAboveAverage++;
            }
        }
        System.out.println(countAboveAverage + " days are above the average temperature.");

        scanner.close();
    }
}

