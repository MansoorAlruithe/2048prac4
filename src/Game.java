
import java.util.Scanner;

public class Game {

    public static Scanner scan = new Scanner(System.in);
    public static int[][] data;
    public static int score = 0;
    public static int boardSize = 6;
    
    public static void main(String[] args) {
        String userInput;
        // initialize data array with initial value 0
        data= new int[boardSize][boardSize];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                data[i][j]= 0;
            }
        }
        // initially populate 2 random cells
        populateRandomCell(true);
        populateRandomCell(true);
        do{
      
            displayBoard(boardSize);
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
        displayBoard(boardSize);
        System.out.println("Game Over. Your score is "+ score);
        
    }
    
    public static void displayBoard(int size){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                String cellValue = " ";
                if(data[i][j]!=0){
                    cellValue = ""+data[i][j];
                }
                if(cellValue.length()==1){
                    System.out.print("[    "+cellValue+"]");
                }
                else if(cellValue.length()==2){
                    System.out.print("[   "+cellValue+"]");
                }
                 else if(cellValue.length()==3){
                    System.out.print("[  "+cellValue+"]");
                }
                 else if(cellValue.length()==4){
                    System.out.print("[ "+cellValue+"]");
                }
                if(j==size-1){
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
        for(int i=0; i<boardSize; i++){
            rotateLeft(i);
            if(checkMergeLeft(i)){
                checkMergeLeft(i);
            }
        }
    }
    
    public static void tiltRight(){
        // tilt board right
        for(int i=0; i<boardSize; i++){
            rotateRight(i);
            if(checkMergeRight(i)){
                checkMergeRight(i);
            }
        }
    }
    
    public static void tiltUp(){
        // tilt board up
        for(int i=0; i<boardSize; i++){
            rotateUp(i);
            if(checkMergeUp(i)){
                checkMergeUp(i);
            }
        }
    }
    
    public static void tiltDown(){
        // tilt board down
        for(int i=0; i<boardSize; i++){
            rotateDown(i);
            if(checkMergeDown(i)){
                checkMergeDown(i);
            }
        }
    }
    
    public static int getRandomNumber(){
        return (int)(Math.random()*boardSize);
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
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                if(data[i][j]==0){
                    gameOver = false;
                    break;
                }
            }
        }
        return gameOver;
    }

    private static void rotateRight(int i) {
        for(int j = 1 ; j<boardSize ; j++){
            if(data[i][j]==0){
                for(int x= j ; x>0; x--){
                    data[i][x] = data[i][x-1];
                    data[i][x-1]=0;
                }
            }
        }        
    }

    private static boolean checkMergeRight(int i) {
        boolean merged = false;
        for(int j=boardSize-1; j>0; j--){
            if(data[i][j] == data[i][j-1]){
                data[i][j] = data[i][j] + data[i][j-1];
                score += data[i][j];
                merged = true;
                data[i][j-1] = 0;
                rotateRight(i);
            }
        }
        return merged;
    }
    
    private static void rotateLeft(int i) {
        for(int j = boardSize-2 ; j>=0 ; j--){
            if(data[i][j]==0){
                for(int x= j ; x<boardSize-1; x++){
                    data[i][x] = data[i][x+1];
                    data[i][x+1]=0;
                }
            }
        }        
    }

    private static boolean checkMergeLeft(int i) {
        boolean merged = false;
        for(int j=0; j<=boardSize-2; j++){
            if(data[i][j] == data[i][j+1]){
                data[i][j] = data[i][j] + data[i][j+1];
                score += data[i][j];
                merged = true;
                data[i][j+1] = 0;
                rotateLeft(i);
            }
        }
        return merged;
    }
    
     private static void rotateDown(int i) {
        for(int j = 1 ; j<boardSize ; j++){
            if(data[j][i]==0){
                for(int x= j ; x>0; x--){
                    data[x][i] = data[x-1][i];
                    data[x-1][i]=0;
                }
            }
        }        
    }

    private static boolean checkMergeDown(int i) {
        boolean merged = false;
        for(int j=boardSize-1; j>0; j--){
            if(data[j][i] == data[j-1][i]){
                data[j][i] = data[j][i] + data[j-1][i];
                score += data[j][i];
                merged = true;
                data[j-1][i] = 0;
                rotateDown(i);
            }
        }
        return merged;
    }
    
    private static void rotateUp(int i) {
        for(int j = boardSize-2 ; j>=0 ; j--){
            if(data[j][i]==0){
                for(int x= j ; x<boardSize-1; x++){
                    data[x][i] = data[x+1][i];
                    data[x+1][i]=0;
                }
            }
        }        
    }

    private static boolean checkMergeUp(int i) {
        boolean merged = false;
        for(int j=0; j<=boardSize-2; j++){
            if(data[j][i] == data[j+1][i]){
                data[j][i] = data[j][i]+ data[j+1][i];
                score += data[j][i];
                merged = true;
                data[j+1][i] = 0;
                rotateUp(i);
            }
        }
        return merged;
    }
    
}
