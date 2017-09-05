package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        flip();
        mob();
        pickBeeper();
        turnRight();
        mob();
        pickBeeper();
        turnLeft();
        mob();
        pickBeeper();
        turnLeft();
        mob();
        pickBeeper();
        turnLeft();
        superMob();
        
        
    }
   
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void mob() {
        move();
        move();
        move();
        
    }
  

    public void mob() {
        move();
        move();
        move();
        
    }
    public void superMob() {
        move();
        move();
        move();
        move();
        move();
    }
      public void mob2() {
        move();
        move();
        
        
    }
      public void flip() {
        turnLeft();
        turnLeft();
        
    }
    
}

