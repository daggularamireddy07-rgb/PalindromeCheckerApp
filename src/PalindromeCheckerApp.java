import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

                String word = "madam";

                Queue<Character> queue = new LinkedList<>();
                Stack<Character> stack = new Stack<>();

                for (int i = 0; i < word.length(); i++) {
                    char ch = word.charAt(i);
                    queue.add(ch);
                    stack.push(ch);
                }

                boolean isPalindrome = true;

                for (int i = 0; i < word.length(); i++) {
                    if (queue.remove() != stack.pop()) {
                        isPalindrome = false;
                        break;
                    }
                }

                if (isPalindrome) {
                    System.out.println(word + " is a Palindrome");
                } else {
                    System.out.println(word + " is not a Palindrome");
                }
            }
        }