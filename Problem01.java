/**
 *
 * @author Hanbi Hanz Choi
 */
public class Problem01 {

    public static long getSumOfPrimes(int n){
        // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
        //          Test your solution
        //          Analyze its space and time

        long sum = 0; // initialize the sum to 0
        for (int i = 2; i <= n; i++) { // iterate over all numbers from 2 to n
            if (isPrime(i)) { // check if the number is prime
                sum += i; // if it is prime, add it to the sum
            }
        }
        return sum; // return the sum of prime numbers
    }

    private static boolean isPrime(int n) {
        if (n <= 1) { // 1 and below are not prime
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // check divisibility by numbers from 2 to sqrt(n)
            if (n % i == 0) { // if n is divisible by i, it's not prime
                return false;
            }
        }
        return true; // n is prime
    }

    public static void main(String[] args) {
        System.out.println(getSumOfPrimes(22)); //77
        System.out.println(getSumOfPrimes(290)); //7982
        System.out.println(getSumOfPrimes(123)); //1593
    }


}