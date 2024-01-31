// Programmers: Jake and Clayton
// Course:  CS 212
// Due Date: 2/4/24
// Lab Assignment: 2
// Problem Statement: Print 10 lottery tickets
// Data In: Name
// Data Out: First name and Tickets

//Imports
import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;

class Lab2 {
    public static void main(String[] args) {

        //Creating prize variable
        long prize = 225938745L;

        //Creating objects
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        NumberFormat myformat = NumberFormat.getInstance();

        //Get input for name
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        System.out.print("What's your name? ");
        String customerName = input.next();

        //nested for loops to print tickets
        for (int x=0; x<10; x++){
            System.out.println();
            for (int y=0; y<6; y++){
                int num = rand.nextInt(0,100);
                if (num <10){
                    String numS = String.valueOf(num);
                    System.out.print("0"+numS+" ");
                }
                else {
                    System.out.print(num+" ");
                }



            }}

        //Print out results
        System.out.println();
        System.out.println("-----------------");
        System.out.println("Good luck "+customerName+"!");
        System.out.println("Estimated Jackpot:");
        System.out.println("$"+myformat.format(prize));
        System.out.println("-----------------");

    }
}
