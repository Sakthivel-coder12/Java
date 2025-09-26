import java.util.*;
import java.io.*;
import java.net.*;
public class encode {
    public static void main(String[] args) {
        Scanner ni = new Scanner(System.in);
        try {
            String str = "";
            Socket s = new Socket("localhost", 1234);
            OutputStream os = s.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            System.out.println("Enter the message that you want to send:");
            String ss = ni.next();
            for (int i = 0; i < ss.length(); i++) {
                char ch = ss.charAt(i);
                int ascii = (int) ch;
                int n = ascii + 2;
                str += (char) n;
            }
            System.out.println("The encoded msg is: " + str);
            bw.write(str);
            bw.flush();
            os.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
