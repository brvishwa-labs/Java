package programs;

import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
//           finding max value
//        int a =10;
//        int b =20;
//        int c =130;
//        int max=a;
//        if (b>max)
//            max=b;
//        if(c>max) max = c;
//        System.out.println(max);
//        int max = Math.max(c,Math.max(a,b));//anathor method
//
//        System.out.println(max);
        // char to number
//
//        Scanner sc=new Scanner(System.in);
//        int ch=sc.next().trim().charAt(0);
//        System.out.println(ch);
//
//        Scanner sc=new Scanner(System.in);
//        char ch=sc.next().trim().charAt(0);
//        if (ch>='a'&& ch<='z')
//            System.out.println("lower case");
//        else if (ch>='A'&& ch<='Z') {
//            System.out.println("upper case");
//        }
// find nth fibonaci number
//Scanner sc= new Scanner(System.in);
//int n=sc.nextInt();
//int a=0;
//int b=1;
//int count=2;
//while (count<=n){
//    int temp=b;
//    b=b+a;
//    a=temp;
//    count++;
//
//}
//        System.out.println(b);

//        count the number  of num in the num
//        Scanner sc=new Scanner(System.in);
//        int a = sc.nextInt();
//        int c=0;
//        while (a>0){
//            if(a%10==3){
//                c++;
//            }
//        a=a/10;
//        }
//        System.out.println(c);

//        reverse the number and print it
//        Scanner sc=new Scanner(System.in);
//        int a= sc.nextInt();
//        int ans=0;
//        while (a>0){
//            int temp=a%10;
//            a/=10;
//            ans=ans*10+temp;
//        }
//        System.out.println(ans);

//        CALCUlATOR PROGRAM
        Scanner sc=new Scanner(System.in);

        while(true){
            int ans=0;
            System.out.println("Enter The Operator");
            char ch=sc.next().trim().charAt(0);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                System.out.println("ENter the NUmber 1 aND 2");
                int num1= sc.nextInt();
                int num2= sc.nextInt();
                if(ch=='+'){
                    ans=num1+num2;
                }
                if(ch=='-'){
                    ans=num1-num2;
                }
                if (ch=='*'){
                    ans=num1*num2;
                }
                if (ch=='/'){
                    ans=num1/num2;
                }
            } else if (ch=='x'||ch=='X') {
                break;

            }else {
                System.out.println("Invalid Input");
            }
            System.out.println(ans);


        }




    }
}
