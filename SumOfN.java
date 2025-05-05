public class SumOfN {

    // For loop method to calculate sum of first n numbers
//    static int sumOfNumbers(int n) {
//        int sum = 0;
//        for(int i = 0; i <= n; i++) {
//            sum += i;
//        }
//        return sum;
//    }

    //USING WHILE LOOP
//    static int sumOfNumbers(int n){
    //        int sum = 0;
    //        int i = 0;
    //        while(i<=n) {
    //            sum += i;
    //            i++;
    //        }
    //        return sum;
    //    }


    //using formula
//    static int sumOfNumbers(int n){
//        int sum = (n*(n+1)/2);
//        return sum;
//    }

    //using Recursion
    static int sumOfNumbers(int n){
        if(n == 0) return 0;
        return n + sumOfNumbers(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        int sum = sumOfNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
