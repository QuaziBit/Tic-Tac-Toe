package com.game.net;

/**
 * 
 * This class examines who won. 
 * @author Olexandr Matveyev.
 *
 */
public class WinnerCheck 
{
	/**
	 * 
	 * Local Variables.
	 * @Variable user by default is false if won it will be true.
	 * @Variable comp by default is false if won it will be true.
	 * @Variable CheckBoard[][] stores game board with user and computer inputs.
	 * @Variable countUserMoves increment each time when user inputs correct value.
	 * 
	 */
	private char checkBoard[][] = new char[3][3];
	public static boolean user = false, comp = false;
	public static int countUserMoves = 0;
	
	public int rowCount = 0;
	public int columnCount = 0;
	
	/**
	 * 
	 * This constructor sets board[][] array for the checkBoard[][] array.
	 * @Method setCheckBoard(char board[][])
	 * @param board as a parameter takes array.
	 */
	public void setCheckBoard(char board[][])
	{
		checkBoard = board;
		WhoWon();
	}
	
	/**
	 * This Method checks a checkBoard[][] array for the winning combinations.
	 * @Method WhoWon()
	 */
	public void WhoWon()
	{		
		//Winning combinations for user
		//User Horizontal
		// 1
		if(checkBoard[0][0] == 'X' && checkBoard[0][1] == 'X' && checkBoard[0][2] == 'X')
		{
			user = true;
		}
		// 2
		else if(checkBoard[1][0] == 'X' && checkBoard[1][1] == 'X' && checkBoard[1][2] == 'X')
		{
			user = true;
		}
		// 3
		else if(checkBoard[2][0] == 'X' && checkBoard[2][1] == 'X' && checkBoard[2][2] == 'X')
		{
			user = true;
		}
		//User Vertical
		// 4
		else if(checkBoard[0][0] == 'X' && checkBoard[1][0] == 'X' && checkBoard[2][0] == 'X')
		{
			user = true;
		}
		// 5
		else if(checkBoard[0][1] == 'X' && checkBoard[1][1] == 'X' && checkBoard[2][1] == 'X')
		{
			user = true;
		}
		// 6
		else if(checkBoard[0][2] == 'X' && checkBoard[1][2] == 'X' && checkBoard[2][2] == 'X')
		{
			user = true;
		}
		//User Diagonal
		// 7
		else if(checkBoard[0][0] == 'X' && checkBoard[1][1] == 'X' && checkBoard[2][2] == 'X')
		{
			user = true;
		}
		// 8
		else if(checkBoard[0][2] == 'X' && checkBoard[1][1] == 'X' && checkBoard[2][0] == 'X')
		{
			user = true;
		}
		//Winning combinations for computer
		//Computer Horizontal
		// 1
		else if(checkBoard[0][0] == 'O' && checkBoard[0][1] == 'O' && checkBoard[0][2] == 'O')
		{
			comp = true;
		}
		// 2
		else if(checkBoard[1][0] == 'O' && checkBoard[1][1] == 'O' && checkBoard[1][2] == 'O')
		{
			comp = true;
		}
		// 3
		else if(checkBoard[2][0] == 'O' && checkBoard[2][1] == 'O' && checkBoard[2][2] == 'O')
		{
			comp = true;
		}
		//Computer Vertical
		// 4
		else if(checkBoard[0][0] == 'O' && checkBoard[1][0] == 'O' && checkBoard[2][0] == 'O')
		{
			comp = true;
		}
		// 5
		else if(checkBoard[0][1] == 'O' && checkBoard[1][1] == 'O' && checkBoard[2][1] == 'O')
		{
			comp = true;
		}
		// 6
		else if(checkBoard[0][2] == 'O' && checkBoard[1][2] == 'O' && checkBoard[2][2] == 'O')
		{
			comp = true;
		}
		//Computer Diagonal
		// 7
		else if(checkBoard[0][0] == 'O' && checkBoard[1][1] == 'O' && checkBoard[2][2] == 'O')
		{
			comp = true;
		}
		// 8
		else if(checkBoard[0][2] == 'O' && checkBoard[1][1] == 'O' && checkBoard[2][0] == 'O')
		{
			comp = true;
		}
		else if(countUserMoves == 5)
		{
			user = false;
			comp = false;
		}
	}
	
	/**
	 * @Method getUserStatus()
	 * @return user
	 */
	public boolean getUserStatus()
	{
		return user;
	}
	
	/**
	 * @Method getCompStatus()
	 * @return comp
	 */
	public boolean getCompStatus()
	{
		return comp;
	}

	/**
	 * Sets user and comp value to false.
	 * @Method setBool(boolean u, boolean c)
	 */
	public void setBool(boolean u, boolean c)
	{
		user= u;
		comp = c;
	}
	
}







