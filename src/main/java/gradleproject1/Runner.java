/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

import java.util.Scanner;

/**
 *
 * @author Paul
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //Enter data using BufferReader
//        BufferedReader reader
//                = new BufferedReader(new InputStreamReader(System.in));
//
//        // Reading data using readLine
//        String name;
//        try {
//            name = reader.readLine();
//            System.out.println("You entered: " + name);
//        } catch (IOException ex) {
//            Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
//        }
        // Using Scanner for Getting Input from User
//        System.out.println("Now scanner test.");
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        System.out.println("You entered string " + s);

        System.out.println("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Your username is " + username);

    }

}
