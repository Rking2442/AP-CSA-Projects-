import java.util.*; 
public class TrianglePatterns
{
    public static Scanner sc = new Scanner(System.in); 
    public static int height = 0; 
    public static int type = 1; 
    public static void main(String[] args)
    {
        /*System.out.println("1. Left-Aligned Number Triangle\n2. Right-Aligned Number Triangle\n3. Inverted Number Triangle\n4. Floyd's Triangle\n5. Pascal's Triangle"); 

        System.out.println("Select Triangle Type: "); 
        type = sc.nextInt(); 
        
        System.out.println("Enter The Height Of Your Triangle: "); 
        height = sc.nextInt(); */
        
        
        printLeftAlignedTriangle(5); 
        System.out.println("\n"); 
        printRightAlignedTriangle(5);
        System.out.println("\n"); 
        printInvertedTriangle(5);
        System.out.println("\n");
        printFloydsTriangle(5); 
        System.out.println("\n"); 
        printPascalsTriangle(5); 
    }
    public static void printLeftAlignedTriangle(int height) { 
      for (int i = 1; i <= height; i++) { 
          for (int h =1; h <= i; h++) { 
              System.out.print(h + " "); 
          } 
          System.out.println(); 
          
    } 
}
    public static void printRightAlignedTriangle(int height) { 
        for (int i = 1; i <= height; i++) { 
            for(int j = height-1; j >= i; j--) { 
                System.out.print(" ");
        }
            for (int h = 1; h <= i; h++) {
                System.out.print(h); 
        } 
            System.out.println(); 
    } 
    } 
    public static void printInvertedTriangle(int height) { 
        for (int i = 1; i <= height; i++) { 
          for (int h = height; h >= i; h--) { 
              System.out.print(h + " "); 
          } 
          System.out.println(); 

    }
    }
    public static void printFloydsTriangle(int height) { 
        int count = 1; 
        for (int i = 1; i <= height; i++) { 
          for (int h =1; h <= i; h++) { 
              System.out.print(count+ " "); 
              count+= 1; 
          } 
          System.out.println(); 
          
    } 
}
    public static void printPascalsTriangle(int height) {
        
        for (int row = 0; row < height; row++) { 
            int value = 1;  
            for(int j = height; j >= row; j--) { 
              System.out.print(" "); 
          } 
            for (int column = 0; column <= row; column++) { 
                System.out.print(value + " "); 
                value = value * (row - column) / (column + 1);
               }  
            System.out.println();
               
          }
          
            
        }    
}   
    
/**/