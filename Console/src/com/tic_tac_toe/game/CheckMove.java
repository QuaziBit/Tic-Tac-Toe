package com.tic_tac_toe.game;

/**
 * Date: 11-03-2012
 * @author (Alex) Olexandr Matveyev
 */
public class CheckMove
{
    private PrintGameBoard printGameBoard;
    private GameBoard gameBoardObj;
    private String gameBoard[][] = new String[3][3];
    private boolean move = false;
    private int moveCounter = 0;

    //Save user input
    private int row = 0;
    private int column = 0;

    public CheckMove(GameBoard gb, PrintGameBoard pg)
    {
        printGameBoard = pg;
        gameBoardObj = gb;
        gameBoard = gameBoardObj.getGameBoard();
    }

    public boolean isMoveGood()
    {
        gameBoard = gameBoardObj.getGameBoard();
        if(!gameBoard[row][column].equalsIgnoreCase("X") && !gameBoard[row][column].equalsIgnoreCase("O") && moveCounter <= 9)
        {
            gameBoard[row][column] = "X";
            gameBoardObj.updateGameBoard(gameBoard);
            moveCounter++;
            move = true;
        }
        else if(gameBoard[row][column].equalsIgnoreCase("X") || gameBoard[row][column].equalsIgnoreCase("O") && moveCounter <= 9)
        {
            System.out.println("This cell is no empty");
            move = false;
            printGameBoard.printBoard();
        }
        return move;
    }

    public boolean getIsMoveGood()
    {
        return move;
    }

    public void setRow(int r)
    {
        row = r;
    }
    public int getRow()
    {
        return row;
    }

    public void setColumn(int c)
    {
        column = c;
    }
    public int getColumn()
    {
        return column;
    }

    public void setMoveCounter(int m)
    {
        moveCounter = m;
    }

    public int getMoveCounter()
    {
        return moveCounter;
    }
}
