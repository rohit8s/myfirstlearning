/*
write a class named Solution with two methods(expect main method)
method 1 : takes array of char as input and return a string;
method 2 : takes two string as input and return boolean
 (it will check if two string are palindrome to each other)
 exp : "tarun" "nurat" return true || "nama" "try" return false
 */
public class Solution {
    public static void main(String[] args) {

        String S1 = "Method 1";
        String S2 = "Method 2";

        int length = S1.length();
        SampleString sampleString = new SampleString();
        System.out.println("Length of a String is: " + sampleString.getStringLength(S1));
        System.out.println("Length of a String is: " + sampleString.getStringLength(S2));
    }
    public int getStringLength(String str)
    {
        return str.length();
    }
}
