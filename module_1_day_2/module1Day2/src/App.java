public class App {
    public static boolean checkIfOdd(int n) {
        if (n % 2 == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) throws Exception {
        // Convert F to C degrees
        float fahrenheit = 32.0f;

        float celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius);

        // Convert cm to km
        int centimeters = 100000;
        System.out.println(centimeters / 100000 + " km");

        // Check if odd
        System.out.println(checkIfOdd(9));

        // Remove search string
        String searchString = "ell";
        String mainString = "Hello World!";
        int searchStringIndex = mainString.indexOf(searchString);
        String newString = mainString.substring(0, searchStringIndex) + mainString.substring(searchStringIndex + searchString.length());
        System.out.println(newString);

        // Check if palindrome
        String text = "madam";
        text = text.toLowerCase();
        String reversedText = "";

        for (int i = 0; i < text.length(); i++) {
            reversedText = text.charAt(i) + reversedText;
          }
        
        if (text.equals(reversedText)) {
            System.out.println(text + " is a palindrome.");
        }
        else {
            System.err.println(text + " is not a palindrome.");
        }
    }
}
