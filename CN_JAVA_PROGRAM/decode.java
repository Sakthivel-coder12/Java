import java.io.*;
import java.net.*;
import java.util.*;
public class decode {
    public static void main(String[] args) {
        try {
            String dec = "";
            ServerSocket ss = new ServerSocket(1234);
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine();
            System.out.println("The received message is: " + str);
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                int ascii = (int) ch;
                int n = ascii - 2;
                dec += (char) n;
            }
            ss.close();
            System.out.println("The decoded message: " + dec);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}