package programs;

public class WithArgInMethod {
    public static void main(String[] args) {
        System.out.println(sum(2,3));
    }
    
    static int sum(int a,int b){
        int ans=a+b;
        return ans;
    }
}
