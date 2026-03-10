public class PalindromeCheckerApp {

    public static void main(String[] args) {

                String original = "level";
                String reverse = "";

                for (int i = original.length() - 1; i >= 0; i--) {
                    reverse = reverse + original.charAt(i);
                }

                if (original.equals(reverse)) {
                    System.out.println("The string is a Palindrome");
                } else {
                    System.out.println("The string is not a Palindrome");
                }

            }
        }


