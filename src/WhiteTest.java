
public class WhiteTest {
    
    public static void main(String[] args){
        testPopulateGrid(2);
        testPopulateGrid(4);
        testPopulateGrid(6);
        
        testPrintGridCell(0);
        testPrintGridCell(2);
        testPrintGridCell(16);
        testPrintGridCell(128);
        testPrintGridCell(1024);
        
        testIsCellFree(0);
        testIsCellFree(2);
        
        testTiltRowLeft();
        
        testGamOver();
    }
    
    private static void testPopulateGrid(int boardSize){
        int[][] data= new int[boardSize][boardSize];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                data[i][j]= 0;
            }
        }
        boolean result = true;
        
        if(data.length != boardSize){
            result = false;
        }
        else{
            for(int[] row: data){
                if(row.length != boardSize){
                    result = false;
                }
            }
        }
        
        if(result == true){
            System.out.println("testPopulateGrid PASSD for board size = "+boardSize);
        }
        else{
            System.out.println("testPopulateGrid FAILED for board size = "+boardSize);
        }
    }
    
    private static void testPrintGridCell(int value){
        String cellValue = " ";
        String output = "";
        if(value!=0){
            cellValue = ""+value;
        }
        if(cellValue.length()==1){
            output = ("[    "+cellValue+"]");
        }
        else if(cellValue.length()==2){
            output = ("[   "+cellValue+"]");
        }
         else if(cellValue.length()==3){
            output = ("[  "+cellValue+"]");
        }
         else if(cellValue.length()==4){
            output = ("[ "+cellValue+"]");
        }
        
        if(output.length() == 7){
            System.out.println("testPrintGridCell PASSD for value = "+value);
        }
        else{
            System.out.println("testPrintGridCell FAILED for value = "+value);
        }
    }
    
    private static void testIsCellFree(int value){
        boolean free;
        if(value==0){
            free = true;
        }
        else{
            free = false;
        }
        
        if((free == false && value != 0) || (free == true && value == 0)){
            System.out.println("testIsCellFree PASSED for value = "+value);
        }
        else{
            System.out.println("testIsCellFree FAILD for value = "+value);
        }
    }
    
    private static void testTiltRowLeft(){
        int i = 2;
        int boardSize = 4;
        int[][] data = new int[][]{{0,0,0,2},{2,2,2,0},{0,0,0,2},{2,0,0,0}};
        for(int j = boardSize-2 ; j>=0 ; j--){
            if(data[i][j]==0){
                for(int x= j ; x<boardSize-1; x++){
                    data[i][x] = data[i][x+1];
                    data[i][x+1]=0;
                }
            }
        }  
        if(data[2][0]==2 && data[2][1]==0 && data[2][2]==0 && data[2][3]==0){
            System.out.println("testTiltRowLeft PASSED");
        }
        else{
            System.out.println("testTiltRowLeft FAILD");
        }
    }
    
    private static void testGamOver(){
        int boardSize = 4;
        int[][] data = new int[][]{{0,0,0,2},{2,2,2,0},{0,0,0,2},{2,0,0,0}};
        
        boolean gameOver = true;
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                if(data[i][j]==0){
                    gameOver = false;
                    break;
                }
            }
        }
        
        if(gameOver == false){
            System.out.println("testGamOver PASSED for case not game over");
        }
        else{
            System.out.println("testGamOver FAILD for case not game over");
        }
        
        gameOver = true;
        data = new int[][]{{4,8,16,32},{2,4,32,128},{4,8,16,64},{2,4,32,512}};
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                if(data[i][j]==0){
                    gameOver = false;
                    break;
                }
            }
        }
        if(gameOver == true){
            System.out.println("testGamOver PASSED for case game over");
        }
        else{
            System.out.println("testGamOver FAILD for case game over");
        }
        
        
        
    }
}
