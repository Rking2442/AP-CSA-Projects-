import java.util.*; 

public class MyProgram
{
    public static int isChar = 0; 
    public static int isHex = 0; 
    public static String finalResult; 
    public static Scanner sc = new Scanner(System.in); 
    public static String stop = "NO";  
    public static void main(String[] args)
    
    {
        while (stop.equals("NO")) { 
        System.out.println("Enter the original base (2–16): "); 
        int base = sc.nextInt(); 
        sc.nextLine();
        System.out.println("Enter the number: "); 
        String b = sc.nextLine(); 
        for(int i = 0; i < b.length(); i++) { 
            if(base <= 9 && Character.isDigit(b.charAt(i)) == false) { 
                System.out.println("Please Reenter Number: "); 
                b = sc.nextLine(); 
            } 
        }
        System.out.println("Enter the target base (2–16): "); 
        int tBase = sc.nextInt(); 
        if(base < 2 || base > 16) { 
            System.out.println("Please Reenter Base: "); 
            base = sc.nextInt(); 
        } 
        if(tBase < 2 || tBase > 16) { 
            System.out.println("Please Reenter Target Base: "); 
            tBase = sc.nextInt(); 
        } 
        
        for(int i = 0; i < b.length(); i++) { 
            if (Character.isDigit(b.charAt(i))) { 
                isChar += 1; 
            } else {
                isHex += 1; 
            } 
        } 
        b = b.toUpperCase(); 
        if (isHex > 0) { 
            finalResult = decimalToAnyBase(hexToDecimal(b), tBase); 
            
        } else { 
           finalResult =  decimalToAnyBase(anyToDecimal(b, base), tBase);
        } 
        
        System.out.println("Result: " + b + " (base " + base + ") = " + finalResult + "(base " + tBase + ")");
        System.out.println("Continue?(Yes/No): "); 
        sc.nextLine(); 
        stop = sc.nextLine().trim().toUpperCase(); 
        if(stop == "YES") { 
            stop = "YES"; 
        } else if (stop == "NO") { 
            stop = "NO"; 
        } else { 
            System.out.println("Continue?(Yes/No): "); 
            sc.nextLine(); 
            stop = sc.nextLine().trim().toUpperCase(); 
        }
    } 
    }
        
        public static String anyToDecimal(String b, int base) { 
        int result = 0; 
        for (int i = 0; i < b.length(); i++) { 
            String d = b.substring(i, i+1); 
            result += Integer.parseInt(d)*Math.pow(base, b.length()-i-1); 
            
        } 
        return "" + result; 
        
    } 
    public static String decimalToAnyBase(String b, int tBase) { 
        String res = ""; 
        int number = Integer.parseInt(b); 
        String digits = "0123456789ABCDEF"; 
        while(number > 0) { 
            int res1 = number % tBase; 
            res = digits.charAt(res1) + res; 
            number = number / tBase; 
            
            
        } 
        return "" + res;  
    } 
    public static String hexToDecimal(String b) { 
        String res = ""; 
        int result = 0; 
        String digits = "0123456789ABCDEF"; 
        for (int i = 0; i < b.length(); i++) { 
            
            String d = b.substring(i, i+1); 
            char c = b.charAt(i); 
            int h = 0; 
            switch(c) { 
                case 'A': 
                    h = 10; 
                    break; 
                case 'B': 
                    h = 11; 
                    break; 
                case 'C': 
                    h = 12; 
                    break; 
                case 'D': 
                    h = 13; 
                    break; 
                case 'E': 
                    h = 14;
                    break; 
                case 'F': 
                    h = 15; 
                    break; 
                default: 
                    h = c - '0'; 
                    break; 
            } 
            
            result += h*Math.pow(16, b.length()-i-1);
             
        }
             
        return "" + result;  
    } 
    
}