
import java.util.Scanner;


public class Game {

    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        String userInput;
        do{
            displayBoard();
            System.out.print("Next move? 'Q to quit' : ");
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
        String userInput = scan.nextLine();
        return userInput;
    }
}
