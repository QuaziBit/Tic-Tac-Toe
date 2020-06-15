package com.game.net;
import java.util.Random;

/**
 * This class generates computer's move.
 * @author Olexandr Matveyev
 *
 */
public class AI 
{
	
	/**
	 * 
	 * @Variable countCompMoves count computer moves.
	 * @Variable xBoard[][] stores game board with user and computer inputs.
	 * @Variable compRow holds generated computer Rows.
	 * @Variable compColumn holds generated computer Columns.
	 */
	public int countCompMoves = 0;
	private char xBoard[][] = new char[3][3];
	private int compRow = 0;
	private int compColumn = 0;
	
	/**
	 * 
	 * This method sets board[][] array for the xBoard[][] array.
	 * @Method setCompCoor(char board[][])
	 * @param board as a parameter takes array.
	 */
	public void setCompCoor(char Board[][])
	{
		xBoard = Board;
		CompMove();
	}
	
	/**
	 * This Method generates computer's move.
	 *  @Method CompMove() 
	 */
	public void CompMove()
	{	
		Random random = new Random();
		
		if(
			//Vertical
			// 1
			xBoard[0][0] == 'X' && xBoard[1][0] == 'X' && xBoard[2][0] != 'X' && xBoard[2][0] != 'O' || 
			// 2
			xBoard[0][1] == 'X' && xBoard[1][1] == 'X' && xBoard[2][1] != 'X' && xBoard[2][1] != 'O' ||
			// 3
			xBoard[0][2] == 'X' && xBoard[1][2] == 'X' && xBoard[2][2] != 'X' && xBoard[2][2] != 'O' ||
			// 4
			xBoard[1][0] == 'X' && xBoard[2][0] == 'X' && xBoard[0][0] != 'X' && xBoard[0][0] != 'O' ||
			// 5
			xBoard[1][1] == 'X' && xBoard[2][1] == 'X' && xBoard[0][1] != 'X' && xBoard[0][1] != 'O' ||
			// 6
			xBoard[1][2] == 'X' && xBoard[2][2] == 'X' && xBoard[0][2] != 'X' && xBoard[0][2] != 'O' ||
			//Horizontal
			// 7
			xBoard[0][0] == 'X' && xBoard[0][1] == 'X' && xBoard[0][2] != 'X' && xBoard[0][2] != 'O' ||
			// 8
			xBoard[1][0] == 'X' && xBoard[1][1] == 'X' && xBoard[1][2] != 'X' && xBoard[1][2] != 'O' ||
			// 9
			xBoard[2][0] == 'X' && xBoard[2][1] == 'X' && xBoard[2][2] != 'X' && xBoard[2][2] != 'O' ||
			// 10
			xBoard[0][2] == 'X' && xBoard[0][1] == 'X' && xBoard[0][0] != 'X' && xBoard[0][0] != 'O' ||
			// 11
			xBoard[1][2] == 'X' && xBoard[1][1] == 'X' && xBoard[1][0] != 'X' && xBoard[1][0] != 'O' ||
			// 12
			xBoard[2][2] == 'X' && xBoard[2][1] == 'X' && xBoard[2][0] != 'X' && xBoard[2][0] != 'O' ||
			//Diagonal 1
			// 13
			xBoard[0][0] == 'X' && xBoard[1][1] == 'X' && xBoard[2][2] != 'X' && xBoard[2][2] != 'O' ||
			// 14
			xBoard[2][2] == 'X' && xBoard[1][1] == 'X' && xBoard[0][0] != 'X' && xBoard[0][0] != 'O' ||
			//Diagonal 2
			// 15
			xBoard[0][2] == 'X' && xBoard[1][1] == 'X' && xBoard[2][0] != 'X' && xBoard[2][0] != 'O' ||
			// 16
			xBoard[2][0] == 'X' && xBoard[1][1] == 'X' && xBoard[0][2] != 'X' && xBoard[0][2] != 'O' ||
			//----------------------------------------------------------------------------------------//
			// 17
			xBoard[0][0] == 'X' && xBoard[0][2] == 'X' && xBoard[0][1] != 'X' && xBoard[0][1] != 'O' ||
			// 18
			xBoard[0][2] == 'X' && xBoard[2][2] == 'X' && xBoard[1][2] != 'X' && xBoard[1][2] != 'O' ||
			// 19
			xBoard[2][2] == 'X' && xBoard[2][0] == 'X' && xBoard[2][1] != 'X' && xBoard[2][1] != 'O' ||
			// 20
			xBoard[2][0] == 'X' && xBoard[0][0] == 'X' && xBoard[1][0] != 'X' && xBoard[1][0] != 'O' ||
			// 21
			xBoard[0][0] == 'X' && xBoard[2][2] == 'X' && xBoard[1][1] != 'X' && xBoard[1][1] != 'O' ||
			// 22
			xBoard[0][2] == 'X' && xBoard[2][0] == 'X' && xBoard[1][1] != 'X' && xBoard[1][1] != 'O'
			)
			{
				// 1
				if(xBoard[0][0] == 'X' && xBoard[1][0] == 'X' && xBoard[2][0] != 'X' && xBoard[2][0] != 'O')
				{
					compRow = 2;
					compColumn = 0;
					countCompMoves++;
				}
				// 2
				else if(xBoard[0][1] == 'X' && xBoard[1][1] == 'X' && xBoard[2][1] != 'X' && xBoard[2][1] != 'O')
				{
					compRow = 2;
					compColumn = 1;
					countCompMoves++;
				}
				// 3
				else if(xBoard[0][2] == 'X' && xBoard[1][2] == 'X' && xBoard[2][2] != 'X' && xBoard[2][2] != 'O')
				{
					compRow = 2;
					compColumn = 2;
					countCompMoves++;
				}
				// 4
				else if(xBoard[1][0] == 'X' && xBoard[2][0] == 'X' && xBoard[0][0] != 'X' && xBoard[0][0] != 'O')
				{
					compRow = 0;
					compColumn = 0;
					countCompMoves++;
				}
				// 5
				else if(xBoard[1][1] == 'X' && xBoard[2][1] == 'X' && xBoard[0][1] != 'X' && xBoard[0][1] != 'O')
				{
					compRow = 0;
					compColumn = 1;
					countCompMoves++;
				}
				// 6
				else if(xBoard[1][2] == 'X' && xBoard[2][2] == 'X' && xBoard[0][2] != 'X' && xBoard[0][2] != 'O')
				{
					compRow = 0;
					compColumn = 2;
					countCompMoves++;
				}
				// 7
				else if(xBoard[0][0] == 'X' && xBoard[0][1] == 'X' && xBoard[0][2] != 'X' && xBoard[0][2] != 'O')
				{
					compRow = 0;
					compColumn = 2;
					countCompMoves++;
				}
				// 8
				else if(xBoard[1][0] == 'X' && xBoard[1][1] == 'X' && xBoard[1][2] != 'X' && xBoard[1][2] != 'O')
				{
					compRow = 1;
					compColumn = 2;
					countCompMoves++;
				}
				// 9
				else if(xBoard[2][0] == 'X' && xBoard[2][1] == 'X' && xBoard[2][2] != 'X' && xBoard[2][2] != 'O')
				{
					compRow = 2;
					compColumn = 2;
					countCompMoves++;
				}
				// 10
				else if(xBoard[0][2] == 'X' && xBoard[0][1] == 'X' && xBoard[0][0] != 'X' && xBoard[0][0] != 'O')
				{
					compRow = 0;
					compColumn = 0;
					countCompMoves++;
				}
				// 11
				else if(xBoard[1][2] == 'X' && xBoard[1][1] == 'X' && xBoard[1][0] != 'X' && xBoard[1][0] != 'O')
				{
					compRow = 1;
					compColumn = 0;
					countCompMoves++;
				}
				// 12
				else if(xBoard[2][2] == 'X' && xBoard[2][1] == 'X' && xBoard[2][0] != 'X' && xBoard[2][0] != 'O')
				{
					compRow = 2;
					compColumn = 0;
					countCompMoves++;
				}
				// 13
				else if(xBoard[0][0] == 'X' && xBoard[1][1] == 'X' && xBoard[2][2] != 'X' && xBoard[2][2] != 'O')
				{
					compRow = 2;
					compColumn = 2;
					countCompMoves++;
				}
				// 14
				else if(xBoard[2][2] == 'X' && xBoard[1][1] == 'X' && xBoard[0][0] != 'X' && xBoard[0][0] != 'O')
				{
					compRow = 0;
					compColumn = 0;
					countCompMoves++;
				}
				// 15
				else if(xBoard[0][2] == 'X' && xBoard[1][1] == 'X' && xBoard[2][0] != 'X' && xBoard[2][0] != 'O')
				{
					compRow = 2;
					compColumn = 0;
					countCompMoves++;
				}
				// 16
				else if(xBoard[2][0] == 'X' && xBoard[1][1] == 'X' && xBoard[0][2] != 'X' && xBoard[0][2] != 'O')
				{
					compRow = 0;
					compColumn = 2;
					countCompMoves++;
				}
				// 17
				else if(xBoard[0][0] == 'X' && xBoard[0][2] == 'X' && xBoard[0][1] != 'X' && xBoard[0][1] != 'O')
				{
					compRow = 0;
					compColumn = 1;
					countCompMoves++;
				}
				// 18
				else if(xBoard[0][2] == 'X' && xBoard[2][2] == 'X' && xBoard[1][2] != 'X' && xBoard[1][2] != 'O')
				{
					compRow = 1;
					compColumn = 2;
					countCompMoves++;
				}
				// 19
				else if(xBoard[2][2] == 'X' && xBoard[2][0] == 'X' && xBoard[2][1] != 'X' && xBoard[2][1] != 'O')
				{
					compRow = 2;
					compColumn = 1;
					countCompMoves++;
				}
				// 20
				else if(xBoard[2][0] == 'X' && xBoard[0][0] == 'X' && xBoard[1][0] != 'X' && xBoard[1][0] != 'O')
				{
					compRow = 1;
					compColumn = 0;
					countCompMoves++;
				}
				// 21
				else if(xBoard[0][0] == 'X' && xBoard[2][2] == 'X' && xBoard[1][1] != 'X' && xBoard[1][1] != 'O')
				{
					compRow = 1;
					compColumn = 1;
					countCompMoves++;
				}
				// 22
				else if(xBoard[0][2] == 'X' && xBoard[2][0] == 'X' && xBoard[1][1] != 'X' && xBoard[1][1] != 'O')
				{
					compRow = 1;
					compColumn = 1;
					countCompMoves++;
				}
			}
			else if(xBoard[1][1] != 'X' && xBoard[1][1] != 'O')
			{
				if(xBoard[0][0] == 'X' || xBoard[2][0] == 'X' || xBoard[0][2] == 'X' || xBoard[2][2] == 'X')
				{
					compRow = 1;
					compColumn = 1;
					countCompMoves++;
				}
				else if(xBoard[0][1] == 'X' || xBoard[1][0] == 'X' || xBoard[1][2] == 'X')
				{
					compRow = 1;
					compColumn = 1;
					countCompMoves++;
				}
				else if(xBoard[2][1] == 'X')
				{
					compRow = 1;
					compColumn = 1;
					countCompMoves++;
				}
			}
			else if(countCompMoves != 4)
			{
				compRow = random.nextInt(3 - 0) + 0;
				compColumn = random.nextInt(3 - 0) + 0;
				while(xBoard[compRow][compColumn] == 'X' || xBoard[compRow][compColumn] == 'O')
				{
					if(xBoard[compRow][compColumn] != 'X' && xBoard[compRow][compColumn] != 'O')
					{
						break;
					}
					compRow = random.nextInt(3 - 0) + 0;
					compColumn = random.nextInt(3 - 0) + 0;
				}
				countCompMoves++;
			}
		xBoard[compRow][compColumn]= 'O';
	}
	
	/**
	 * @Method getBoard()
	 * @return xBoard array
	 */
	public char[][] getBoard()
	{
		return xBoard;
	}
	
	/**
	 * @Method getCompRow()
	 * @return compRow
	 */
	public int getCompRow()
	{
		return compRow;
	}
	
	/**
	 * @Method getCompColumn()
	 * @return compColumn
	 */
	public int getCompColumn()
	{
		return compColumn;
	}
	
	/**
	 * Reset countCompMoves, takes value from TicTacToeFrame Class
	 * @Method resetCompMoves(int r)
	 */
	public void resetCompMoves(int r)
	{
		countCompMoves = r;
	}
	
	/**
	 * @Method getCompColumn()
	 * @return countCompMoves
	 */
	public int getCompMoves()
	{
		return countCompMoves;
	}

}
