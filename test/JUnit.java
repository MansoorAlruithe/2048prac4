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
        Game.data = new int[][]{{0,0,0,1},{1,1,1,0},{1,0,0,1},{1,0,0,0}};
        Game.tiltLeft();
        Assert.assertEquals(Game.data[0][0], 1);
        Assert.assertEquals(Game.data[0][1], 0);
        Assert.assertEquals(Game.data[0][2], 0);
        Assert.assertEquals(Game.data[0][3], 0);
        
        Assert.assertEquals(Game.data[1][0], 1);
        Assert.assertEquals(Game.data[1][1], 1);
        Assert.assertEquals(Game.data[1][2], 1);
        Assert.assertEquals(Game.data[1][3], 0);
        
        Assert.assertEquals(Game.data[2][0], 1);
        Assert.assertEquals(Game.data[2][1], 1);
        Assert.assertEquals(Game.data[2][2], 0);
        Assert.assertEquals(Game.data[2][3], 0);
        
        Assert.assertEquals(Game.data[3][0], 1);
        Assert.assertEquals(Game.data[3][1], 0);
        Assert.assertEquals(Game.data[3][2], 0);
        Assert.assertEquals(Game.data[3][3], 0);
        
    }
    
    
    @Test
    public void testTiltRight(){
        Game.data = new int[][]{{0,0,0,1},{1,1,1,0},{1,0,0,1},{1,0,0,0}};
        Game.tiltRight();
        Assert.assertEquals(Game.data[0][0], 0);
        Assert.assertEquals(Game.data[0][1], 0);
        Assert.assertEquals(Game.data[0][2], 0);
        Assert.assertEquals(Game.data[0][3], 1);
        
        Assert.assertEquals(Game.data[1][0], 0);
        Assert.assertEquals(Game.data[1][1], 1);
        Assert.assertEquals(Game.data[1][2], 1);
        Assert.assertEquals(Game.data[1][3], 1);
        
        Assert.assertEquals(Game.data[2][0], 0);
        Assert.assertEquals(Game.data[2][1], 0);
        Assert.assertEquals(Game.data[2][2], 1);
        Assert.assertEquals(Game.data[2][3], 1);
        
        Assert.assertEquals(Game.data[3][0], 0);
        Assert.assertEquals(Game.data[3][1], 0);
        Assert.assertEquals(Game.data[3][2], 0);
        Assert.assertEquals(Game.data[3][3], 1);
        
    }

}

