package assignments;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of circle");
        float r= sc.nextFloat();
        float a=r*r;
        System.out.println("Area of circle is :"+a);

    }

}
