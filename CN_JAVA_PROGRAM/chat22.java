import java.util.*;
import java.io.*;
import java.net.*;

class ser {
    void send() {
        try {
            Scanner no = new Scanner(System.in);
            ServerSocket ss = new ServerSocket(3543);
            while (true) {
                Socket su = ss.accept();
                InputStream ur = su.getInputStream();
                InputStreamReader ns = new InputStreamReader(ur);
                BufferedReader th = new BufferedReader(ns);
                
                OutputStream ou = su.getOutputStream();
                OutputStreamWriter osi = new OutputStreamWriter(ou);
                BufferedWriter bw = new BufferedWriter(osi);

                String rec_data;
                while (true) {
                    rec_data = th.readLine(); // Read the complete line with date and message
                    if (rec_data == null || rec_data.equalsIgnoreCase("exit")) {
                        break;
                    }
                    
                    System.out.println("Received: " + rec_data); // Print the received message

                    // Prepare the response
                    Date k = new Date();
                    String sn = k.toString();
                    System.out.print(sn + " | "); // Print the timestamp for the response
                    
                    String res_msg = no.nextLine(); // Read the response

                    bw.write(sn + " | " + res_msg + "\n");
                    bw.flush(); // Flush to send immediately
                }
                su.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class chat22 {
    public static void main(String argss[]) {
        ser n = new ser();
        n.send();
    }
}
