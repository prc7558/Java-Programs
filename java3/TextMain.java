package java3;

import java.util.Scanner;

public class TextMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        TextOperations obj = new TextOperations(input);

        int choice;

        do {
            System.out.println("\n===== TEXT TRANSFORMER MENU =====");
            System.out.println("1. Convert to Uppercase");
            System.out.println("2. Convert to Lowercase");
            System.out.println("3. Reverse String");
            System.out.println("4. Compare Strings");
            System.out.println("5. Word Count");
            System.out.println("6. Extract Digits");
            System.out.println("7. Search Substring");
            System.out.println("8. Replace Substring");
            System.out.println("9. Length of String");
            System.out.println("10. Palindrome Check");
            System.out.println("11. Concatenate String");
            System.out.println("12. Sort Characters");
            System.out.println("13. Enter New Text");
            System.out.println("14. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    obj.setText(obj.toUpperCase());
                    break;

                case 2:
                    obj.setText(obj.toLowerCase());
                    break;

                case 3:
                    obj.setText(obj.reverse());
                    break;

                case 4:
                    System.out.print("Enter second string: ");
                    String other = sc.nextLine();
                    obj.compareStrings(other);
                    break;

                case 5:
                    obj.countWords();
                    break;

                case 6:
                    obj.extractDigits();
                    break;

                case 7:
                    System.out.print("Enter substring to search: ");
                    String sub = sc.nextLine();
                    obj.searchSubstring(sub);
                    break;

                case 8:
                    System.out.print("Replace: ");
                    String oldStr = sc.nextLine();
                    System.out.print("With: ");
                    String newStr = sc.nextLine();
                    obj.setText(obj.replaceSubstring(oldStr, newStr));
                    break;

                case 9:
                    obj.lengthOfString();
                    break;

                case 10:
                    obj.checkPalindrome();
                    break;

                case 11:
                    System.out.print("Enter string to add: ");
                    String s2 = sc.nextLine();
                    obj.setText(obj.concatenate(s2));
                    break;

                case 12:
                    obj.sortCharacters();
                    break;

                case 13:
                    System.out.print("Enter new text: ");
                    obj.setText(sc.nextLine());
                    break;

                case 14:
                    System.out.println("Exiting... Thank You! Program Ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 14);

        sc.close();
    }
}