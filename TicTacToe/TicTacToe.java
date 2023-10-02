// Incomplete, but will be finished soon! Stay tuned :)

import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class TicTacToe {

  static ArrayList<Integer> playerPosition = new ArrayList<Integer>();
  static ArrayList<Integer> computerPosition = new ArrayList<Integer>();
  
  public static void main(String[] args) {
    char[][] table = {{' ' , '|' , ' ' , '|' , ' '},
                      {'o' , 'o' , 'o' , 'o' , 'o'},
                      {' ' , '|' , ' ' , '|' , ' '},
                      {'o' , 'o' , 'o' , 'o' , 'o'},
                      {' ' , '|' , ' ' , '|' , ' '}};
    
    printTable(table);
    
    while(true) {
    
      Scanner scan = new Scanner(System.in);
      System.out.println("Hi there! Choose a number between [1, 9]");
      int playerPosition = scan.nextInt();
    
      placementForTable(table, playerPosition, "player");
      Random rand = new Random();
      int computerPosition = rand.nextInt(9) + 1;
      placementForTable(table, computerPosition, "computer");
    
      printTable(table);
    }
    
  }  
  
  public static void printTable(char[][] table) {
    for(char[] row: table) {
      for(char column: row) {
          System.out.print(column);
      }
      System.out.println();
    }
  } 
  
  public static void placementForTable(char[][] table, int playerPosition, String user) {
  
    char xAndOhs = ' ';
    
    if(user.equals("player")) {
      xAndOhs = 'X';
    }
    else if (user.equals("computer")) {
      xAndOhs = 'O';
    }
  
    switch (playerPosition) {
      case 1:
        table[0][0] = xAndOhs;
        break;
      case 2:
        table[0][2] = xAndOhs;
        break;
      case 3:
        table[0][4] = xAndOhs;
        break;
      case 4:
        table[2][0] = xAndOhs;
        break;
      case 5:
        table[2][2] = xAndOhs;
        break;
      case 6:
        table[2][4] = xAndOhs;
        break;
      case 7:
        table[4][0] = xAndOhs;
        break;
      case 8:
        table[4][2] = xAndOhs;
        break;
      case 9:
        table[4][4] = xAndOhs;
        break;
      default:
        break;
    }
  }
    
     public static String isWinner() {
      List upperRow = Arrays.asLists(1, 2, 3);
      List middleRow = Arrays.asLists(4, 5, 6);
      List lowerRow = Arrays.asLists(7, 8, 9);
      List leftCol = Arrays.asLists(1, 4, 7);
      List middleCol = Arrays.asLists(2, 5, 8);
      List rightCol = Arrays.asLists(3, 6, 9);
      List leftDiagonal = Arrays.asLists(1, 5, 9);
      List rightDiagonal = Arrays.asLists(3, 5, 7);
      
      List<List> gameWinner = new ArrayList<List>();
      gameWinner.add(upperRow);
      gameWinner.add(middleRow);
      gameWinner.add(lowerRow);
      gameWinner.add(leftCol);
      gameWinner.add(middleCol);
      gameWinner.add(rightCol);
      gameWinner.add(leftDiagonal);
      gameWinner.add(rightDiaganol);
      
      for(list listy: gameWinner)
        if(playerPosition.containsAll(listy)) {
          return "Nice win!";
        }
        else if(computerPosition.containsAll(listy)) {
          return "Computer wins this time...";
        }
      //  else if() {
          
      //  }
      return "";
    }
}