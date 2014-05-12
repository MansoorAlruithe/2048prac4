
import java.util.Scanner;


public class Game {

    public static Scanner scan = new Scanner(System.in);
    public static int[][] data = new int[4][4];
    
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
    
    public static void tiltLeft(){
        // tilt board left
        for(int i=0; i<4; i++){
            if(data[i][2]==0){
                data[i][2]=data[i][3];
                data[i][3] = 0;
            }
            if(data[i][1]==0){
                data[i][1]=data[i][2];
                data[i][2]=data[i][3];
                data[i][3] = 0;
            }
            if(data[i][0]==0){
                data[i][0]=data[i][1];
                data[i][1]=data[i][2];
                data[i][2]=data[i][3];
                data[i][3] = 0;
            }
        }
    }
    
    public static void tiltRight(){
        // tilt board right
        for(int i=0; i<4; i++){
            if(data[i][1]==0){
                data[i][1]=data[i][0];
                data[i][0] = 0;
            }
            if(data[i][2]==0){
                data[i][2]=data[i][1];
                data[i][1]=data[i][0];
                data[i][0] = 0;
            }
            if(data[i][3]==0){
                data[i][3]=data[i][2];
                data[i][2]=data[i][1];
                data[i][1]=data[i][0];
                data[i][0] = 0;
            }
        }
    }
    
    public static void tiltUp(){
        // tilt board up
    }
    
    public static void tiltDown(){
        // tilt board down
    }
    
    private static int getRandomNumber(){
        return (int)Math.random()*4;
    }
    
    private static void populateRandomCell(){
        int i,j;
        do{
            i = getRandomNumber();
            j = getRandomNumber();
            
        }while(data[i][j]==0);
        if(getRandomNumber()<2){
            data[i][j] = 2;
        }
        else{
            data[i][j] = 2;
        }
    }
}
