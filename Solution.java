/***********************************************************************
 * Solution.java
 * ---------------------------------------------------------------------
 * This file contains the function to solve the queens code. A board is
 * passed to the function with preset dimensions. 
 * 
 * Each space on the board will contain the following values:
 *      0 = free space
 *      1 = has a queen
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
    private boolean[][] board;
    private final int SIZE;

    /*******************************************************************
     * Solution - Constructor
     *  create a board intalized to 0
     ******************************************************************/
    Solution (int inSize) {
        this.SIZE = inSize;
        this.board = new boolean[inSize][inSize];
        
        // INTALIZE BOARD
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                board[row][col] = 0;
            } // END for col
        } // END for row

    } // END Solution Constructor

    /*******************************************************************
     * solve ()
     * -----------------------------------------------------------------
     * Main funciton that will be called in main. It solves the queens
     * problem. We will place each queen row by row
     * -----------------------------------------------------------------
     * INPUT
     *  numOfQueens = number of queens on the board / the current row
     *                we are on
     * 
     * OUTPUT
     *  true (solution) or false (cannot solve)
     ******************************************************************/
    public boolean solve (int numOfQueens) {
        /***************************************************************
         * CHECK IF SOLVED / CANNOT ADD ANYMORE QUEENS
         **************************************************************/
        if (numOfQueens == SIZE) {
            return true;
        } // END if
        /***************************************************************
         * STILL NEED TO SOLVE / NEED TO ADD MORE QUEENS
         **************************************************************/
        else {
            for (int row = 0; row < SIZE; row++) {
                
            } // END for row
        } // END else
        
        // CANNOT SOLVE
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

                // if spot has queen print a "Q"
                if (board[row][col] == 1) {
                    System.out.print("Q");
                }
                // no queen print "."
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
     * This function checks if a move is valid. The function receives
     * the column the queen is currently located at and checks the space
     * value of the nearby spaces it can go to:
     *  1. The entire column
     *  2. Upper left diagonal
     *  3. Upper right diagonal
     * 
     * If it encounters a 1 / another queen it will return false
     * 
     * NOTE:
     *  - not checking row because in the solution function we are placing
     *    each queen in different rows. No two queens will be in same
     *    row
     *  - not checking lower diagonals because going in order from top
     *    to bottom, there will be nothing to check at the bottom of the
     *    new queen
     * -----------------------------------------------------------------
     * INPUT
     *  positionColumn = current column queen is located at
     * 
     * OUTPUT
     *  true (can move queen there)
     *  false (cannot move there)
     ******************************************************************/
    private boolean isValidMove (int positionColumn) {

        /***************************************************************
         * CHECK ENTIRE COLUMN
         **************************************************************/
        for (int col = 0; col < SIZE; col++) {
            if (board[row][positionColumn] >= 1) {
                return false;
            } // END if
        } // END for row

        /***************************************************************
         * CHECK UPPER LEFT DIAGONAL
         * -------------------------------------------------------------
         * dont need to check lower
         **************************************************************/
        for (int currRow = position)

        // PASSED ALL CHECKS, MOVE IS VALID
        return true;
    } // END boolean isValidMove

} // END class Solution