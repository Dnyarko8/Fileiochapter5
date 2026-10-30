
import java.io.*;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws Exception {

        Scanner file = new Scanner(new File("Book1"));
        file.useDelimiter("[,\\s]+");

        double sum = 0;
        double lowest = 999999;
        double highest = -999999;
        int count = 0;

        while (file.hasNextDouble()) {
            double number = file.nextDouble();

            sum = sum + number;

            if (number < lowest) {
                lowest = number;
            }

            if (number > highest) {
                highest = number;
            }

            count++;
        }

        file.close();

        if (count == 0) {
            System.out.println("No numbers found");
            return;
        }

        PrintWriter writer = new PrintWriter("stats.txt");

        writer.println("Sum: " + sum);
        writer.println("Lowest: " + lowest);
        writer.println("Highest: " + highest);
        writer.println("Average: " + (sum / count));

        writer.close();

        System.out.println("Done!");
    }
}
