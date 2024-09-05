
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

    public static int getSmallestElement(int[] numberArray) {
        // Get largest element in numberArray
        int minNumber = 0;
        
        for (int i = 0; i < numberArray.length; i++) {
            // Stores the current number in minNumber for comparison
            if (i == 0)
                minNumber = numberArray[i];
            
            if (numberArray[i] < minNumber)
                minNumber = numberArray[i];
        }

        return minNumber;
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

    public static int countVowels(String word) {
        word = word.toLowerCase();
        int vowelCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' ||
                word.charAt(i) == 'i' ||
                word.charAt(i) == 'u' ||
                word.charAt(i) == 'e' ||
                word.charAt(i) == 'o') {
                    vowelCount++;
                }
        }

        return vowelCount;
    }

    public static String sortElements(int[] numberArray) {
        int arrayLength = numberArray.length;
        int[] returnArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int[] arrayCopy = Arrays.copyOfRange(numberArray, i, arrayLength);
            returnArray[i] = getSmallestElement(arrayCopy);
        }

        return Arrays.toString(returnArray);
    }

    public static boolean checkIfAnagram(String word1, String word2) {
       word1 = word1.toLowerCase();
       word2 = word2.toLowerCase();
        
        int word1ASCIIValue = 0;
        int word2ASCIIValue = 0;
        
        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                word1ASCIIValue += (int) word1.charAt(i);
            }
            for (int j = 0; j < word2.length(); j++) {
                word2ASCIIValue += (int) word2.charAt(j);
            }

        if (word1ASCIIValue == word2ASCIIValue)
            return true;
        }
        return false;
    }

    public static int findSecondSmallestElement (int[] numberArray) {
        int smallestNumber = 0;
        int secondSmallestNumber = 0;

        smallestNumber = numberArray[0];
        secondSmallestNumber = numberArray[0];

        for (int i = 1; i < numberArray.length; i++) {
            if (numberArray[i] < smallestNumber) {
                smallestNumber = numberArray[i];
            }
            else if (numberArray[i] > smallestNumber && numberArray[i] < secondSmallestNumber) {
                secondSmallestNumber = numberArray[i];
            }
        }

        return secondSmallestNumber;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits("1234"));

        System.out.println(checkIfPrime(17));
        System.out.println(checkIfPrime(4));

        int[] numberArray = {3, 7, 2, 8, 1};
        System.out.println(getLargestElement(numberArray));

        System.out.println(reverseString("hello"));

        System.out.println(generateFibonacci(6));

        System.out.println(countVowels("programming"));

        int[] numberArray2 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println(sortElements(numberArray2));

        System.out.println(checkIfAnagram("listen", "silent"));

        int[] numberArray3 = {5, 3, 8, 1, 2, 9};
        System.out.println(findSecondSmallestElement(numberArray3));
    }
}
