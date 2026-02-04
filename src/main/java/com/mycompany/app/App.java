package com.mycompany.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Code Smell: Use of System.out instead of a logger
        System.out.println("Welcome to Sonarqube Demo!");

        // Vulnerability: Hardcoded secret
        String password = "admin123";

        // Bug: Incorrect string comparison using '=='       
        System.out.print("Enter username: ");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        System.out.println(checkUser(user));

        if (user == "admin") {
            System.out.println("Access granted to admin user.");
        } else {
            System.out.println("Access denied.");
        }

        // Code Smell: Resource (Scanner) not closed properly
        // sc.close(); // intentionally commented out
    }

    static String checkUser(String user) {
    if (user.equals("admin")) {
        return "Access granted";
    }
    return "Access denied";
}
}
