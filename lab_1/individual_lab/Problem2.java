package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
       
       CircleFirstBeeper();
       CircleSecondBeeper();
       FinishFirstBeeper();
       OriginalPosition();
       
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void mobLeft() {
        move();
        move();
        turnLeft();
    }
    public void mobRight() {
        move();
        move();
        turnRight();
    }
    public void CircleFirstBeeper() {
        turnRight();
        move();
        turnLeft();
        mobLeft();
    }
     public void CircleSecondBeeper() {
        mobRight();
        mobRight();
        mobRight();
        mobRight();
        
    }
    public void FinishFirstBeeper() {
        mobLeft();
        mobLeft();
    }
    public void OriginalPosition() {
        move();
        turnLeft();
    }
        
   
}