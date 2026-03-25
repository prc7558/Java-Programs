package java3;

public class TextOperations {

    private String text;

    public TextOperations(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toUpperCase() {
        char arr[] = text.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z')
                arr[i] = (char) (arr[i] - 32);
        }
        String result = new String(arr);
        System.out.println("Uppercase: " + result);
        return result;
    }

    public String toLowerCase() {
        char arr[] = text.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z')
                arr[i] = (char) (arr[i] + 32);
        }
        String result = new String(arr);
        System.out.println("Lowercase: " + result);
        return result;
    }

    public String reverse() {
        char arr[] = text.toCharArray();
        int start = 0, end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String result = new String(arr);
        System.out.println("Reversed: " + result);
        return result;
    }

    public void compareStrings(String other) {
        if (text.length() != other.length()) {
            System.out.println("Strings are not equal");
            return;
        }
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != other.charAt(i)) {
                System.out.println("Strings are not equal");
                return;
            }
        }
        System.out.println("Strings are equal");
    }

    public void countWords() {
        if (text.length() == 0) {
            System.out.println("Word count: 0");
            return;
        }
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Word count: " + count);
    }

    public void extractDigits() {
        System.out.print("Digits: ");
        boolean found = false;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= '0' && ch <= '9') {
                System.out.print(ch + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("No digits found");
        }
        System.out.println();
    }

    public void searchSubstring(String sub) {
        int n = text.length();
        int m = sub.length();
        boolean found = false;
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Substring present");
        else
            System.out.println("Substring not present");
    }

    public String replaceSubstring(String oldStr, String newStr) {
        String result = "";
        int n = text.length();
        int m = oldStr.length();
        int i = 0;
        while (i <= n - m) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != oldStr.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                result += newStr;
                i += m;
            } else {
                result += text.charAt(i);
                i++;
            }
        }
        while (i < n) {
            result += text.charAt(i);
            i++;
        }
        System.out.println("After Replacement: " + result);
        return result;
    }

    public void lengthOfString() {
        System.out.println("Length: " + text.length());
    }

    public void checkPalindrome() {
        String rev = new StringBuilder(text).reverse().toString();
        if (text.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }

    public String concatenate(String s2) {
        String result = text.concat(s2);
        System.out.println("Concatenated: " + result);
        return result;
    }

    public void sortCharacters() {
        char arr[] = text.toCharArray();
        java.util.Arrays.sort(arr);
        System.out.println("Sorted: " + new String(arr));
    }
}