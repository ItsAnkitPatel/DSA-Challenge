import java.util.Arrays;
import java.util.Scanner;

public class secondlargest {

        public static int secondlargest(int arr[])
        {
            Arrays.sort(arr);
            int max=arr[arr.length-1];
            for(int i= arr.length-2;i>=0;i--)
            {
                if(arr[i]<max)
                    return arr[i];

            }
            return -1;
        }
    public static int secondsmallest(int arr[])
    {
        Arrays.sort(arr);
        int min=arr[0];
        for(int i= 1;i<arr.length;i++)
        {
            if(arr[i]>min)
                return arr[i];

        }
        return -1;
    }        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the elements of the array");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            if(secondlargest(arr)==-1)
                System.out.println("Element does not exist");
            else
            System.out.println("The second largest element is "+secondlargest(arr));
        if(secondsmallest(arr)==-1)
            System.out.println("Element does not exist");
        else
            System.out.println("The second smallest is "+secondsmallest(arr));
        }
    }


