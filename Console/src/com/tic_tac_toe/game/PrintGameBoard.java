package com.tic_tac_toe.game;

/**
 * Date: 11-03-2012
 * @author (Alex) Olexandr Matveyev
 */
public class PrintGameBoard
{
    private GameBoard gameBoardObj;
    private String gameBoard[][] = new String[3][3];

    public PrintGameBoard(GameBoard gb)
    {
        gameBoardObj = gb;
        gameBoard = gameBoardObj.getGameBoard();
    }

    //Распечатать игровую доску
    public void printBoard()
    {
        for(int i = 0; i < gameBoard.length; i++)
        {
            for(int j = 0; j < gameBoard[i].length; j++)
            {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
