package com.game.net;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * 
 * This class create JFrame and all components. 
 * @author Olexandr Matveyev.
 *
 */
public class TicTacToeFrame extends JFrame 
{

	/**
	 * All local Variables.
	 */
	private static final long serialVersionUID = 1L;
	private AI comp = new AI();
	private WinnerCheck winnerCheck = new WinnerCheck();
	private JPanel contentPane;
	private char xBoard[][] = new char[3][3];
	private static int moves = 0;
	private int buttonNum = 0;
	
	private int userRow = 0;
	private int userColumn = 0;
	
	private boolean userWon = false;
	private boolean compWon = false;
	
	private int countCompMoves = 0;
	
	private int compRow = 0;
	private int compColumn = 0;

	private JLabel statusLabel = new JLabel();
	private JButton buttonONE;
	private JButton buttonTWO;
	private JButton buttonTHREE;
	private JButton buttonFOUR;
	private JButton buttonFIVE;
	private JButton buttonSIX;
	private JButton buttonSEVEN;
	private JButton buttonEIGHT;
	private JButton buttonNINE;
	private JButton newGameButton;
	private JLabel playerScores;
	private JLabel computerScores;
	
	private int playerScoresNum = 0;
	private int computerScoresNum = 0;
	
	private JLabel labelONE = new JLabel();
	private JLabel labelTWO = new JLabel();
	private JLabel labelTHREE = new JLabel();
	private JLabel labelFOUR = new JLabel();
	private JLabel labelFIVE = new JLabel();
	private JLabel labelSIX = new JLabel();
	private JLabel labelSEVEN = new JLabel();
	private JLabel labelEIGHT = new JLabel();
	private JLabel labelNINE = new JLabel();
	
