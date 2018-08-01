//Author: Ebrain Mirambeau
//Purpose: Tic Tac Toe game
//Year: 2007

import javax.swing.*;
import java.io.*;
import java.lang.String;

public class ticTest{
    private char[][]  tic_tac_toe = new char[3][3];
    private player player1, player2;
    private boolean win = false;
    private boolean check, check2;
  
    public String getplayer1(){
	return player1.getName();
    }
    public char[][] getChart(){
	return tic_tac_toe;
    }
        class player{
	    
	    private char player_symbol;
	    private String player_name;
	    public void player(){
		player_symbol = '?';
		player_name = "name";
	    }
	    public char setSymbol(char n){
		player_symbol = n;
		return player_symbol;
	    }
	    public String setName(String some_name){
		player_name = some_name;
		return player_name;
	    }
	    
	    public char getSymbol(){
		return player_symbol;
	    }
	    public String getName(){
		return player_name;
	    }
	}
	    public ticTest(){
  
		//secondly, initialize the board to contain blank spots
		for (int i = 0 ; i < 3; i++){
		    for( int j = 0; j < 3; j++)
			tic_tac_toe[i][j] = ' ';

		    player1 = new player();
		    player2 = new player();
		    player1.setName("player1");
		    player2.setName("player2");
		    player1.setSymbol('x');
		    player2.setSymbol('o');
		}
	    }
    public void startGame() throws IOException{
	ticTest temp1 = new ticTest();
  
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int a = -1;
	int b = -1;
	int c = -1;
	int d = -1;
  
	do{
	    System.out.println("player1, please enter a location to insert your symbol \n");   
	    
	    System.out.println("row: ");
	  
	    a = Integer.parseInt(in.readLine());
	    
	    while(a < 0 || a > 2){
		System.out.print("Please enter a number between 0 and 2: ");
		a = Integer.parseInt(in.readLine());
	    }

	    System.out.println("column: ");
	   
	    b = Integer.parseInt(in.readLine());

	    while(b < 0 || b > 2){
                System.out.print("Please enter a number between 0 and 2: ");
                b = Integer.parseInt(in.readLine());
            }
	   
	     check = temp1.checkLocation(a, b);

	     while(check == true){
		System.out.print("Enter another row: ");
		a = Integer.parseInt(in.readLine());
		
		while(a < 0 || a > 2){
		    System.out.print("Please enter a number between 0 and 2: ");
		    a = Integer.parseInt(in.readLine());
		}
		
		System.out.print("Enter another column: ");
		b = Integer.parseInt(in.readLine()); 

		while(b < 0 || b > 2){
		    System.out.print("Please enter a number between 0 and 2: ");
		    b = Integer.parseInt(in.readLine());
		}
		check = temp1.checkLocation(a, b);
	    }

	    temp1.insertSymbol(a, b, player1.getSymbol());
	    temp1.printBoard();
	    temp1.winning_condition(player1.getSymbol(), player1.getName());
		  
		  System.out.println("player2, please enter a location to insert your symbol \n");
		   System.out.println("row: ");
		  c = Integer.parseInt(in.readLine());

		  while(c < 0 || c > 2){
		      System.out.print("Please enter a number between 0 and 2: ");
		      c = Integer.parseInt(in.readLine());
		  }

		  System.out.println("column: ");
		  d = Integer.parseInt(in.readLine());

		  while(d < 0 || d > 2){
		      System.out.print("Please enter a number between 0 and 2: ");
		      d = Integer.parseInt(in.readLine());
		  }
     
		  check2 = temp1. checkLocation(c, d);

		  while(check2 == true){
		      System.out.print("Enter another row: ");
		      c = Integer.parseInt(in.readLine());

		      while(c < 0 || c > 2){
			  System.out.print("Please enter a number between 0 and 2: ");
			  c = Integer.parseInt(in.readLine());
		      }

		      System.out.print("Enter another column: ");
		      d = Integer.parseInt(in.readLine());

		      while(d < 0 || d > 2){
			  System.out.print("Please enter a number between 0 and 2: ");
			  d = Integer.parseInt(in.readLine());
		      }
		   
		      check2 = temp1.checkLocation(c, d); 
		  }  
		  temp1.insertSymbol(c, d, player2.getSymbol());	
		  temp1.printBoard();
		  temp1.winning_condition(player2.getSymbol(), player2.getName());
		  }while(win == false);
	    
	}
	public boolean checkLocation(int d, int e){
	    if (tic_tac_toe[d][e] == 'x' || tic_tac_toe[d][e] == 'o' ){
		System.out.print("Please select a different location.\n");
		check = true;
		return check;
	    }
	    check = false;
	    return check;
	}
	//create an output function
	public void printBoard(){
	    for (int i = 0 ; i < 3; i++){
		System.out.print("\t\t");
		
		for( int j = 0; j < 3; j++){
		    System.out.print(tic_tac_toe[i][j]);
		    
		    if (j != 2)
			System.out.print("|");
		}
		System.out.print("\n");
		
		if( i != 2){
		    System.out.print("\t\t_ _ _");
		    System.out.print("\n");
		}
	    }    
	    System.out.print("\n");
	}
	
