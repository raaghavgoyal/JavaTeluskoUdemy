public class test1 {
    public static void main(String[] args) {
        //test for VLink org (pre-screening)
        //write factorial using recursive method and consider edge cases
        int n = 5;

        int ans = factorial(n);
        System.out.println(ans);

    }
    static int factorial(int n){
        //base case
        if(n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
