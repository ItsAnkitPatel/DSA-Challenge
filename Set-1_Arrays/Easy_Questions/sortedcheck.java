import java.util.Scanner;

public class sortedcheck {
public static boolean check(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[i])
                return false;
        }
    }
    return true;
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
        System.out.println(check(arr));

    }
}
