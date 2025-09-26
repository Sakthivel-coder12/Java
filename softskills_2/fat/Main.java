import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();

        int[] freq = new int[26];
        StringBuilder half = new StringBuilder(), oddChar = new StringBuilder();
        
        for (char c : str.toCharArray()) freq[c - 'a']++;
        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');
            if (freq[i] % 2 != 0) oddChar.append(ch);
            for (int j = 0; j < freq[i] / 2; j++) half.append(ch);
        }

        if (oddChar.length() > 1) {
            System.out.println("No Palindromic String");
        } else {
            StringBuilder palindromicString = new StringBuilder(half);
            String result = palindromicString.toString() + oddChar + palindromicString.reverse().toString();
            System.out.println(result);
        }
    }
}
