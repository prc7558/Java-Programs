package java2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    private int[] arr;

    public ArrayOperations(int[] arr) {
        this.arr = arr;
    }

    public void findMissing() {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        System.out.println("Missing Number: " + (expectedSum - actualSum));
    }

    public void sortArray() {
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public void searchElement(int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    public void findLargest() {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        System.out.println("Largest Element: " + max);
    }

    public void findSmallest() {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        System.out.println("Smallest Element: " + min);
    }

    public void sumPair(int target) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair: (" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }

    public static void mergeArrays(int arr1[], int arr2[], int m) {
        Scanner sc = new Scanner(System.in);
        int i, j, i1 = 0, i2 = 0;
        System.out.print("Enter elements of arr1: ");
        for (i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter elements of arr2: ");
        for (i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int mergedArray[] = new int[2 * m];
        for (j = 0; j < 2 * m; j++) {
            int a1min = 99999, a2min = 99999;
            for (i = 0; i < m; i++) {
                if (arr1[i] < a1min) {
                    a1min = arr1[i];
                    i1 = i;
                }
                if (arr2[i] < a2min) {
                    a2min = arr2[i];
                    i2 = i;
                }
            }
            if (a1min < a2min) {
                mergedArray[j] = a1min;
                arr1[i1] = 100000;
            } else {
                mergedArray[j] = a2min;
                arr2[i2] = 100000;
            }
        }
        System.out.print("Merged Array: ");
        for (i = 0; i < 2 * m; i++) {
            System.out.print(" " + mergedArray[i]);
        }
        System.out.println();
    }
}