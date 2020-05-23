package algorithms;

public class LongestPalindromeSubstring {

    public static void main(String[] args) {

        String str = "siddharth";
        System.out.println("Longest str:"+ longestPalSubString(str));


    }

    private static int longestPalSubString(String str) {

         int n  = str.length();

         boolean table[][] = new boolean[n][n];

         //  all substring of length 1 are palindrome
         int maxLenght =1;

         for (int i=0;i<n;i++)
             table[i][i] = true;

         // check substring of lenght 2
          int start = 0;
          for(int i=0;i<n-1;i++){
              if (str.charAt(i) == str.charAt(i+1)){
                  table[i][i+1] = true;
                  start = i;
                  maxLenght =2;

              }

          }
          // check for lenght greather than 2 k is the lenght

          for (int k = 3; k< n; k++){

              //  fix the starting index

              for (int i=0;i<n-k+1;i++){

                  // Get the ending index of substring from
                  // starting index i and length k
                  int j = i +k-1;
                  // checking for sub-string from ith index to
                  // jth index iff str.charAt(i+1) to
                  // str.charAt(j-1) is a palindrome
                  if (table[i+1][j-1] && str.charAt(i) == str.charAt(j)){

                      table[i][j] = true;
                      if (k > maxLenght){
                           start =i;
                           maxLenght =k;

                      }
                  }

              }


          }

        System.out.println("longest palindrome string is:");
        printSubStr(str,start,start +maxLenght -1);


        return maxLenght;

    }

    private static void printSubStr(String str, int low, int high) {
        System.out.println(str.substring(low,high+1));
    }


}
