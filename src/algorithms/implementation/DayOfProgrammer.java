package algorithms.implementation;

import java.util.Scanner;

public class DayOfProgrammer {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the year:");

        String date = "";

        int year = in.nextInt();

         if(year < 1918 ){

             date += (year % 4 == 0) ? (256 - 244)+".09"+""+year:(256 - 243)+".09."+""+year;

        }else if(year == 1918) {                                           //Special case: transition year
             date += "26.09." + year;
         } else {                                                            //Gregorian check for leap year
             date += ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? (256 - 244)+".09."+""+year:(256 - 243)+".09."+""+year;
         }
        System.out.println("date:"+date);
   }

}
