import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter the first number");
        x=sc.nextInt();
        System.out.println("enter the second number");
        y=sc.nextInt();
        System.out.println("Please enter \n1  for Addition\n2 for Subtraction\n3 for multiplication\n4 for division");
        String operation = sc.next();
        switch (operation)
        {
            case "1":{
                System.out.println("result of the addition is :" + (x+y));
                break;
            }
            case "2":{
            System.out.println("result of the subtraction is :" + (x-y));
            break;
        }
            case "3":{
                System.out.println("result of the mutliply is :" + (x*y));
                break;
            }
            case "4":{
                System.out.println("result of the division is :" + (x/y));
                break;
            }
            default:
            {
                System.out.println("please enter the coorect option");
            }


        }
    }
}
