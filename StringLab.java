import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {

        // =====================================
        // Task 1: Working with String Methods
        // =====================================
        System.out.println("=== Task 1: String Methods ===");

        String str = " Welcome to the Java String Lab! ";

        // length()
        System.out.println("Length: " + str.length());

        // charAt()
        System.out.println("Character at index 7: " + str.charAt(7));

        // substring() - Extract "Java"
        System.out.println("Substring: " + str.substring(12, 16));

        // toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // indexOf()
        System.out.println("Index of Java: " + str.indexOf("Java"));

        // contains()
        System.out.println("Contains Lab: " + str.contains("Lab"));

        // replace()
        System.out.println("Replace: "
                + str.replace("Java", "Java Programming"));

        // split()
        System.out.println("Words:");
        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }

        // trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // equals() and equalsIgnoreCase()
        String comparison = "java string lab!";

        System.out.println("equals(): "
                + comparison.equals(str));

        System.out.println("equalsIgnoreCase(): "
                + comparison.equalsIgnoreCase(str));

        // =====================================
        // Task 2: Loop Challenges with Strings
        // =====================================
        System.out.println("\n=== Task 2: Loop Challenges ===");

        // For Loop: Count vowels
        int vowels = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }

        System.out.println("Number of vowels: " + vowels);

        // While Loop: Check for a palindrome
        String palindrome = "racecar";
        int left = 0;
        int right = palindrome.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (palindrome.charAt(left) != palindrome.charAt(right)) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(palindrome + " is a palindrome.");
        } else {
            System.out.println(palindrome + " is not a palindrome.");
        }

        // Do...While Loop: Input validation
        Scanner scanner = new Scanner(System.in);
        String sentence;

        do {
            System.out.print("Enter a sentence containing Java: ");
            sentence = scanner.nextLine();
        } while (!sentence.contains("Java"));

        System.out.println("Thank you!");

        // =====================================
        // Task 3: Working with StringBuilder
        // =====================================
        System.out.println("\n=== Task 3: StringBuilder ===");

        StringBuilder sb = new StringBuilder("StringBuilder Lab");

        // append()
        sb.append(" - Learning Java");
        System.out.println("After append: " + sb);

        // insert() - Insert after "Lab"
        int insertPosition = sb.indexOf("Lab") + "Lab".length();
        sb.insert(insertPosition, " is fun");
        System.out.println("After insert: " + sb);

        // delete() - Delete "Learning"
        int deleteStart = sb.indexOf("Learning");
        if (deleteStart != -1) {
            sb.delete(deleteStart, deleteStart + "Learning".length());
        }
        System.out.println("After delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // =====================================
        // Task 4: Working with StringBuffer
        // =====================================
        System.out.println("\n=== Task 4: StringBuffer ===");

        StringBuffer buffer = new StringBuffer("Multithreading Lab");

        // append()
        buffer.append(" - Learning Java");
        System.out.println("After append: " + buffer);

        // insert() - Insert after "Lab"
        int bufferInsertPosition =
                buffer.indexOf("Lab") + "Lab".length();
        buffer.insert(bufferInsertPosition, " is fun");
        System.out.println("After insert: " + buffer);

        // delete() - Delete "Learning"
        int bufferDeleteStart = buffer.indexOf("Learning");
        if (bufferDeleteStart != -1) {
            buffer.delete(bufferDeleteStart,
                    bufferDeleteStart + "Learning".length());
        }
        System.out.println("After delete: " + buffer);

        // reverse()
        buffer.reverse();
        System.out.println("After reverse: " + buffer);

        scanner.close();
    }
}