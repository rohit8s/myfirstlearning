import java.util.Scanner;
class Mod
{
    public static void main(String[] args)
    {
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=Scan.nextInt();
        int n=num;
        if(num<0)
            num=num*-1;
        System.out.println("mod(" +n+")="+num);
    }
}