	/**
	 * Creates all buttons and labels.
	 * @Constructor TicTacToeFrame()
	 */
	public TicTacToeFrame() 
	{
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 300, 500, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		this.statusLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.statusLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.statusLabel.setBounds(317, 11, 167, 41);
		contentPane.add(this.statusLabel);
		
		this.buttonONE = new JButton();
		buttonONE.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				buttonNum = 0;
				
				userRow = 0;
				userColumn = 0;
				checkUserMove();
			}
		});
		this.buttonONE.getModel().addChangeListener(new ChangeListener() 
		{
		     @Override
		     public void stateChanged(ChangeEvent e) 
		     {
		    	 ButtonModel model = (ButtonModel) e.getSource();
		         if(model.isRollover())
		         {
		        	buttonONE.setText("X");
		         }
		         else if(!model.isRollover())
		         {
		        	buttonONE.setText("");
		         }      
		     }
		});
		this.buttonONE.setForeground(new Color(255, 165, 0));
		this.buttonONE.setFont(new Font("Tahoma", Font.BOLD, 85));
		this.buttonONE.setBounds(0, 0, 100, 100);
		contentPane.add(this.buttonONE);
		
		this.buttonTWO = new JButton();
		this.buttonTWO.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				buttonNum = 1;
				
				userRow = 0;
				userColumn = 1;
				checkUserMove();
			}
		});
		this.buttonTWO.getModel().addChangeListener(new ChangeListener() 
		{
		     @Override
		     public void stateChanged(ChangeEvent e) 
		     {
		    	 ButtonModel model = (ButtonModel) e.getSource();
		         if(model.isRollover())
		         {
		        	 buttonTWO.setText("X");
		         }
		         else if(!model.isRollover())
		         {
		        	 buttonTWO.setText("");
		         }      
		     }
		});
		this.buttonTWO.setForeground(new Color(255, 165, 0));
		this.buttonTWO.setFont(new Font("Tahoma", Font.BOLD, 85));
		this.buttonTWO.setBounds(100, 0, 100, 100);
		this.contentPane.add(this.buttonTWO);
		
		this.buttonTHREE = new JButton();
		this.buttonTHREE.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				buttonNum = 2;
				
				userRow = 0;
				userColumn = 2;
				checkUserMove();
			}
		});
		this.buttonTHREE.getModel().addChangeListener(new ChangeListener() 
		{
		     @Override
		     public void stateChanged(ChangeEvent e) 
		     {
		    	 ButtonModel model = (ButtonModel) e.getSource();
		         if(model.isRollover())
		         {
		        	 buttonTHREE.setText("X");
		         }
		         else if(!model.isRollover())
		         {
		        	 buttonTHREE.setText("");
		         }      
		     }
		});
		this.buttonTHREE.setForeground(new Color(255, 165, 0));
		this.buttonTHREE.setFont(new Font("Tahoma", Font.BOLD, 85));
		this.buttonTHREE.setBounds(200, 0, 100, 100);
		this.contentPane.add(this.buttonTHREE);
		
		this.buttonFOUR = new JButton();
		this.buttonFOUR.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				buttonNum = 3;
				
				userRow = 1;
				userColumn = 0;
				checkUserMove();
			}
		});
		this.buttonFOUR.getModel().addChangeListener(new ChangeListener() 
		{
		     @Override
		     public void stateChanged(ChangeEvent e) 
		     {
		    	 ButtonModel model = (ButtonModel) e.getSource();
		         if(model.isRollover())
		         {
		        	 buttonFOUR.setText("X");
		         }
		         else if(!model.isRollover())
		         {
		        	 buttonFOUR.setText("");
		         }      
		     }
		});
		this.buttonFOUR.setForeground(new Color(255, 165, 0));
		this.buttonFOUR.setFont(new Font("Tahoma", Font.BOLD, 85));
		this.buttonFOUR.setBounds(0, 100, 100, 100);
		this.contentPane.add(this.buttonFOUR);
		
		this.buttonFIVE = new JButton();
		this.buttonFIVE.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				buttonNum = 4;
				
				userRow = 1;
				userColumn = 1;
				checkUserMove();
			}
		});
		this.buttonFIVE.getModel().addChangeListener(new ChangeListener() 
		{
		     @Override
		     public void stateChanged(ChangeEvent e) 
		     {
		    	 ButtonModel model = (ButtonModel) e.getSource();
		         if(model.isRollover())
		         {
		        	 buttonFIVE.setText("X");
		         }
		         else if(!model.isRollover())
		         {
		        	 buttonFIVE.setText("");
		         }      
		     }
		});
		this.buttonFIVE.setForeground(new Color(255, 165, 0));
		this.buttonFIVE.setFont(new Font("Tahoma", Font.BOLD, 85));
		this.buttonFIVE.setBounds(100, 100, 100, 100);
		this.contentPane.add(this.buttonFIVE);
		
		this.buttonSIX = new JButton();
		this.buttonSIX.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				buttonNum = 5;
				
				userRow = 1;
				userColumn = 2;
				checkUserMove();
			}
		});
		this.buttonSIX.getModel().addChangeListener(new ChangeListener() 
		{
		     @Override
		     public void stateChanged(ChangeEvent e) 
		     {
		    	 ButtonModel model = (ButtonModel) e.getSource();
		         if(model.isRollover())
		         {
		        	 buttonSIX.setText("X");
		         }
		         else if(!model.isRollover())
		         {
		        	 buttonSIX.setText("");
		         }      
		     }
		});
		this.buttonSIX.setForeground(new Color(255, 165, 0));
		this.buttonSIX.setFont(new Font("Tahoma", Font.BOLD, 85));
		this.buttonSIX.setBounds(200, 100, 100, 100);
		this.contentPane.add(this.buttonSIX);
		
		this.buttonSEVEN = new JButton();
		this.buttonSEVEN.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				buttonNum = 6;
				
				userRow = 2;
				userColumn = 0;
				checkUserMove();
			}
		});
		this.buttonSEVEN.getModel().addChangeListener(new ChangeListener() 
		{
		     @Override
		     public void stateChanged(ChangeEvent e) 
		     {
		    	 ButtonModel model = (ButtonModel) e.getSource();
		         if(model.isRollover())
		         {
		        	 buttonSEVEN.setText("X");
		         }
		         else if(!model.isRollover())
		         {
		        	 buttonSEVEN.setText("");
		         }      
		     }
		});
		this.buttonSEVEN.setForeground(new Color(255, 165, 0));
		this.buttonSEVEN.setFont(new Font("Tahoma", Font.BOLD, 85));
		this.buttonSEVEN.setBounds(0, 200, 100, 100);
		this.contentPane.add(this.buttonSEVEN);
		
		this.buttonEIGHT = new JButton();
		this.buttonEIGHT.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				buttonNum = 7;
				
				userRow = 2;
				userColumn = 1;
				checkUserMove();
			}
		});
		this.buttonEIGHT.getModel().addChangeListener(new ChangeListener() 
		{
		     @Override
		     public void stateChanged(ChangeEvent e) 
		     {
		    	 ButtonModel model = (ButtonModel) e.getSource();
		         if(model.isRollover())
		         {
		        	 buttonEIGHT.setText("X");
		         }
		         else if(!model.isRollover())
		         {
		        	 buttonEIGHT.setText("");
		         }      
		     }
		});
		this.buttonEIGHT.setForeground(new Color(255, 165, 0));
		this.buttonEIGHT.setFont(new Font("Tahoma", Font.BOLD, 85));
		this.buttonEIGHT.setBounds(100, 200, 100, 100);
		this.contentPane.add(this.buttonEIGHT);
		
		this.buttonNINE = new JButton();
		this.buttonNINE.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				buttonNum = 8;
				
				userRow = 2;
				userColumn = 2;
				checkUserMove();
			}
		});
		this.buttonNINE.getModel().addChangeListener(new ChangeListener() 
		{
		     @Override
		     public void stateChanged(ChangeEvent e) 
		     {
		    	 ButtonModel model = (ButtonModel) e.getSource();
		         if(model.isRollover())
		         {
		        	 buttonNINE.setText("X");
		         }
		         else if(!model.isRollover())
		         {
		        	 buttonNINE.setText("");
		         }      
		     }
		});
		this.buttonNINE.setForeground(new Color(255, 165, 0));
		this.buttonNINE.setFont(new Font("Tahoma", Font.BOLD, 85));
		this.buttonNINE.setBounds(200, 200, 100, 100);
		this.contentPane.add(this.buttonNINE);
		
		this.newGameButton = new JButton("New Game");
		this.newGameButton.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				newGame();
			}
		});
		this.newGameButton.getModel().addChangeListener(new ChangeListener() 
		{
		     @Override
		     public void stateChanged(ChangeEvent e) 
		     {
		    	 ButtonModel model = (ButtonModel) e.getSource();
		         if(model.isRollover())
		         {
		        	 newGameButton.setForeground(new Color(255, 165, 0));
		         }
		         else if(!model.isRollover())
		         {
		        	 newGameButton.setForeground(new Color(0, 0, 0));
		         }      
		     }
		});
		this.newGameButton.setForeground(new Color(0, 0, 0));
		this.newGameButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		this.newGameButton.setBounds(317, 237, 167, 52);
		this.contentPane.add(this.newGameButton);
		
		this.playerScores = new JLabel("Player scores:");
		this.playerScores.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.playerScores.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.playerScores.setBounds(317, 63, 167, 37);
		this.contentPane.add(this.playerScores);
		
		this.computerScores = new JLabel("Computer Scores:");
		this.computerScores.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.computerScores.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.computerScores.setBounds(317, 111, 167, 37);
		this.contentPane.add(this.computerScores);
		
		for(int i = 0; i < xBoard.length; i++)
		{
			for(int j = 0; j < xBoard[i].length; j++)
			{
				if(xBoard[i][j] != 'X' || xBoard[i][j] != 'O' && xBoard[i][j] == '*')
				{
					xBoard[i][j] = '*';
				}
			}
		}
	}
	
	/**
	 * Checks user moves and assign 'X' to the specific label and 
	 * creates specific label.
	 * Also remove specific button.
	 * @Method checkUserMove()
	 */
	public void checkUserMove()
	{		
		switch (buttonNum) {
		case 0:
			if(xBoard[0][0] != 'X' && xBoard[0][0] != 'O')
			{
				xBoard[0][0] = 'X';
				contentPane.remove(buttonONE);
				
				labelONE.setText("X");
				labelONE.setBackground(new Color(192, 192, 192));
				labelONE.setHorizontalAlignment(SwingConstants.CENTER);
				labelONE.setForeground(new Color(255, 165, 0));
				labelONE.setFont(new Font("Tahoma", Font.BOLD, 85));
				labelONE.setBounds(0, 0, 100, 100);
				labelONE.setOpaque(true);
				labelONE.setBackground(new Color(112, 128, 144));
				contentPane.add(labelONE);
				
				passUserCoordinates();
			}
			break;
		case 1:
			if(xBoard[0][1] != 'X' && xBoard[0][1] != 'O')
			{
				xBoard[0][1] = 'X';
				contentPane.remove(buttonTWO);
				
				labelTWO.setText("X");
				labelTWO.setHorizontalAlignment(SwingConstants.CENTER);
				labelTWO.setForeground(new Color(255, 165, 0));
				labelTWO.setFont(new Font("Tahoma", Font.BOLD, 85));
				labelTWO.setBounds(100, 0, 100, 100);
				labelTWO.setOpaque(true);
				labelTWO.setBackground(new Color(112, 128, 144));
				contentPane.add(labelTWO);
				
				passUserCoordinates();
			}
			break;
		case 2:
			if(xBoard[0][2] != 'X' && xBoard[0][2] != 'O')
			{
				xBoard[0][2] = 'X';
				contentPane.remove(buttonTHREE);
				
				labelTHREE.setText("X");
				labelTHREE.setHorizontalAlignment(SwingConstants.CENTER);
				labelTHREE.setForeground(new Color(255, 165, 0));
				labelTHREE.setFont(new Font("Tahoma", Font.BOLD, 85));
				labelTHREE.setBounds(200, 0, 100, 100);
				labelTHREE.setOpaque(true);
				labelTHREE.setBackground(new Color(112, 128, 144));
				contentPane.add(labelTHREE);
				
				passUserCoordinates();
			}
			break;
		case 3:
			if(xBoard[1][0] != 'X' && xBoard[1][0] != 'O')
			{
				xBoard[1][0] = 'X';
				contentPane.remove(buttonFOUR);
				
				labelFOUR.setText("X");
				labelFOUR.setHorizontalAlignment(SwingConstants.CENTER);
				labelFOUR.setForeground(new Color(255, 165, 0));
				labelFOUR.setFont(new Font("Tahoma", Font.BOLD, 85));
				labelFOUR.setBounds(0, 100, 100, 100);
				labelFOUR.setOpaque(true);
				labelFOUR.setBackground(new Color(112, 128, 144));
				contentPane.add(labelFOUR);
				
				passUserCoordinates();
			}
			break;
		case 4:
			if(xBoard[1][1] != 'X' && xBoard[1][1] != 'O')
			{
				xBoard[1][1] = 'X';
				contentPane.remove(buttonFIVE);
				
				labelFIVE.setText("X");
				labelFIVE.setHorizontalAlignment(SwingConstants.CENTER);
				labelFIVE.setForeground(new Color(255, 165, 0));
				labelFIVE.setFont(new Font("Tahoma", Font.BOLD, 85));
				labelFIVE.setBounds(100, 100, 100, 100);
				labelFIVE.setOpaque(true);
				labelFIVE.setBackground(new Color(112, 128, 144));
				contentPane.add(labelFIVE);
				
				passUserCoordinates();
			}
			break;
		case 5:
			if(xBoard[1][2] != 'X' && xBoard[1][2] != 'O')
			{
				xBoard[1][2] = 'X';
				contentPane.remove(buttonSIX);
				
				labelSIX.setText("X");
				labelSIX.setHorizontalAlignment(SwingConstants.CENTER);
				labelSIX.setForeground(new Color(255, 165, 0));
				labelSIX.setFont(new Font("Tahoma", Font.BOLD, 85));
				labelSIX.setBounds(200, 100, 100, 100);
				labelSIX.setOpaque(true);
				labelSIX.setBackground(new Color(112, 128, 144));
				contentPane.add(labelSIX);
				
				passUserCoordinates();
			}
			break;
		case 6:
			if(xBoard[2][0] != 'X' && xBoard[2][0] != 'O')
			{
				xBoard[2][0] = 'X';
				contentPane.remove(buttonSEVEN);
				
				labelSEVEN.setText("X");
				labelSEVEN.setHorizontalAlignment(SwingConstants.CENTER);
				labelSEVEN.setForeground(new Color(255, 165, 0));
				labelSEVEN.setFont(new Font("Tahoma", Font.BOLD, 85));
				labelSEVEN.setBounds(0, 200, 100, 100);
				labelSEVEN.setOpaque(true);
				labelSEVEN.setBackground(new Color(112, 128, 144));
				contentPane.add(labelSEVEN);
				
				passUserCoordinates();
			}
			break;
		case 7:
			if(xBoard[2][1] != 'X' && xBoard[2][1] != 'O')
			{
				xBoard[2][1] = 'X';
				contentPane.remove(buttonEIGHT);
				
				labelEIGHT.setText("X");
				labelEIGHT.setHorizontalAlignment(SwingConstants.CENTER);
				labelEIGHT.setForeground(new Color(255, 165, 0));
				labelEIGHT.setFont(new Font("Tahoma", Font.BOLD, 85));
				labelEIGHT.setBounds(100, 200, 100, 100);
				labelEIGHT.setOpaque(true);
				labelEIGHT.setBackground(new Color(112, 128, 144));
				contentPane.add(labelEIGHT);
				
				passUserCoordinates();
			}
			break;
		case 8:
			if(xBoard[2][2] != 'X' && xBoard[2][2] != 'O')
			{
				xBoard[2][2] = 'X';
				contentPane.remove(buttonNINE);
				
				labelNINE.setText("X");
				labelNINE.setHorizontalAlignment(SwingConstants.CENTER);
				labelNINE.setForeground(new Color(255, 165, 0));
				labelNINE.setFont(new Font("Tahoma", Font.BOLD, 85));
				labelNINE.setBounds(200, 200, 100, 100);
				labelNINE.setOpaque(true);
				labelNINE.setBackground(new Color(112, 128, 144));
				contentPane.add(labelNINE);
				
				passUserCoordinates();
			}
			break;
		default:
			break;
		}
		update();
	}
	
	/**
	 * comp.setCompCoor(xBoard) Passes xBoard[][] to AI Class.
	 * @Method passUserCoordinates()
	 */
	public void passUserCoordinates()
	{
		comp.setCompCoor(xBoard);
		getCompCoordinates();
		update();
	}
	
	/**
	 * Takes game board from AI Class with computer moves.
	 * @Method getCompCoordinates()
	 */
	public void getCompCoordinates()
	{
		xBoard = comp.getBoard();
		setCompCoordinates();
		update();
	}
	
	/**
	 * Assign 'O' to the specific label and 
	 * creates specific label.
	 * Also remove specific button.
	 * @Method setCompCoordinates()
	 */
	public void setCompCoordinates()
	{
		compRow = comp.getCompRow();
		compColumn = comp.getCompColumn();
		if(compRow == 0 && compColumn == 0)
		{
			contentPane.remove(buttonONE);
			labelONE.setText("O");
			labelONE.setBackground(new Color(192, 192, 192));
			labelONE.setHorizontalAlignment(SwingConstants.CENTER);
			labelONE.setForeground(new Color(255, 69, 0));
			labelONE.setFont(new Font("Tahoma", Font.BOLD, 85));
			labelONE.setBounds(0, 0, 100, 100);
			labelONE.setOpaque(true);
			labelONE.setBackground(new Color(112, 128, 144));
			contentPane.add(labelONE);
		}
		else if(compRow == 0 && compColumn == 1)
		{
			contentPane.remove(buttonTWO);
			labelTWO.setText("O");
			labelTWO.setBackground(new Color(192, 192, 192));
			labelTWO.setHorizontalAlignment(SwingConstants.CENTER);
			labelTWO.setForeground(new Color(255, 69, 0));
			labelTWO.setFont(new Font("Tahoma", Font.BOLD, 85));
			labelTWO.setBounds(100, 0, 100, 100);
			labelTWO.setOpaque(true);
			labelTWO.setBackground(new Color(112, 128, 144));
			contentPane.add(labelTWO);
		}
		else if(compRow == 0 && compColumn == 2)
		{
			contentPane.remove(buttonTHREE);
			labelTHREE.setText("O");
			labelTHREE.setHorizontalAlignment(SwingConstants.CENTER);
			labelTHREE.setForeground(new Color(255, 69, 0));
			labelTHREE.setFont(new Font("Tahoma", Font.BOLD, 85));
			labelTHREE.setBounds(200, 0, 100, 100);
			labelTHREE.setOpaque(true);
			labelTHREE.setBackground(new Color(112, 128, 144));
			contentPane.add(labelTHREE);
		}
		else if(compRow == 1 && compColumn == 0)
		{
			contentPane.remove(buttonFOUR);
			labelFOUR.setText("O");
			labelFOUR.setHorizontalAlignment(SwingConstants.CENTER);
			labelFOUR.setForeground(new Color(255, 69, 0));
			labelFOUR.setFont(new Font("Tahoma", Font.BOLD, 85));
			labelFOUR.setBounds(0, 100, 100, 100);
			labelFOUR.setOpaque(true);
			labelFOUR.setBackground(new Color(112, 128, 144));
			contentPane.add(labelFOUR);
		}
		else if(compRow == 1 && compColumn == 1)
		{
			contentPane.remove(buttonFIVE);
			labelFIVE.setText("O");
			labelFIVE.setHorizontalAlignment(SwingConstants.CENTER);
			labelFIVE.setForeground(new Color(255, 69, 0));
			labelFIVE.setFont(new Font("Tahoma", Font.BOLD, 85));
			labelFIVE.setBounds(100, 100, 100, 100);
			labelFIVE.setOpaque(true);
			labelFIVE.setBackground(new Color(112, 128, 144));
			contentPane.add(labelFIVE);
		}
		else if(compRow == 1 && compColumn == 2)
		{
			contentPane.remove(buttonSIX);
			labelSIX.setText("O");
			labelSIX.setHorizontalAlignment(SwingConstants.CENTER);
			labelSIX.setForeground(new Color(255, 69, 0));
			labelSIX.setFont(new Font("Tahoma", Font.BOLD, 85));
			labelSIX.setBounds(200, 100, 100, 100);
			labelSIX.setOpaque(true);
			labelSIX.setBackground(new Color(112, 128, 144));
			contentPane.add(labelSIX);
		}
		else if(compRow == 2 && compColumn == 0)
		{		
			contentPane.remove(buttonSEVEN);
			labelSEVEN.setText("O");
			labelSEVEN.setHorizontalAlignment(SwingConstants.CENTER);
			labelSEVEN.setForeground(new Color(255, 69, 0));
			labelSEVEN.setFont(new Font("Tahoma", Font.BOLD, 85));
			labelSEVEN.setBounds(0, 200, 100, 100);
			labelSEVEN.setOpaque(true);
			labelSEVEN.setBackground(new Color(112, 128, 144));
			contentPane.add(labelSEVEN);
		}
		else if(compRow == 2 && compColumn == 1)
		{
			contentPane.remove(buttonEIGHT);
			labelEIGHT.setText("O");
			labelEIGHT.setHorizontalAlignment(SwingConstants.CENTER);
			labelEIGHT.setForeground(new Color(255, 69, 0));
			labelEIGHT.setFont(new Font("Tahoma", Font.BOLD, 85));
			labelEIGHT.setBounds(100, 200, 100, 100);
			labelEIGHT.setOpaque(true);
			labelEIGHT.setBackground(new Color(112, 128, 144));
			contentPane.add(labelEIGHT);
		}
		else if(compRow == 2 && compColumn == 2)
		{
			contentPane.remove(buttonNINE);
			labelNINE.setText("O");
			labelNINE.setHorizontalAlignment(SwingConstants.CENTER);
			labelNINE.setForeground(new Color(255, 69, 0));
			labelNINE.setFont(new Font("Tahoma", Font.BOLD, 85));
			labelNINE.setBounds(200, 200, 100, 100);
			labelNINE.setOpaque(true);
			labelNINE.setBackground(new Color(112, 128, 144));
			contentPane.add(labelNINE);
		}
		checkGameStatus();
		update();
	}
	
	/**
	 * Receives user and computer status from WinnerCheck Class.
	 * And assigns specific text to  statusLabel and count user and computer scores.
	 * @Method checkGameStatus()
	 */
	public void checkGameStatus()
	{
		countCompMoves = comp.getCompMoves();
		winnerCheck.setCheckBoard(xBoard);
		userWon = winnerCheck.getUserStatus();
		compWon = winnerCheck.getCompStatus(); 

		if(userWon || compWon)
		{
			if(userWon)
			{
				statusLabel.setText("You Won");
				playerScoresNum++;
				playerScores.setText("Player scores: " + playerScoresNum);
				
				contentPane.remove(buttonONE);
				contentPane.remove(buttonTWO);
				contentPane.remove(buttonTHREE);
				contentPane.remove(buttonFOUR);
				contentPane.remove(buttonFIVE);
				contentPane.remove(buttonSIX);
				contentPane.remove(buttonSEVEN);
				contentPane.remove(buttonEIGHT);
				contentPane.remove(buttonNINE);
			}
			else if(compWon)
			{
				statusLabel.setText("You Lose");
				computerScoresNum++;
				computerScores.setText("Computer Scores: " + computerScoresNum);
				contentPane.remove(buttonONE);
				contentPane.remove(buttonTWO);
				contentPane.remove(buttonTHREE);
				contentPane.remove(buttonFOUR);
				contentPane.remove(buttonFIVE);
				contentPane.remove(buttonSIX);
				contentPane.remove(buttonSEVEN);
				contentPane.remove(buttonEIGHT);
				contentPane.remove(buttonNINE);
			}
		}
		if(!userWon && !compWon && countCompMoves == 4)
		{
			statusLabel.setText("Draw");
			contentPane.remove(buttonONE);
			contentPane.remove(buttonTWO);
			contentPane.remove(buttonTHREE);
			contentPane.remove(buttonFOUR);
			contentPane.remove(buttonFIVE);
			contentPane.remove(buttonSIX);
			contentPane.remove(buttonSEVEN);
			contentPane.remove(buttonEIGHT);
			contentPane.remove(buttonNINE);
		}
		update();
	}

	/**
	 * Resets all labels, buttons.
	 * @Method newGame()
	 */
	public void newGame()
	{
		for(int i = 0; i < xBoard.length; i++)
		{
			for(int j = 0; j < xBoard[i].length; j++)
			{
				if(xBoard[i][j] == 'X' || xBoard[i][j] == 'O')
				{
					xBoard[i][j] = '*';
				}
			}
		}
		contentPane.add(buttonONE);
		contentPane.add(buttonTWO);
		contentPane.add(buttonTHREE);
		contentPane.add(buttonFOUR);
		contentPane.add(buttonFIVE);
		contentPane.add(buttonSIX);
		contentPane.add(buttonSEVEN);
		contentPane.add(buttonEIGHT);
		contentPane.add(buttonNINE);
		
		contentPane.remove(labelONE);
		contentPane.remove(labelTWO);
		contentPane.remove(labelTHREE);
		contentPane.remove(labelFOUR);
		contentPane.remove(labelFIVE);
		contentPane.remove(labelSIX);
		contentPane.remove(labelSEVEN);
		contentPane.remove(labelEIGHT);
		contentPane.remove(labelNINE);
		
		
		statusLabel.setText("");
		buttonONE.setText("");
		buttonTWO.setText("");
		buttonTHREE.setText("");
		buttonFOUR.setText("");
		buttonFIVE.setText("");
		buttonSIX.setText("");
		buttonSEVEN.setText("");
		buttonEIGHT.setText("");
		buttonNINE.setText("");
		
		buttonONE.setForeground(new Color(255, 165, 0));
		buttonTWO.setForeground(new Color(255, 165, 0));
		buttonTHREE.setForeground(new Color(255, 165, 0));
		buttonFOUR.setForeground(new Color(255, 165, 0));
		buttonFIVE.setForeground(new Color(255, 165, 0));
		buttonSIX.setForeground(new Color(255, 165, 0));
		buttonSEVEN.setForeground(new Color(255, 165, 0));
		buttonEIGHT.setForeground(new Color(255, 165, 0));
		buttonNINE.setForeground(new Color(255, 165, 0));

		winnerCheck.setBool(userWon = false, compWon = false);
		comp.resetCompMoves(countCompMoves = 0);
		contentPane.repaint();
		update();
	}

	public void update()
	{
		repaint();
	}
}

