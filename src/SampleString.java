public class SampleString {
    public static void main(String[] args) {
        //declare the String as an object S1 S2
        String S1 = "Hello Java String Method";
        String S2 = "RockStar";

        //length() method of String returns the length of a String S1.
        int length = S1.length();
        SampleString sampleString = new SampleString();
        System.out.println("Length of a String is: " + sampleString.getStringLength(S1));
        //8 Length of a String RockStar
        System.out.println("Length of a String is: " + sampleString.getStringLength(S2));
    }
    public int getStringLength(String str)
    {
        return str.length();
    }
}

