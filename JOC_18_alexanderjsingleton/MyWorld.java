import greenfoot.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        int direction = Greenfoot.getRandomNumber(360);
        addObject (new Ball(direction), 300, 200);
    }
    /**
     * Check for mouse clicks
     */
    public void act()
    {
        if (mouse
}
