/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("You have 5 attempts to guess the number:");
        int random = (int) ((Math.random() * 100) + 1);
        Scanner sc = new Scanner(System.in);
        int attemptCount = 1;
        while (attemptCount <= 5) {
            int user = sc.nextInt();
            if (user > random) {
                System.out.println("Your guess is too high");
            } else if (user < random) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Your guess is correct");
                System.out.println("You guessed it in attempt " + attemptCount);
                sc.close(); 
                break;
            }
            attemptCount++;
        }
        System.out.println("You failed to guess the number");
        System.out.println("The number generated is " + random);
        sc.close(); 
    }
}


