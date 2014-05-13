/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mans
 */
public class JUnit {
    
    public JUnit() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testTiltLeft(){
        Game.data = new int[][]{{0,0,0,2},{2,2,2,0},{2,0,0,2},{2,0,0,0}};
        Game.tiltLeft();
        Assert.assertEquals(Game.data[0][0], 2);
        Assert.assertEquals(Game.data[0][1], 0);
        Assert.assertEquals(Game.data[0][2], 0);
        Assert.assertEquals(Game.data[0][3], 0);
        
        Assert.assertEquals(Game.data[1][0], 4);
        Assert.assertEquals(Game.data[1][1], 2);
        Assert.assertEquals(Game.data[1][2], 0);
        Assert.assertEquals(Game.data[1][3], 0);
        
        Assert.assertEquals(Game.data[2][0], 4);
        Assert.assertEquals(Game.data[2][1], 0);
        Assert.assertEquals(Game.data[2][2], 0);
        Assert.assertEquals(Game.data[2][3], 0);
        
        Assert.assertEquals(Game.data[3][0], 2);
        Assert.assertEquals(Game.data[3][1], 0);
        Assert.assertEquals(Game.data[3][2], 0);
        Assert.assertEquals(Game.data[3][3], 0);
        
    }
    
    
    @Test
    public void testTiltRight(){
        Game.data = new int[][]{{0,0,0,2},{2,2,2,0},{2,0,0,2},{2,0,0,0}};
        Game.tiltRight();
        Assert.assertEquals(Game.data[0][0], 0);
        Assert.assertEquals(Game.data[0][1], 0);
        Assert.assertEquals(Game.data[0][2], 0);
        Assert.assertEquals(Game.data[0][3], 2);
        
        Assert.assertEquals(Game.data[1][0], 0);
        Assert.assertEquals(Game.data[1][1], 0);
        Assert.assertEquals(Game.data[1][2], 2);
        Assert.assertEquals(Game.data[1][3], 4);
        
        Assert.assertEquals(Game.data[2][0], 0);
        Assert.assertEquals(Game.data[2][1], 0);
        Assert.assertEquals(Game.data[2][2], 0);
        Assert.assertEquals(Game.data[2][3], 4);
        
        Assert.assertEquals(Game.data[3][0], 0);
        Assert.assertEquals(Game.data[3][1], 0);
        Assert.assertEquals(Game.data[3][2], 0);
        Assert.assertEquals(Game.data[3][3], 2);
        
    }
    
    @Test
    public void testTiltUp(){
        Game.data = new int[][]{{0,0,0,2},
                                {2,0,0,0},
                                {2,0,0,2},
                                {0,0,0,0}};
        Game.tiltUp();
        Assert.assertEquals(Game.data[0][0], 4);
        Assert.assertEquals(Game.data[0][1], 0);
        Assert.assertEquals(Game.data[0][2], 0);
        Assert.assertEquals(Game.data[0][3], 4);
        
        Assert.assertEquals(Game.data[1][0], 0);
        Assert.assertEquals(Game.data[1][1], 0);
        Assert.assertEquals(Game.data[1][2], 0);
        Assert.assertEquals(Game.data[1][3], 0);
        
        Assert.assertEquals(Game.data[2][0], 0);
        Assert.assertEquals(Game.data[2][1], 0);
        Assert.assertEquals(Game.data[2][2], 0);
        Assert.assertEquals(Game.data[2][3], 0);
        
        Assert.assertEquals(Game.data[3][0], 0);
        Assert.assertEquals(Game.data[3][1], 0);
        Assert.assertEquals(Game.data[3][2], 0);
        Assert.assertEquals(Game.data[3][3], 0);
        
    }
    
    @Test
    public void testTiltDown(){
        Game.data = new int[][]{{0,0,0,2},
                                {2,0,0,0},
                                {2,0,0,2},
                                {0,0,0,0}};
        Game.tiltDown();
        Assert.assertEquals(Game.data[0][0], 0);
        Assert.assertEquals(Game.data[0][1], 0);
        Assert.assertEquals(Game.data[0][2], 0);
        Assert.assertEquals(Game.data[0][3], 0);
        
        Assert.assertEquals(Game.data[1][0], 0);
        Assert.assertEquals(Game.data[1][1], 0);
        Assert.assertEquals(Game.data[1][2], 0);
        Assert.assertEquals(Game.data[1][3], 0);
        
        Assert.assertEquals(Game.data[2][0], 0);
        Assert.assertEquals(Game.data[2][1], 0);
        Assert.assertEquals(Game.data[2][2], 0);
        Assert.assertEquals(Game.data[2][3], 0);
        
        Assert.assertEquals(Game.data[3][0], 4);
        Assert.assertEquals(Game.data[3][1], 0);
        Assert.assertEquals(Game.data[3][2], 0);
        Assert.assertEquals(Game.data[3][3], 4);
        
    }

    @Test
    public void testCheckIfGameOver(){
        Game.data = new int[][]{{0,0,0,1},
                                {1,1,1,0},
                                {1,0,0,1},
                                {1,0,0,0}};
        boolean gameOver = Game.checkIfGameOver();
        Assert.assertFalse(gameOver);
        
        Game.data = new int[][]{{2,4,8,16},
                                {4,2,32,8},
                                {2,4,8,16},
                                {4,2,32,8}};
        gameOver = Game.checkIfGameOver();
        Assert.assertTrue(gameOver);
    }
    
     @Test
    public void testUserScore(){
        Game.data = new int[][]{{2,0,0,2},
                                {4,4,0,0},
                                {0,0,0,0},
                                {0,0,0,0}};
        Game.tiltLeft();
        Assert.assertEquals(Game.score, 12);
    }
}

