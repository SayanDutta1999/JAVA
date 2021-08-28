public class recursionjava {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
        System.out.println("factorial number is:" + " " + fac(5));  
    }
    public static int fac(int n){
        if( n == 1 ){
            return 1;
        }
        else{
            return n * fac(n - 1);
        }
    }

    // halting Condition
    public static int sum(int start, int end) {
        if (start < end) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

}
