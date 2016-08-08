public class HelloWorld{

public static boolean isEven(int a) {
    if ((a % 2) == 0){
        return true;
    } 

    return false;
}

public static void main(String []args){
    int x = 0, y = 1, fib = 0, sum = 0;

    //Calculate Fibonacci numbers
    //System.out.println("Fibonacci numbers:");
    do {
        fib = x + y;
        y = x;
        x = fib;
        System.out.println(fib);

        if (isEven(fib) == true){
            sum += fib;
        }

    } while (fib < 4000000);


 System.out.println("Sum of even fibonacci numbers is: " + sum);   
}
}