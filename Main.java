/***********************************************************************
 * Main.java
 * ---------------------------------------------------------------------
 * ABOUT
 *  This program is a backtracking recursive function to solve the
 * chess queens problem. It is made to solve any size board. The program
 * works as followed:
 * 
 * The program will keep running until user inputs 'Q' or 'q' to stop
 *  1. The user will be prompted to input board size
 *  2. It checks if the number of queens is equal to the size of the board
 *      a. if equal it prints true and the board
 *      b. else it does the following:
 *  3. If the 
 **********************************************************************/
import java.util.Scanner;   // for input

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char quitAnswer;        // stores if user wants to quit program 
        int boardSize;          // stores board size user wants

        do { // while (quitAnswer != 'Q')

            /***********************************************************
             * GET BOARD SIZE
             **********************************************************/
            System.out.print("\nWhat is your board size: ");
            boardSize = input.nextInt();
            
            Solution solvedBoard = new Solution(boardSize);
            
            /***********************************************************
             * SOLVE THE QUEENS PROBLEM AND OUTPUT THE SOLUTION
             **********************************************************/
            if (solvedBoard.solve()) {
                System.out.println("The solution is: ");
                
                // print board
                solvedBoard.printBoard();
            } // if (solvedBoard.solve())
            /***********************************************************
             * NOT SOLVEABLE 
             **********************************************************/
            else {
                System.out.println("There is no solution.");
            } // END else

            /***********************************************************
             * CHECK IF WE RUN AGAIN - converts input to uppercase
             **********************************************************/
            System.out.print("\nDo you want to input another board? (N to quit): ");
            quitAnswer = input.next().charAt(0);
            quitAnswer = Character.toUpperCase(quitAnswer);
            
        } while (quitAnswer != 'N');

    } // END void main()
} // END class Main