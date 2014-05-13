
import java.util.Scanner;

public class Game {

    public static Scanner scan = new Scanner(System.in);
    public static int[][] data = new int[][]{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
    public static int score = 0;
    
    public static void main(String[] args) {
        String userInput;
        // initially populate 2 random cells
        populateRandomCell(true);
        populateRandomCell(true);
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
            if(!userInput.equalsIgnoreCase("Q")){
                populateRandomCell(false);
            }
        }while(!userInput.equalsIgnoreCase("Q") && !checkIfGameOver());
        displayBoard();
        System.out.println("Game Over. Your score is "+ score);
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
            if(!userInput.equalsIgnoreCase("Q") && 
                !userInput.equalsIgnoreCase("L") && 
                !userInput.equalsIgnoreCase("R") && 
                !userInput.equalsIgnoreCase("U") && 
                !userInput.equalsIgnoreCase("D")){
                System.out.println("Invalid input. Type l, r, u, or d to tilt board");
            }
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
            // check if we need to merge
            if(data[i][0] == data[i][1]){
                data[i][0] = data[i][0] + data[i][1];
                score += data[i][0];
                data[i][1] = data[i][2];
                data[i][2] = data[i][3];
                data[i][3] = 0;
                if(data[i][1] == data[i][2]){
                    data[i][1] = data[i][1] + data[i][2];
                    score += data[i][1];
                    data[i][2] = 0;
                }
            }
            else if(data[i][1] == data[i][2]){
                data[i][1] = data[i][1] + data[i][2];
                score += data[i][1];
                data[i][2] = 0;
                data[i][2] = data[i][3];
                data[i][3] = 0;
            }
            else if(data[i][2] == data[i][3]){
                data[i][2] = data[i][2] + data[i][3];
                score += data[i][2];
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
            // check if we need to merge
            if(data[i][2] == data[i][3]){
                data[i][3] = data[i][2] + data[i][3];
                score += data[i][3];
                data[i][2] = data[i][1];
                data[i][1] = data[i][0];
                data[i][0] = 0;
                if(data[i][1] == data[i][2]){
                    data[i][2] = data[i][1] + data[i][2];
                    score += data[i][2];
                    data[i][1] = 0;
                }
            }
            else if(data[i][1] == data[i][2]){
                data[i][2] = data[i][1] + data[i][2];
                score += data[i][2];
                data[i][1] = 0;
                data[i][1] = data[i][0];
                data[i][0] = 0;
            }
            else if(data[i][0] == data[i][1]){
                data[i][1] = data[i][1] + data[i][0];
                score += data[i][1];
                data[i][0] = 0;
            }
        }
    }
    
    public static void tiltUp(){
        // tilt board up
        for(int i=0; i<4; i++){
            if(data[2][i]==0){
                data[2][i]=data[3][i];
                data[3][i] = 0;
            }
            if(data[1][i]==0){
                data[1][i]=data[2][i];
                data[2][i]=data[3][i];
                data[3][i] = 0;
            }
            if(data[0][i]==0){
                data[0][i]=data[1][i];
                data[1][i]=data[2][i];
                data[2][i]=data[3][i];
                data[3][i] = 0;
            }
            // check if we need to merge
            if(data[0][i] == data[1][i]){
                data[0][i] = data[0][i] + data[1][i];
                score += data[0][i];
                data[1][i] = data[2][i];
                data[2][i] = data[3][i];
                data[3][i] = 0;
                if(data[1][i] == data[2][i]){
                    data[1][i] = data[1][i] + data[2][i];
                    score += data[1][i];
                    data[2][i] = 0;
                }
            }
            else if(data[1][i] == data[2][i]){
                data[1][i] = data[1][i] + data[2][i];
                score += data[1][i];
                data[2][i] = 0;
                data[2][i] = data[3][i];
                data[3][i] = 0;
            }
            else if(data[2][i] == data[3][i]){
                data[2][i] = data[2][i] + data[3][i];
                score += data[2][i];
                data[3][i] = 0;
            }
        }
    }
    
    public static void tiltDown(){
        // tilt board down
        for(int i=0; i<4; i++){
            if(data[1][i]==0){
                data[1][i]=data[0][i];
                data[0][i] = 0;
            }
            if(data[2][i]==0){
                data[2][i]=data[1][i];
                data[1][i]=data[0][i];
                data[0][i] = 0;
            }
            if(data[3][i]==0){
                data[3][i]=data[2][i];
                data[2][i]=data[1][i];
                data[1][i]=data[0][i];
                data[0][i] = 0;
            }
        }
    }
    
    public static int getRandomNumber(){
        return (int)(Math.random()*4);
    }
    
    private static void populateRandomCell(boolean startGame){
        int i,j;
        int counter =10000;
        do{
            i = getRandomNumber();
            j = getRandomNumber();
            counter --;
        }while(data[i][j]!=0 && counter >0);
        if(startGame){
            data[i][j] = 2;
        }
        else{
            if(getRandomNumber()<2){
                data[i][j] = 2;
            }
            else{
                data[i][j] = 4;
            }
        }
        
    }
    
    public static boolean checkIfGameOver(){
        boolean gameOver = true;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(data[i][j]==0){
                    gameOver = false;
                    break;
                }
            }
        }
        return gameOver;
    }
}
