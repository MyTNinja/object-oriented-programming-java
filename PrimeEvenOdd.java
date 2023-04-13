public class PrimeEvenOdd {
    public static boolean isPrime(int n) {
        boolean flag = true;

        for(int i = 2; i<n; i++) {
            if(n%i==0) flag = false;
        }

        return flag;
    }

    public static boolean isEven(int n) {
        return n%2==0;
    }

    public static void main(String[] args) {
        int num = 10;

        //prime
        System.out.print("PRM numbers between 1 and "+ num + ":\t\t");
        for(int i = 1; i<=num; i++) {
            if(isPrime(i)) System.out.print(i + "\t");
        }

        System.out.print("\nEVN numbers between 1 and "+ num + ":\t\t");
        for(int i = 1; i<=num; i++) {
            if(isEven(i)) System.out.print(i + "\t");
        }

        System.out.print("\nODD numbers between 1 and "+ num + ":\t\t");
        for(int i = 1; i<=num; i++) {
            if(!isEven(i)) System.out.print(i + "\t");
        }
    }
}