	public char[][] insertSymbol( int a, int b, char a_symbol){
	    tic_tac_toe[a][b] = a_symbol;
	    return tic_tac_toe;
	}
	public void  winning_condition(char winning_symbol, String name_of_winner){
	    //pass in name, symbol
	    
	    if (tic_tac_toe[0][0] == winning_symbol && tic_tac_toe[1][0] == winning_symbol && tic_tac_toe[2][0] == winning_symbol){
		
		System.out.print("\t\t" + name_of_winner + " wins!\n");
	   
		System.exit(0);
	    }
	    else if (tic_tac_toe[0][1] == winning_symbol && tic_tac_toe[1][1] == winning_symbol && tic_tac_toe[2][1] == winning_symbol){
		System.out.print("\t\t" + name_of_winner + " wins!\n");
	       
		System.exit(0);
	    }
	    else if (tic_tac_toe[0][2] == winning_symbol && tic_tac_toe[1][2] == winning_symbol && tic_tac_toe[2][2] == winning_symbol){
		System.out.print("\t\t" + name_of_winner + " wins!\n");
	       
		System.exit(0);
	    }
	    else if (tic_tac_toe[0][0] == winning_symbol && tic_tac_toe[0][1] == winning_symbol && tic_tac_toe[0][2] == winning_symbol){
		System.out.print("\t\t" + name_of_winner + " wins!\n");
		
		System.exit(0);
	    }
	    else if (tic_tac_toe[1][0] == winning_symbol && tic_tac_toe[1][1] == winning_symbol && tic_tac_toe[1][2] == winning_symbol){
		System.out.print("\t\t" + name_of_winner + " wins!\n");
		
		System.exit(0);
	    }
	    else if (tic_tac_toe[2][0] == winning_symbol && tic_tac_toe[2][1] == winning_symbol && tic_tac_toe[2][2] == winning_symbol){
		System.out.print("\t\t" + name_of_winner + " wins!\n");
		
		System.exit(0);
	    }
	    else if (tic_tac_toe[0][0] == winning_symbol && tic_tac_toe[1][1] == winning_symbol && tic_tac_toe[2][2] == winning_symbol){
		System.out.print("\t\t" + name_of_winner + " wins!\n");
		
		System.exit(0);
	    }
	    else if (tic_tac_toe[0][2] == winning_symbol && tic_tac_toe[1][1] == winning_symbol && tic_tac_toe[2][0] == winning_symbol){
		System.out.print("\t\t" + name_of_winner + " wins!\n");
	       
		System.exit(0);
	    }
	    else if (tic_tac_toe[0][0] != ' ' && tic_tac_toe[0][1] != ' ' && tic_tac_toe[0][2] != ' ' && tic_tac_toe[1][0] != ' ' && tic_tac_toe[1][1] != ' ' && tic_tac_toe[1][2] != ' ' && tic_tac_toe[2][0] != ' ' && tic_tac_toe[2][1] != ' ' && tic_tac_toe[2][2] != ' ')
	{
	    System.out.print("\t\tDraw!\n");
	    System.exit(0);
	}
    else
	
	System.out.println("");
	}

    public void displayDirections(){
	System.out.print("Copyright 2007, created by Ebrain Mirambeau\n\n");
	System.out.print("\n\tWelcome to X's and O's!!!\n\n");
	
	System.out.print("The objective of this game is to mark the board with\nyour symbol. The first player to successfully mark\nthe board with three of their own symbols consecutively\nwins the game.\n\n");
	
	System.out.print("Each player will be prompted to enter a symbol by\nindicating both a column and a row. The minimum number of\nboth rows and columns is 0 and the maximum is 2.\n\n");

	System.out.print("The first number is each grid represents a row and\nthe second represents a column.\n\n");

	System.out.print("\t  [0,0]|[0,1]|[0,2]\n");
	System.out.print("\t  _____ _____ _____\n");
	System.out.print("\t  [1,0]|[1,1]|[1,2]\n");
	System.out.print("\t  _____ _____ _____\n");
	System.out.print("\t  [2,0]|[2,1]|[2,2]\n\n");

	System.out.print("\t    Good Luck!!!\n\n\n");
	System.out.print("\t\tBegin!\n\n");
}

public static void main(String[] args) throws IOException{
    ticTest x = new ticTest();
    x.displayDirections();
    x.printBoard();
    x.startGame();
  
}
}   

