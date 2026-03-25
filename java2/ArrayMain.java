package java2;

import java.util.Scanner;

public class ArrayMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        ArrayOperations obj = new ArrayOperations(arr);

        int choice;

        do {
            System.out.println("\n--- Array Puzzle Menu ---");
            System.out.println("1. Find Missing Number");
            System.out.println("2. Sort Array");
            System.out.println("3. Search Element");
            System.out.println("4. Find Largest Element");
            System.out.println("5. Find Smallest Element");
            System.out.println("6. Sum Pair Puzzle");
            System.out.println("7. Merge Arrays");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    obj.findMissing();
                    break;

                case 2:
                    obj.sortArray();
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    obj.searchElement(key);
                    break;

                case 4:
                    obj.findLargest();
                    break;

                case 5:
                    obj.findSmallest();
                    break;

                case 6:
                    System.out.print("Enter target sum: ");
                    int target = sc.nextInt();
                    obj.sumPair(target);
                    break;

                case 7:
                    System.out.print("Enter size of each array: ");
                    int m = sc.nextInt();
                    int[] arr1 = new int[m];
                    int[] arr2 = new int[m];
                    ArrayOperations.mergeArrays(arr1, arr2, m);
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}