public class recursion {   

    private static void printDec(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }
    
    private static void printInc(int n) {
        if(n==0){
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    private static int factorial(int n) {
        if(n == 1){
            return 1;
        }
        int num1 = factorial(n-1);
        int ans = num1 * n;
        return ans;
    }

    private static int fibonacci(int n) {
        if(n==0 || n==1){
            return n;
        }
        
        int fib1 = fibonacci(n-1);
        int fib2 = fibonacci(n-2);
        int ans = fib1 + fib2;
        return ans;
    }
    
    private static void printDecInc(int n) {
        if( n == 0){
            return;        
        }
        if(n % 2 != 0){
            System.out.println("Bye : " + n);
        }
        printDecInc(n-1);
        if(n % 2 == 0){
            System.out.println("Hi : " + n);
        }
    }

    public static void main(String[] args) {
        // printDec(5);
        // printInc(5);        
        // System.out.println(factorial(4));
        // System.out.println(fibonacci(8));
        printDecInc(5);
    }


   

    
    
}

// Fibonacci no
// 0 1 1 2 3 5 8 13 21

// hi(odd)(dec)     bye(even)(inc)
// 6

// 1 2 3 4 5 6
// hi/bye 5 3 1
// bye/hi 2 4 6 


