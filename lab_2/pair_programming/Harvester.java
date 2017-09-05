package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        
        
        //Complete this method, using the methods you create below so that all rows are harvested
        startPosition();
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
    }
    
    public void harvestTwoRows(){
        harvestOneRow();
        repositionRight();
        harvestOneRow();
        repositionLeft();
    }
    public void harvestOneRow() {
        harvestOneBeeper();
        harvestOneBeeper();
        harvestOneBeeper();
        harvestOneBeeper();
        
    }
    public void harvestOneBeeper() {
        move();
        pickBeeper();
    }
    public void repositionRight() {
        turnLeft()??
        move();
        turnLeft();
        pickBeeper();
    }
    public void repositionLeft() {
        turnRight();
        move();
        turnRight();
        pickBeeper();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void startPosition() {
        move();
        pickBeeper();
    }
      
    
       
    
    
    //your methods go below
    
    
}

