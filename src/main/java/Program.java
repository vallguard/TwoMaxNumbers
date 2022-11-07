import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 7, 6, 7, 3, -4, 0, 3};
        GetTwoMaxNumbers(numbers);

    }

    public static String GetTwoMaxNumbers (int[] numbers) {
        if(numbers.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax && number != max) {
                secondMax = number;
            }
        }
        if(secondMax == Integer.MIN_VALUE) {
            return "Array has only one maximum: " + max;
        } else {
            return  "Array has two maximums: " + secondMax + ", " + max;
        }
    }
}
