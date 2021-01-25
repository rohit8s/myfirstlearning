import java.util.Scanner;

/* Java Program to find sum of elements in a given array  */
class Sumofarray
{

    // method for sum of elements in an array
    public  int sum(int... arr)
    {
        int sum = 0; // initialize sum
        int i;
        // Iterate through all elements and add them to sum
        for (i = 0; i < arr.length; i++)
            sum +=  arr[i];
        return sum;
    }

    // Driver method
    public static void main(String[] args)
    {
//        int[] arr = {12,3,4,15};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println(String.format("Enter the %d element",i+1));
            arr[i] = sc.nextInt();
        }
        Sumofarray obj = new Sumofarray();
        System.out.println("Sum of given array is " + obj.sum(arr));
    }
}