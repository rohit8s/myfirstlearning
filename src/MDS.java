import java.util.Scanner;
class MeanAndStandardDeviation
{
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        double[] input=new double[n];
        double sum=0,mean;
        System.out.println("enter n elements");
        for(int i=0;i<n;i++)
        {
            input[i]=sc.nextDouble();
            sum=sum+input[i];
        }
        mean=sum/n;
        System.out.println("Mean :"+mean);
        sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Math.pow((input[i]-mean),2);
        }
        mean=sum/(n-1);
        double deviation=Math.sqrt(mean);
        System.out.println("standard deviation :"+deviation);
    }
}