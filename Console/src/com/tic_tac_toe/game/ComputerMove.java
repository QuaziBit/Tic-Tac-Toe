package com.tic_tac_toe.game;

/**
 * Date: 11-03-2012
 * @author (Alex) Olexandr Matveyev
 */
public class ComputerMove
{
    private GameBoard gameBoardObj;
    private CheckMove checkMove;

    //Хранение игровой доски
    private String gameBoard[][] = new String[3][3];

    private String tempGameBoard[][] = new String[3][3];

    //Хранение значений для каждой ячейки
    private int cellValue[][] = new int[3][3];

    //Хранение хода компьютера
    private int compRow = 0;
    private int compColumn = 0;

    //
    private int depth = 1;
    private boolean isGoodMove = false;

    public ComputerMove(GameBoard gb, CheckMove cm)
    {
        gameBoardObj = gb;
        checkMove = cm;
//        gameBoard = gameBoardObj.getGameBoard();
//        tempGameBoard = gameBoard;
    }

    public void move()
    {
        gameBoard = gameBoardObj.getGameBoard();
        tempGameBoard = gameBoard;

        //Ход компьютера
        for(int i = 0; i < tempGameBoard.length; i++)
        {
            for(int j = 0; j < tempGameBoard[i].length; j++)
            {
                if(!tempGameBoard[i][j].equalsIgnoreCase("X") && !tempGameBoard[i][j].equalsIgnoreCase("O"))
                {

                }
                else if(tempGameBoard[i][j].equalsIgnoreCase("X") || tempGameBoard[i][j].equalsIgnoreCase("O"))
                {

                }
            }
        }
    }

    private boolean goodMove()
    {
        int row = 2;
        int hCunter = 0;
        int vCunter = 0;
        int dCunter = 0;

        for(int i = 0; i < tempGameBoard.length; i++)
        {
            for(int j = 0; j < tempGameBoard[i].length; j++)
            {
                //Горизонтальная проверка
                if(tempGameBoard[i][j].equalsIgnoreCase("X") || tempGameBoard[i][j].equalsIgnoreCase("O") && hCunter != 2)
                {
                    for(int x = 0; x < row; x++)
                    {
                        for(int y = 0; y < tempGameBoard.length; y++)
                        {
                            int temCountX = 0;
                            int temCountO = 0;
                            if(tempGameBoard[x][y].equalsIgnoreCase("X"))
                            {
                                temCountX++;
                                if(temCountX == 2)
                                {
                                    hCunter = 2;
                                }
                            }
                            else if(tempGameBoard[x][y].equalsIgnoreCase("O"))
                            {
                                temCountO++;
                                if(temCountO == 2)
                                {
                                    hCunter = 2;
                                }
                            }
                        }
                    }
                }
            }
        }

        return false;
    }
}
