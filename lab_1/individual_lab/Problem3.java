package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void giveCarlBeeper() {
        //This method should allow karel, who is at (1, 1) to give a beeper to carl (at 1, 4)
        GoToCarl();
        GiveHimBeeper();
        ReturnToOriginalPosition();
       
    }
    
    public void pickAndMoveBeeper() {
        //This method is for carl to pick up the beeper from karel and move it two blocks north
        TakeBeeper();
        GoToNewLocation();
        DropBeeper();
        GoBack();
    }
    public void GoToCarl() {
        turnRight();
        move();
        move();
        move();
    }
    public void GiveHimBeeper() {
        putBeeper();
    }
    public void ReturnToOriginalPosition() {
        turnRight();
        turnRight();
        move();
        move();
        move();
        turnRight();
    }
     public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void TakeBeeper() {
        pickBeeper();
    }
    public void GoToNewLocation() {
        turnLeft();
        move();
        move();
    }
    public void DropBeeper() {
        putBeeper();
    }
    public void GoBack() {
        turnRight();
        turnRight();
        move();
        move();
        turnLeft();
    }
   
}