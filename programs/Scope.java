package programs;

public class Scope {
    public static void main(String[] args) {
        int a=10;// value is initialized here
        int b=20;
        {
//            int a=50; // cant be initialised again here but can be used like a=20;
            int c=50;
            a=100;//canged value to 100
            // values intialised in this block,will remain in block only
        }
//        System.out.println(c);// cant be used outside the block
        System.out.println(a);//the canged value is gona be printed 100

    }
}
