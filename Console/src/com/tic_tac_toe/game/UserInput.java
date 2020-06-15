package com.tic_tac_toe.game;

import java.io.IOException;
import java.util.Scanner;

/**
 * Date: 11-03-2012
 * @author (Alex) Olexandr Matveyev
 */
public class UserInput
{
    private PrintGameBoard printGameBoard;
    private GameBoard gameBoardObj;
    private String gameBoard[][] = new String[3][3];

    //Scanner
    private Scanner userInput;

    //Save user input
    private int row = -1;
    private int column = -1;
    private int selectedCell = -1;

    //Is user input correct
    private boolean isRowCorrect = false;
    private boolean isColumnCorrect = false;
    private boolean isCellCorrect = false;

    public UserInput(GameBoard gb, PrintGameBoard pg)
    {
        printGameBoard = pg;

        gameBoardObj = gb;
        gameBoard = gameBoardObj.getGameBoard();
        userInput = new Scanner(System.in);
    }

    public void getUserInput()
    {
        System.out.println("Enter cell coordinates\n");

        while (!isCellCorrect)
        {
            try
            {
                System.out.print("Enter cell coordinate: ");
                selectedCell = userInput.nextInt();
                System.out.println();

                if(selectedCell >= 1 && selectedCell <= 9)
                {
                    isCellCorrect = true;
                }
                else
                {
                    System.out.println("Entered value is not in range!\n");
                    printGameBoard.printBoard();
                }
            }
            catch (Exception e)
            {
                System.out.println("You entered wrong value!\n");
                userInput.nextLine();
                printGameBoard.printBoard();
            }
        }

        if(isCellCorrect)
        {
            switch (selectedCell)
            {
                case 1:
                    row = 0;
                    column = 0;
                    break;
                case 2:
                    row = 0;
                    column = 1;
                    break;
                case 3:
                    row = 0;
                    column = 2;
                    break;
                case 4:
                    row = 1;
                    column = 0;
                    break;
                case 5:
                    row = 1;
                    column = 1;
                    break;
                case 6:
                    row = 1;
                    column = 2;
                    break;
                case 7:
                    row = 2;
                    column = 0;
                    break;
                case 8:
                    row = 2;
                    column = 1;
                    break;
                case 9:
                    row = 2;
                    column = 2;
                    break;
            }
        }
        isCellCorrect = false;

//        //Try row input
//        while (!isRowCorrect)
//        {
//            try
//            {
//                System.out.print("Enter row coordinate: ");
//                row = userInput.nextInt();
//                System.out.println();
//
////                switch ()
////                {
////                    case :
////                    break;
////                }
//
//                if(row >= 0 && row <= 2)
//                {
//                    isRowCorrect = true;
//                }
//                else
//                {
//                    System.out.println("Entered value is not in range!\n");
//                }
//            }
//            catch (Exception e)
//            {
//                System.out.println("You entered wrong value!\n");
//                userInput.nextLine();
//            }
//        }
//        isRowCorrect = false;
//
//
//        //Try column input
//        while (!isColumnCorrect)
//        {
//            try
//            {
//                System.out.print("Enter column coordinate: ");
//                column = userInput.nextInt();
//                System.out.println();
//
////                switch ()
////                {
////                    case :
////                        break;
////                }
//
//
//                if(column >= 0 && column <= 2)
//                {
//                    isColumnCorrect = true;
//                }
//                else
//                {
//                    System.out.println("Entered value is not in range!\n");
//                }
//            }
//            catch (Exception e)
//            {
//                System.out.println("You entered wrong value!\n");
//                userInput.nextLine();
//            }
//        }
//        isColumnCorrect = false;
//

    }

    public int getRow()
    {
        return row;
    }

    public int getColumn()
    {
        return column;
    }


}
