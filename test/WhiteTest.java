
import org.junit.Test;
import static org.junit.Assert.*;

public class WhiteTest {
    
    @Test
    // This test method tests the execution path for the if statement in the rotateLeft method.
    public void testRotateLeftPath1(){
        Game.data = new int[][]{{0,0,0,2},{2,2,2,0},{2,0,0,2},{2,0,0,0}};
        Game.rotateLeft(2);
        assertArrayEquals(Game.data[2], new int[]{2, 2, 0, 0});
    }
    
    @Test
    // This test method tests the execution path for the if statement in the rotateRight method.
    public void testRotateRightPath1(){
        Game.data = new int[][]{{0,0,0,2},{2,2,2,0},{2,0,0,2},{2,0,0,0}};
        Game.rotateRight(2);
        assertArrayEquals(Game.data[2], new int[]{0, 0, 2, 2});
    }
    
    @Test
    // This test method tests the execution path for the if statement in the rotateUp method.
    public void testRotateUpPath1(){
        Game.data = new int[][]{{0,0,0,2},{2,2,2,0},{2,0,0,2},{2,0,0,0}};
        Game.rotateUp(3);
        assertEquals(Game.data[0][3], 2);
        assertEquals(Game.data[1][3], 2);
        assertEquals(Game.data[2][3], 0);
        assertEquals(Game.data[3][3], 0);
    }
    
    @Test
    // This test method tests the execution path for the if statement in the rotateDown method.
    public void testRotateDownPath1(){
        Game.data = new int[][]{{0,0,0,2},{2,2,2,0},{2,0,0,2},{2,0,0,0}};
        Game.rotateDown(3);
        assertEquals(Game.data[0][3], 0);
        assertEquals(Game.data[1][3], 0);
        assertEquals(Game.data[2][3], 2);
        assertEquals(Game.data[3][3], 2);
    }
    
    @Test
    // This test method tests the execution path for the if statement in the checkIfGameOver method.
    public void testCheckIfGameOverPath1(){
        Game.data = new int[][]{{0,0,0,2},
                                {2,8,4,0},
                                {8,0,0,4},
                                {4,0,0,0}};
        assertFalse(Game.checkIfGameOver());
    }
    
    @Test
    // This test method tests the execution path for the if statement in the checkIfGameOver method.
    public void testCheckIfGameOverPath2(){
        Game.data = new int[][]{{4,2,8,2},
                                {2,8,4,8},
                                {8,2,8,4},
                                {4,8,2,8}};
        assertTrue(Game.checkIfGameOver());
    }
    
    @Test
    // This test method tests the execution path for the if statement in the checkMergeRight method.
    public void testCheckMergeRightPath1(){
        Game.data = new int[][]{{0,0,0,2},{2,2,0,0},{0,4,2,2},{2,0,2,0}};
        Game.checkMergeRight(2);
        assertArrayEquals(Game.data[2], new int[]{0, 0, 4, 4});
    }
    
    @Test
    // This test method tests the execution path for the if statement in the checkMergeLeft method.
    public void testCheckMergeLeftPath1(){
        Game.data = new int[][]{{0,0,0,2},{2,2,0,0},{0,8,2,2},{2,0,2,0}};
        Game.checkMergeLeft(2);
        assertArrayEquals(Game.data[2], new int[]{8, 4, 0, 0});
    }
    
    @Test
    // This test method tests the execution path for the if statement in the checkMergeDown method.
    public void testCheckMergeDownPath1(){
        Game.data = new int[][]{{0,0,0,2},
                                {2,2,0,0},
                                {0,8,2,2},
                                {2,0,2,0}};
        Game.checkMergeDown(2);
        assertEquals(Game.data[0][2], 0);
        assertEquals(Game.data[1][2], 0);
        assertEquals(Game.data[2][2], 0);
        assertEquals(Game.data[3][2], 4);
    }
    
    @Test
    // This test method tests the execution path for the if statement in the checkMergeUp method.
    public void testCheckMergeUpPath1(){
        Game.data = new int[][]{{0,0,0,2},
                                {2,2,2,0},
                                {0,8,2,2},
                                {2,0,0,0}};
        Game.checkMergeUp(2);
        assertEquals(Game.data[0][2], 4);
        assertEquals(Game.data[1][2], 0);
        assertEquals(Game.data[2][2], 0);
        assertEquals(Game.data[3][2], 0);
    }
    
}
