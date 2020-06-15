package com.tic_tac_toe.game;

/**
 * Date: 11-03-2012
 * @author (Alex) Olexandr Matveyev
 */
public class GameBoard
{
    //Хранение Х и О
    private String gameBoard[][] = new String[3][3];

    //Хранение значений для каждой ячейки
    private int cellValue[][] = new int[3][3];

    int cell = 0;

    public GameBoard()
    {
        //Записать координаты яйеек игровой доски.
        for(int i = 0; i < gameBoard.length; i++)
        {
            for(int j = 0; j < gameBoard[i].length; j++)
            {
                cell++;
                gameBoard[i][j] = ""+cell;
            }
        }
    }

    //Обновить игровую доску
    public void updateGameBoard(String gb[][])
    {
        gameBoard = gb;
    }

    //Получить игровую доску
    public String[][] getGameBoard()
    {
        return gameBoard;
    }
}
