import java.util.*; 
public class MyProgram { 
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) { 
        System.out.println("Help me fight ze monster, Name: "); 
        String name = sc.nextLine(); 
        String monster = "Human"; 
        String result = "Unknown"; 
        
        System.out.println("Choose a weapon (sword, bow, magic): "); 
        String weapon = sc.nextLine().trim().toUpperCase(); 
        int choice = (int)(Math.random() * 3) + 1; 
        switch (choice) { 
            case 1: 
                System.out.println("Troll!"); 
                monster = "troll"; 
                break; 
            case 2: 
                System.out.println("Bow!"); 
                monster = "bow"; 
                break; 
            case 3: 
                System.out.println("Vampire!"); 
                monster = "vampire"; 
                break; 
        } 
        System.out.println("Your weapon: " + weapon); 
        switch ((int)(Math.random() * 6) + 1)  { 
            case 1: 
                result = "The monster has defeated you with his potions"; 
                break; 
            case 2: 
                result = "The monster has destroyed you with his skill";  
                break; 
            case 3: 
                result = "The monster has taken you captive";  
                break; 
            case 4: 
                result = "You have beat the monster with your weapon"; 

            case 5: 
                result = "Your mighty skill has murdered the monster"; 
                break; 
            case 6: 
                result = "You have won and are too skillful"; 
                break; 
        } 
        if (!(weapon == "SWORD" || weapon == "BOW" || weapon == "MAGIC")) { 
            System.out.println("Monster Name: " + monster + "\nYour Weapon: " + weapon + "\nResult " + result ); 
        } 
    } 
}