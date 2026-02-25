package basic_program;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value: ");

        int r= sc.nextInt();
        double v=(double)4/3*3.1415*r*r*r; //also 4.0/3

        System.out.println("Volume of Sphere: "+v);
    }
}
