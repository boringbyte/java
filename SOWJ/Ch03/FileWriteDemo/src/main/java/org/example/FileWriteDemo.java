package org.example;

import java.io.*;
import java.util.Scanner;

/**
 *  This program writes data to a file.
 */

public class FileWriteDemo {
    public static void main(String[] args) throws IOException{
        String filename;
        String friendName;
        int numFriends;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many friends do you have ? ");
        numFriends = keyboard.nextInt();

        keyboard.nextLine();

        System.out.print("Enter the filename: ");
        filename = keyboard.nextLine();

        PrintWriter outputFile = new PrintWriter(filename);

        for (int i = 1; i <= numFriends; i++) {
            System.out.print("Enter the name of friend number " + i + ": ");
            friendName = keyboard.nextLine();
            outputFile.println(friendName);
        }
        outputFile.close();
        System.out.println("Data written to the file.");

        FileWriter fileWriter = new FileWriter("MyFriends.txt", true);
        PrintWriter newOutputFile = new PrintWriter(fileWriter);
        newOutputFile.println("Bill");
        newOutputFile.println("Steven");
        newOutputFile.println("Sharon");
        newOutputFile.close();

        Scanner readKeyboard = new Scanner(System.in);
        System.out.print("Enter name of a file: ");
        String readFilename = readKeyboard.nextLine();

        File file = new File(readFilename);
        if (!file.exists()) {
            System.out.printf("The file %s is not found.", readFilename);
            System.exit(0);
        }
        Scanner inputFile = new Scanner(file);

        String line = inputFile.nextLine();
        System.out.println("The first line in the file is: ");
        System.out.println(line);

        while (inputFile.hasNext()) {
            String readFriendName = inputFile.nextLine();
            System.out.println(readFriendName);
        }
        inputFile.close();
    }
}
