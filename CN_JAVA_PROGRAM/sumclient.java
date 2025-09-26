import java.util.*;
import java.io.*;
import java.net.*;
class sumclient
{
	public static void main(String args[])
	{
		try
		{
			Scanner ni = new Scanner(System.in);
			Socket nu = new Socket("127.0.0.1",1400);
			System.out.println("Connecting to the server:");
			DataInputStream input = new DataInputStream(nu.getInputStream());
			DataOutputStream output = new DataOutputStream(nu.getOutputStream());
			System.out.println("Enter no. the element to add");
			int n = ni.nextInt();
			int arr[] = new int[n];
			output.writeInt(n);
			System.out.println("Enter the elements:");
			for(int i = 0;i<n;i++)
			{
				arr[i] = ni.nextInt();
			}
			for(int i = 0;i<n;i++)
			{
				output.writeInt(arr[i]);
			}
			
			int sum = input.readInt();
			System.out.println("The sum of the elements is " + sum);
			input.close();
			output.close();
			nu.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
		