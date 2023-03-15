import java.util.Arrays;
import java.util.Scanner;

public class Element {
    public static int largestelement(int a[])
    {
        Arrays.sort(a);
        return a[a.length-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        int result=largestelement(arr);
        System.out.println("The largest element is "+result);

    }
}
