package algorithms;

public class FunnyString {

    public static void main(String[] args) {
        String s = "acxz";

        System.out.println(""+reverseString(s));



    }

     static String reverseString(String s) {


        String r = (new StringBuffer(s)).reverse().toString();

        for (int i = 1; i < s.length(); i++) {
            if (Math.abs(((int)s.charAt(i)) - ((int)s.charAt(i-1))) != Math.abs(((int)                 r.charAt(i)) - ((int)r.charAt(i-1)))) {
                return "Not Funny";
            }
        }
        return "Funny";


    }
}
