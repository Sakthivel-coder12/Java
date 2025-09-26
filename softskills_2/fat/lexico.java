import java.util.Scanner;

public class lexico 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();

        int[] freq = new int[26];
        StringBuilder half = new StringBuilder(), oddChar = new StringBuilder();

        // Count the frequency of each character
        for (char c : str.toCharArray()) freq[c - 'a']++;

        // Build half of the palindrome and identify any odd frequency characters
        for (int i = 0; i < 26; i++) 
        {
            char ch = (char) (i + 'a');
            if (freq[i] % 2 != 0) 
            {
                oddChar.append(ch);
            }
            half.append(String.valueOf(ch).repeat(freq[i] / 2));
        }

        // Check if more than one odd character exists
        if (oddChar.length() > 1) {
            System.out.println("No Palindromic String");
        } else {
            // Construct the final palindromic string
            StringBuilder palindromicString = new StringBuilder(half);
            String result = palindromicString.toString() + oddChar.toString() + palindromicString.reverse().toString();
            System.out.println(result);
        }
    }
}
