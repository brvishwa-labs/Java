package assignments;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base");
        float b= sc.nextFloat();
        System.out.println("enter height");
        float h= sc.nextFloat();
        float a=0.5f*b*h;
        System.out.println("area of triangle:"+a);

    }
}
