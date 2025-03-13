package programs;

public class Day5 {
    public static void main(String[] args) {
//           finding max value
        int a =10;
        int b =20;
        int c =130;
        int max=a;
        if (b>max)
            max=b;
        if(c>max) max = c;
        System.out.println(max);
    }
}
