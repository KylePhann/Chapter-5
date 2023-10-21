import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise1 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src\\Book1.csv"));
        int sum = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        try {
           String line;
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                for (String index : row) {
                    int number = Integer.parseInt(index);
                    sum += number;
                    count++;
                    if (number < min) min = number;
                    if (number > max) max = number;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException f){
            System.out.println();
        }
        double average = (double) sum / count;
        System.out.println("The sum is: " + sum);
        System.out.println("The min: " + min);
        System.out.println("The max is: " + max);
        System.out.println("The average is: " + average);
    }
}