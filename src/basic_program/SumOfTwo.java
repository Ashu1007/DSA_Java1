package basic_program;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First no: ");
        int a=sc.nextInt();
        System.out.print("Enter the Second no: ");
        int b=sc.nextInt();
        System.out.print("Enter the third no: ");
        int c=sc.nextInt();

        int d=(a+b+c);
        System.out.println("Total value is: "+d);
    }
}
