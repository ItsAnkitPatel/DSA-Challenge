import java.util.Scanner;

public class bestsecLarge {

     public static int seclarge(int arr[])
     {
         int large=arr[0];
         int seclarge=Integer.MIN_VALUE;
         for(int i =1;i<arr.length;i++)
         {
             if(arr[i]>large)
             {
                 seclarge=large;
                 large=arr[i];

             } else if (arr[i]<large && arr[i]>seclarge) {
                 seclarge=arr[i];
             }
         }
         return seclarge;
     }
     public static int secsmall(int arr[])
     {
         if (arr.length < 2)
         {
             return -1;
         }
         int small = Integer.MAX_VALUE;
         int second_small = Integer.MAX_VALUE;
         int i;
         for (i = 0; i < arr.length; i++)
         {
             if (arr[i] < small)
             {
                 second_small = small;
                 small = arr[i];
             }
             else if (arr[i] < second_small && arr[i] != small)
             {
                 second_small = arr[i];
             }
         }
         return second_small;
     }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the elements of the array");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
int smallestsec=secsmall(arr);
            int seclargest=seclarge(arr);
            System.out.println("Sec smallest is "+smallestsec);
            System.out.println("Sec largest is "+seclargest);

        }
    }


