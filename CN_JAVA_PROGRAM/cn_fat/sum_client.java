import java.util.*;
import java.io.*;
import java.net.*;
public class sum_client 
{
    public static void main(String args[])
    {
        try
        {
            Scanner ni = new Scanner(System.in);
            Socket ss = new Socket("127.0.0.1",1400);
            OutputStream os = ss.getOutputStream();
            InputStream is = ss.getInputStream();
            DataInputStream input = new DataInputStream(is);
            DataOutputStream output = new DataOutputStream(os);

            System.out.println("Enter the number of elements :");
            int n = ni.nextInt();
            int arr[] = new int[n];
            output.writeInt(n);

            System.out.println("Enter the elements :");
            for(int i = 0 ;i<n;i++)
            {
                arr[i] = ni.nextInt();
            }
            for(int j = 0;j<n;j++)
            {
                output.writeInt(arr[j]);
            }

            int res = input.readInt();
            System.out.println("The sum of the number is :" + res);

            output.close();
            input.close();
            is.close();
            os.close();
            ss.close();
            
        }    
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
