
import java.util.Arrays;

public class App {
    public static int sumDigits(String numbers) {
        // Calculate the sum of numerical string
        int sum = 0;

        for (int i = 0; i < numbers.length(); i++) {
            int currentNumber = Integer.parseInt(numbers.substring(i, i + 1));
            sum += currentNumber;
        }

        return sum;
    }

    public static boolean checkIfPrime(int number) {
        // Checks if a number is prime
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static int getLargestElement(int[] numberArray) {
        // Get largest element in numberArray
        int maxNumber = 0;
        
        for (int i = 0; i < numberArray.length; i++) {
            // Stores the current number in maxNumber for comparison
            if (i == 0)
                maxNumber = numberArray[i];
            
            if (numberArray[i] > maxNumber)
                maxNumber = numberArray[i];
        }

        return maxNumber;
    }

    /*
    public static int calculateNumbers(String expression) {
        // Simple calculator for 2 numbers

        // Remove whitespaces
        expression = expression.replaceAll("\\s", "");

        String[] operators = {"+", "-", "*", "/"};

        String operator = "";

        for (int i = 0; i < operators.length; i++) {
            if 
        }
    }
        */

    public static String reverseString(String text) {
        String currentLetter = "";

        int reversedIndex = 0;
        String[] reversedLetters = new String[text.length()];

        for (int i = text.length(); i > 0; i--) {
            currentLetter = text.substring(i-1, i);
            reversedLetters[reversedIndex] = currentLetter;
            reversedIndex++;
        }

        String reversedText = Arrays.toString(reversedLetters);
        return reversedText;
    }

    public static String generateFibonacci(int length) {
        int[] sequence = new int[length];
        sequence[0] = 0;
        sequence[1] = 1;

        for (int i = 2; i < length; i++) {
            sequence[i] = sequence[i - 2] + sequence[i - 1];
        }

        return Arrays.toString(sequence);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits("1234"));

        System.out.println(checkIfPrime(17));
        System.out.println(checkIfPrime(4));

        int[] numberArray = {3, 7, 2, 8, 1};
        System.out.println(getLargestElement(numberArray));

        System.out.println(reverseString("hello"));

        System.out.println(generateFibonacci(6));

    }
}
