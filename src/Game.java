
import java.util.Scanner;


public class Game {

    private static Scanner scan = new Scanner(System.in);
    private static int[][] data = new int[4][4];
    
    public static void main(String[] args) {
        String userInput;
        do{
            displayBoard();
            userInput = readUserInput();
            if(userInput.equalsIgnoreCase("L")){
                tiltLeft();
            }
            else if(userInput.equalsIgnoreCase("R")){
                tiltRight();
            }
            else if(userInput.equalsIgnoreCase("U")){
                tiltUp();
            }
            else if(userInput.equalsIgnoreCase("D")){
                tiltDown();
            }
        }while(!userInput.equalsIgnoreCase("Q"));
    }
    
    public static void displayBoard(){
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                String cellValue = "";
                if(data[i][j]!=0){
                    cellValue = ""+data[i][j];
                }
                System.out.print("[ "+cellValue+" ]");
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
    
    private static void tiltLeft(){
        // tilt board left
    }
    
    private static void tiltRight(){
        // tilt board left
    }
    
    private static void tiltUp(){
        // tilt board up
    }
    
    private static void tiltDown(){
        // tilt board down
    }
}
