package com.uniwa.client;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

//        System.out.println("\033[1m\033[34m=== Welcome to the Fancy Console App ===\033[0m");
//        System.out.println();
//        System.out.println("\033[32mGreen text\033[0m, \033[31mred text\033[0m, \033[33myellow text\033[0m");
//        System.out.println("\033[4mUnderlined\033[0m and \033[1mbold\033[0m text");
        Out out = Output.getInstance();
        out.writeRedText("Red text");
        System.out.println();

        // Save position
        System.out.print("\033[s");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Move cursor up, overwrite name prompt with confirmation
        System.out.print("\033[u"); // restore position
        System.out.print("\033[2K"); // clear line
        System.out.println("✅ Name received: \033[1m" + name + "\033[0m");

        System.out.println("\n\033[36mThanks for trying ANSI magic!\033[0m");
    }
}
