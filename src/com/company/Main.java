package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("What do you want to do, available commands: Read, Exit");
            try {
                Scanner scanner = new Scanner(System.in);
                BmpReader reader = new BmpReader();
                String command = scanner.nextLine().strip().toLowerCase();
                System.out.println("Enter input filepath and output filepath separated by space");
                String[] filePaths = scanner.nextLine().split(" ");
                if (filePaths.length > 1 || command.equals("exit")) {
                    switch (command) {
                        case "exit":
                            System.exit(0);
                            break;
                        case "read":
                            reader.read(filePaths[0], filePaths[1]);
                            break;
                        default: throw new Exception("Wrong input, check your input and try again");
                    }
                } else {
                    throw new Exception("Wrong input, check your input and try again");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


}
