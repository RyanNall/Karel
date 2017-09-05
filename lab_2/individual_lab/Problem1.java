package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        findBeeper();
        setFirstRow();
        setSecondRow();
        setThirdRow();
        setFourthRow();
        startPosition();
        
    }
    public void setFirstRow() {
        
        moveBeeper();
        moveBeeper();
        moveBeeper();
        repositionRight();
        
    }
    public void startPosition() {
        move();
        move();
        move();
        move();
        turnRight();
        move();
        move();
        move();
        move();
        turnLeft();
    }
    public void setSecondRow() {
        move();
        moveBeeper();
        moveBeeper();
        
        repositionLeft();
    }
    public void setThirdRow() {
        move();
        moveBeeper();
        
        repositionRight();
    }
    public void setFourthRow() {
        move();
        moveBeeper();
        
    }
    public void repositionRight() {
        putBeeper();
        turnRight();
        move();
        turnRight();
    }
    public void repositionLeft() {
        putBeeper();
        turnLeft();
        move();
        turnLeft();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
       
    }
    public void findBeeper() {
        
        move();
        move();
        move();
        move();
        turnLeft();
        move();
        move();
        move();
        turnRight();
        turnRight();
    }
    public void moveBeeper() {
        putBeeper();
        move();
        move();
    }
   
}
    
