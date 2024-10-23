import java.util.Scanner;

public class binary_add {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first binary number:");
        String binary1 = scanner.nextLine();
        System.out.println("Enter the second binary number:");
        String binary2 = scanner.nextLine();
        
        int length1 = binary1.length();
        int length2 = binary2.length();

        String qn1 = "";
        int sc = 0;

        if(length1>length2)
        {
            sc = length1;
            for(int i = 0; i< length1 ; i++)
            {
                qn1 += '0';
            }
        }
        else
        {
            sc = length2;
            for(int i = 0; i< length2 ; i++)
            {
                qn1 += '0';
            }
        }
        System.out.println("The ninardhs" + (qn1+binary1));
        System.out.println("The sc value is " + sc);
        
        System.out.println("The length of binary number 1 is: " + length1);
        System.out.println("The length of binary number 2 is: " + length2);
        char fir =  binary1.charAt(length1-1);
        char ls =  binary2.charAt(0);
        if( fir == '0' && ls == '0')
        {
            int sift = length2>>1;
            String arg = Integer.toBinaryString(sift);
            System.out.println("The right shifted value is :" + arg);
        }
        scanner.close();
    }
}
