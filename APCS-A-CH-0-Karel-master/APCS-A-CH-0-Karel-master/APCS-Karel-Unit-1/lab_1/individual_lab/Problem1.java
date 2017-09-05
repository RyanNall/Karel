package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        mob();
        turnLeft();
        whip();
        whip();
        turnLeft();
        mob();
        putBeeper();
        flip();
        movePut();
        mob();
        putBeeper();
        movePut();
        flip();
        mob();
        turnLeft();
        mob();
        flip();
        
        
    }
    public void movePick() {
        move();
        pickBeeper();
    }      
    public void flip() {
        turnLeft();
        turnLeft();
    }
    public void mob() {
        move();
        move();
        
    }
    public void movePut() {
        move();
        putBeeper();
    }
    public void whip() {
        movePick();
        movePick();
        flip();
        mob();
    }
        
    
   
}