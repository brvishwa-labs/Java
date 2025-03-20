package programs;

import java.util.Scanner;

public class MethodWithReturnType {
    public static void main(String[] args) {
        int a=sum();
        System.out.println(a);

    }
    static int sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1 : ");
        int a= sc.nextInt();
        System.out.println("enter number 2 : ");
        int b=sc.nextInt();
        int ans=a+b;
        return ans;


    }
}
