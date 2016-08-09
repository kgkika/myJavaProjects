package helloWorld;

public class HelloWorld{

static boolean isPrime(long n){
    //if number is divided by 2 and is not 2
    if ((n % 2 == 0) && (n != 2)){
       // System.out.println("Number " + n + " is not prime.");
        return false;
    }
    for (long i = 3; i <= n - 1; i++) {

        if ((n % i) == 0){
          //  System.out.println("Number " + n + " is not prime.");
            return false;
        }
    }
   // System.out.println("Number " + n + " is prime.");
    return true;
}


public static void main(String []args){

    //The prime factors of 13195 are 5, 7, 13 and 29.
    //What is the largest prime factor of the number 600851475143 ?

    long bigNum = 600851475143L;
    //long bigNum = 13195L;
    long count = 0;
    System.out.println(isPrime(bigNum));

    for (long i = 3; i <= bigNum - 1; i++) {
        if (bigNum % i == 0){
            if (isPrime(i)){
                System.out.println("Prime Factor: " + i);
                count = i;
            }
        } 

    }

    System.out.println("Largest prime factor: " + count);

 }
}