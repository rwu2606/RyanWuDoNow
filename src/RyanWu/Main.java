package RyanWu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in an integer");
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("The sum from 1 to " + num + " is " + sum);
    }
}
