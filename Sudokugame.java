import java.util.ArrayList; 
import java.util.*; 


public class MyProgram { 
  public static int[][] board = new int[9][9];
  public static int[][] board2 = new int[9][9];
  public static int row; 
  public static int col; 
  public static Scanner sc = new Scanner(System.in); 
  public static ArrayList<Integer> list = new ArrayList<>(); 
  
  public static void main(String[] args) { 
      generate();
      copy(); 
      randRemove(); 
      print2(); 
      System.out.println("Solve the board for all 0s?!!");
      guess(); 
      
      
      
  } 
  public static void randRemove() { 
      for (int j = 0; j < 5; j++) {
          int rand = (int)(Math.random() * 9); 
        if (board2[rand][rand] == 0) { 
            rand = (int)(Math.random() * 9); 
        } 
        list.add(rand); 
        board2[rand][rand] = 0; 
      } 
      
      
  } 
  public static void guess() { 
      System.out.println(); 
      System.out.println("Row: (1-9) "); 
      int row = sc.nextInt()-1; 
      System.out.println("Col: (1-9)"); 
      int col = sc.nextInt()-1; 
      System.out.println("Replacing number? (1-9)"); 
      int replace = sc.nextInt(); 
      sc.nextLine(); 
      Boolean bool = false; 
      for(int i = 0; i < list.size(); i++) { 
          if (row == list.get(i) && col == list.get(i)) { 
              bool = true; 
          } 
      } 
      if (bool) { 
          board2[row][col] = replace; 
      } 
       
      System.out.println("Continue? (Yes/No)"); 
      
      String conf = sc.nextLine().trim().toUpperCase(); 
      
      if (conf.equals("YES")) { 
          guess(); 
      } else { 
          check(); 
      } 
      
  } 
  public static void check() { 
      Boolean cheque = true; 
      for (int i = 0; i < 9; i++) {
         for (int j = 0; j < 9; j++) { 
             if (board[i][j] != board2[i][j]) { 
                 cheque = false; 
             } 
         }
      
      }
      if (cheque) { 
          System.out.println("Congrats You Passed!"); 
      } else { 
          System.out.println("Not this time"); 
          guess(); 
      }
  } 
  public static void copy() { 
      for (int i = 0; i < 9; i++) { 
        for (int j = 0; j < 9; j++) { 
            board2[i][j] = board[i][j]; 
            
        } 
      } 
      
  } 
  public static void generate() { 
      for (row = 0; row < 9; row++)  { 
        for (col = 0; col < 9; col++)   { 
          board[row][col] = (row * 3 + row / 3 + col) % 9 + 1;   
            
        } 
          
      } 
      
  } 

  public static void print() { 
     for (int i = 0; i < 9; i++) { 
         if (i % 3 == 0 && i != 0) { 
           System.out.println("------------");  
         } 
       for (int j = 0; j < 9; j++)  { 
           if (j % 3 == 0 && j != 0) { 
             System.out.print("|");   
           } 
           System.out.print(board[i][j]); 
       } 
       System.out.println(); 
         
     } 
     
  } 
  public static void print2() { 
     for (int i = 0; i < 9; i++) { 
         if (i % 3 == 0 && i != 0) { 
           System.out.println("------------");  
         } 
       for (int j = 0; j < 9; j++)  { 
           if (j % 3 == 0 && j != 0) { 
             System.out.print("|");   
           } 
           System.out.print(board2[i][j]); 
       } 
       System.out.println(); 
         
     } 
     
  }
    
    
    
    
} 
