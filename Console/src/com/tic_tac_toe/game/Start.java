package com.tic_tac_toe.game;

import java.util.logging.ConsoleHandler;

/**
 * Date: 11-03-2012
 * @author (Alex) Olexandr Matveyev
 */
public class Start
{
    public static void main(String args[])
    {
        System.out.println("Welcome to the Tic Tac Toe game!\n");

        //Test
        GameBoard gameBoardObj = new GameBoard();
        PrintGameBoard printGameBoard = new PrintGameBoard(gameBoardObj);
        GameStatus gameStatus = new GameStatus(gameBoardObj);
        UserInput userInput = new UserInput(gameBoardObj, printGameBoard);
        CheckMove checkMove = new CheckMove(gameBoardObj, printGameBoard);
        ComputerMove computerMove = new ComputerMove(gameBoardObj, checkMove);
        CheckWinner checkWinner = new CheckWinner(gameBoardObj, gameStatus);
        printGameBoard.printBoard();

        while(checkMove.getMoveCounter() != 9)
        {
            if(!gameStatus.getGameStatus())
            {
                userInput.getUserInput();
                checkMove.setRow(userInput.getRow());
                checkMove.setColumn(userInput.getColumn());

                if(checkMove.isMoveGood())
                {
                    checkWinner.check(checkMove.getIsMoveGood(), checkMove.getRow(), checkMove.getColumn());
                    printGameBoard.printBoard();
                }
            }
            else if(gameStatus.getGameStatus())
            {
                System.out.println("You won :)");
                printGameBoard.printBoard();
                break;
            }
        }


    }
}
