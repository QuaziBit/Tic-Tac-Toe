package com.tic_tac_toe.game;

/**
 * Date: 11-03-2012
 * @author (Alex) Olexandr Matveyev
 */
public class GameStatus
{
    private GameBoard gameBoardObj;
    private String gameBoard[][] = new String[3][3];
    private boolean isGameOver = false;

    public GameStatus(GameBoard gb)
    {
        gameBoardObj = gb;
    }

    public void checkWhoWon()
    {
        gameBoard = gameBoardObj.getGameBoard();
    }

    public void setIsGameOver(boolean b)
    {
        isGameOver = b;
    }

    public boolean getGameStatus()
    {
        return isGameOver;
    }
}
