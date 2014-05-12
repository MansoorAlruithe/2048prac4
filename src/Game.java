
import java.util.Scanner;


public class Game {

    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        String userInput;
        do{
            displayBoard();
            userInput = readUserInput();
        }while(!userInput.equalsIgnoreCase("Q"));
    }
    
    public static void displayBoard(){
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("[ ]");
                if(j==3){
                    System.out.print("\n");
                }
            }
        }
    }
    
    public static String readUserInput(){
        String userInput;
        do{
            System.out.println("Next move? 'Q to quit' : ");
            userInput = scan.nextLine();
        }while(!userInput.equalsIgnoreCase("Q") && 
                !userInput.equalsIgnoreCase("L") && 
                !userInput.equalsIgnoreCase("R") && 
                !userInput.equalsIgnoreCase("U") && 
                !userInput.equalsIgnoreCase("D") );
        return userInput;
    }
}
