package algorithms;

public class PalindromeNumber {




    public static void main(String[] args) {

        int num = 121, reverseNumber =0,originalNumber = 0,remainder;

        originalNumber = num;

        while(num != 0){

         remainder = num  % 10;
         reverseNumber = reverseNumber * 10 + remainder;

         num /= 10;
      }
      if(originalNumber == reverseNumber){
          System.out.println("palindrome Number:" + num);
      }else {
          System.out.println("Not Palindrome Number:"+num);

      }



    }



}
