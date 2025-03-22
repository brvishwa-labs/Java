package programs;

public class Shadowing {
    static int x=90;// this can be used everywhere inside this
    public static void main(String[] args) {
        System.out.println(x);// can be accesed here// will print 90
        int x;//local scope
//        System.out.println(x); this will give error because its only decllared not initialised
        x=50;//the shadowing will be sone here like when the x is initialised again
        System.out.println(x);// will print 50// when this is printing 50 the anathor x will be shadowed so this is called shadowing

    }
}
