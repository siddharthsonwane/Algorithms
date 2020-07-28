package algorithms;

public class FunnyString {

    public static void main(String[] args) {
        String s = "sidd";

        System.out.println(""+reverseString(s));



    }

     static String reverseString(String s) {


        String r = (new StringBuffer(s)).reverse().toString();

        for (int i = 0; i <s.length()-1; i++) {
            if (Math.abs(((int)s.charAt(i)) - ((int)s.charAt(i + 1))) != Math.abs(((int)r.charAt(i)) - ((int)r.charAt(i + 1)))) {
                return "Not Funny";
            }
        }
        return "Funny";


    }
}
