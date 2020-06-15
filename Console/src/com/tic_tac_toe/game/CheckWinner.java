package com.tic_tac_toe.game;

/**
 * Date: 11-03-2012
 * @author (Alex) Olexandr Matveyev
 */
public class CheckWinner
{
    private GameBoard gameBoardObj;
    private GameStatus gameStatus;
    private String gameBoard[][] = new String[3][3];

    private int hCounter = 0;
    private int vCounter = 0;
    private int dCounter_1 = 0;
    private int dCounter_2 = 0;

    //Сохранение последнего пользовательского ввода
    private int lastRowEntered = 0;
    private int lastColEntered = 0;

    private int x = gameBoard.length;
    private int y = 1;
    private int z = 0;


    public CheckWinner(GameBoard gb, GameStatus gs)
    {
        gameBoardObj = gb;
        gameStatus = gs;
    }

    public void check(boolean isMoveGood, int lr, int lc)
    {
        lastRowEntered = lr;
        lastColEntered = lc;
        gameBoard = gameBoardObj.getGameBoard();

        //Проверка по горизонтали
        if (isMoveGood)
        {
            //Проверка по горизонтали
            for(int i = lastRowEntered; i < (lastRowEntered + 1); i++)
            {
                for(int j = 0; j < gameBoard.length; j++)
                {
                    if(gameBoard[i][j].equalsIgnoreCase("X"))
                    {
                        hCounter++;
                    }
                }
            }

            //Проверка по вертикали
            for(int j = 0; j < gameBoard.length; j++)
            {
                for(int i = lastColEntered; i < (lastColEntered + 1); i++)
                {
                    if(gameBoard[j][i].equalsIgnoreCase("X"))
                    {
                        vCounter++;
                    }
                }
            }

            //Проверка по диагонали
            for(int i = 0; i < gameBoard.length; i++)
            {
                for(int j = i; j < (i+1); j++)
                {
                    if(gameBoard[i][j].equalsIgnoreCase("X"))
                    {
                        dCounter_1++;
                    }
                }
            }
            for(int i = 0; i < gameBoard.length; i++)
            {
                for(int j = (x-1); j > y; j--)
                {
                    if(gameBoard[i][j].equalsIgnoreCase("X"))
                    {
                        dCounter_2++;
                    }
                }
                if(y != -1)
                {
                    y--;
                    x--;
                }
                else
                {
                    break;
                }
            }

            if(hCounter == 3)
            {
                gameStatus.setIsGameOver(true);
            }
            else if(vCounter == 3)
            {
                gameStatus.setIsGameOver(true);
            }
            else if(dCounter_1 == 3)
            {
                gameStatus.setIsGameOver(true);
            }
            else if(dCounter_2 == 3)
            {
                gameStatus.setIsGameOver(true);
            }
            hCounter = 0;
            vCounter = 0;
            dCounter_1 = 0;

            dCounter_2 = 0;
            x = gameBoard.length;
            y = 1;

        }
        //gameStatus.setIsGameOver(true);
    }
}
