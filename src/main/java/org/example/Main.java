package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float Price = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String membershipStatus = scanner.nextLine().toUpperCase();
        System.out.print("Enter age: ");
        int memberAge = scanner.nextInt();

        if (membershipStatus.equals("REGULAR")){
            if (memberAge < 18){
                System.out.printf("Price: $%.2f", Price + 50.00);
            }
            else if (memberAge <= 64){
                System.out.printf("Price: $%.2f", Price + 100.00);
            }
            else {
                System.out.printf("Price: $%.2f", Price + 75.00);
            }
        }
        else if (membershipStatus.equals("VIP")){
            if (memberAge < 18){
                System.out.printf("Price: $%.2f", Price + 75.00);
            }
            else if (memberAge <= 64){
                System.out.printf("Price: $%.2f", Price + 150.00);
            }
            else {
                System.out.printf("Price: $%.2f", Price + 112.50);
            }
        }
        else if (membershipStatus.equals("PREMIUM")){
            if (memberAge < 18){
                System.out.printf("Price: $%.2f", Price + 100.00);
            }
            else if (memberAge <= 64){
                System.out.printf("Price: $%.2f", Price + 200.00);
            }
            else {
                System.out.printf("Price: $%.2f", Price + 150.00);
            }
        }
        else System.out.println("Invalid membership status entered.");
    }
}