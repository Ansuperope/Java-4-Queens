/***********************************************************************
 * Solution.java
 * ---------------------------------------------------------------------
 * This file contains the function to solve the queens code. A board is
 * passed to the function with preset dimensions. 
 * 
 * Each space on the board will contain the following values (node):
 *  1. spaceValue (defined below)
 *  2. Has a queen (true or false)
 * 
 * The spaceValue will be as followed:
 *      0 = free space
 *      1 = space a queen can move to (another queen cant be there)
 *      +2 = invalid space (two or more queens can move there, invalid)
 * 
 * The number of queens on the board represent what row we are on
 * ---------------------------------------------------------------------
 * INPUT
 *  board       = a board num x num (number is determined in main)
 *  numOfQueens = number of queens currently on the board
 * 
 * OUTPUT
 *  1. if true
 *      output: "Your solution:"
 *              <chess board with queens>
 *      return: true
 *      
 *  2. if false
 *      output: "No solution."
 *      return: false
 * ---------------------------------------------------------------------
 * PSUEDO CODE
 * Note: there should only be 1 queen per row and column
 * 
 *  1. It checks if the number of queens on the board == size of the
 *     board
 * 
 *      a. if num of queens = board size
 *          i. Output: visual solution
 *          ii. Return: true
 * 
 *      b. else
 *          i. For each move (column)
 *              1. Check if move is valid (spaceValue is 0)
 *                  a. Set move
 *                      i. Mark the space having a queen
 *                      ii. Mark the columns and rows for being taken
 *                  c. Move to the next row (recursively call function)
 *                  d. Check if the next row move is valid
 *                      i. Return true
 *                  e. unset move 
 *                      i. Subtract 1 from all related spaces
 *                      ii. Remove space from having a queen
 * 
 *  2. If both of those options fail:
 *      a. Output: "No solution."
 *      b. Return: false 
 **********************************************************************/
public class Solution {
    /*******************************************************************
     * NODE - board values
     ******************************************************************/
    private static class Node {
        int spaceValue;     // 0 = free | 1 = queen moves there | +2 = invalid
        boolean hasQueen;   // if has queen (true) or space is free (false)

        /***************************************************************
         * NODE() - CONSTRUCTOR
         **************************************************************/
        Node () {
            this.spaceValue = 0;
            this.hasQueen = false;
        } // END Node Constructor
    } // END class Node

    private Node[][] board;
    private final int SIZE;

    /*******************************************************************
     * Solution - Constructor
     ******************************************************************/
    Solution (int inSize) {
        this.SIZE = inSize;
        this.board = new Node[inSize][inSize];
        
        // INTALIZE BOARD
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                board[row][col] = new Node();
            } // END for col
        } // END for row

    } // END Solution Constructor

    /*******************************************************************
     * 
     ******************************************************************/
    public boolean solve (int[][] board, int numOfQueens) {

        System.out.println("No solution.");
        return false;
    } // END boolean solve

    /*******************************************************************
     * printBoard()
     * -----------------------------------------------------------------
     * Prints board of 
     ******************************************************************/
    public void printBoard () {
        for (int col = 0; col < SIZE; col++) {
            for (int row = 0; row < SIZE; row++) {
                // Starting bracket
                System.out.print("[ ");

                // if spot has queen print a Q
                if (board[row][col].hasQueen) {
                    System.out.print("Q");
                }
                // no queen
                else {
                    System.out.print(".");
                }

                // Ending bracket
                System.out.print(" ] ");
            } // END for (row)

            // New line
            System.out.println();
        } // END for (col)
    } // END void printBoard
    
    /*******************************************************************
     * isValidMove()
     * -----------------------------------------------------------------
     * This function checks if a move is valid. It looks at the column
     * and row the 
     * -----------------------------------------------------------------
     * INPUT
     *  column
     * 
     * OUTPUT
     *  
     ******************************************************************/
    // private boolean isValidMove (int column) {

    // } // END boolean isValidMove
} // END class Solution