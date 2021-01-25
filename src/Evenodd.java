import java.util.Scanner;

public class Evenodd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        Evenodd evenodd = new Evenodd();
        System.out.println(evenodd.checkEvenOdd(num));
    }
    public int checkEvenOdd(int num)
    {

        if(num % 2 == 0)
            return (num*num );
        else
            return (num*num*num);
    }
}
