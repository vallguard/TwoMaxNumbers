import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 3, 6, 2, 1,-5};
        System.out.println(GetTwoMaxNumbers(numbers));
    }

    public static String GetTwoMaxNumbers(int[] numbers) {
        if (numbers.length > 1) {
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            for (int number : numbers) {
                if (number >= max) {
                    secondMax = max;
                    max = number;
                } else if (number> secondMax) {
                    secondMax = number;
                }
            }
            return "Array has two maximums: " + secondMax + ", " + max;
        } else if (numbers.length == 1) {
            return "Array has only one maximum: " + numbers[0];
        } else {
            return "Array is empty";
        }
    }
}
