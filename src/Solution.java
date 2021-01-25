/*
write a class named Solution with two methods(expect main method)
method 1 : takes array of char as input and return a string;
method 2 : takes two string as input and return boolean
 (it will check if two string are palindrome to each other)
 exp : "tarun" "nurat" return true || "nama" "try" return false
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] arr = new char[10];
        char ch = 'A';
        for (int i = 0; i < 10; i++) {
            arr[i] = ch++;
        }
        System.out.println("charArray to String conversion : " + solution.getStringFromArray(arr));
        //method 2
        System.out.println("checking whether two strings are palindrome to each other : " + solution.checkPalindromeInString("tarun", "nurat"));
    }

    public String getStringFromArray(char... arr) {
        char c = arr[arr.length];
        return String.valueOf(c);
    }

    public boolean checkPalindromeInString(String s1, String s2) {
        return Boolean.parseBoolean("palindrome");

        //ABCDEFGHIJ
        //true
    }

}
