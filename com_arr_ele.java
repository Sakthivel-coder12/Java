    import java.util.*;
    public class com_arr_ele
    {
        public static void main(String args[])
        {
            Scanner ni = new Scanner(System.in);
            System.out.print("Ente the number of elements for array one:");
            int n = ni.nextInt();
            int arr1[] = new int[n];
            System.out.print("Enter the element for array one:");
            for(int i = 0 ; i<n; i++)
            {
                arr1[i] = ni.nextInt();
            }
            System.out.print("Ente the number of elements for array two:");
            int m = ni.nextInt();
            int arr2[] = new int[m];
            System.out.print("Enter the element for array two:");
            for(int i = 0 ; i<m; i++)
            {
                arr2[i] = ni.nextInt();
            }
            System.out.println("The comman elements in all the arrays are:");
            for(int i = 0 ; i<n; i++)
            {
                for(int j = 0 ;j<m;j++)
                {
                    if(arr1[i] == arr2[j])
                    {
                        System.out.println(arr1[i]);
                    }
                }
            }
        }
    }
