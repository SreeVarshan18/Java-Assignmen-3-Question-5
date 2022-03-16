package com.harman.question5;

import java.util.Scanner;

public class Mainfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer year, a;
        System.out.println("Enter year of birth");
        year = input.nextInt();

        Checkleap obj = new Checkleap();
        a= obj.leapcheck(year);
        if(a==1){
            System.out.println(+year+" is a leap year");
        }
        else{
            System.out.println(+year+" is not a leap year");
        }
    }
}
