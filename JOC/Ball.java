import greenfoot.*;

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int imageNumber;
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ball()
    {
        setRotation(270);
        imageNumber = 0;
    }

    public Ball(int direction)
    {
        setRotation(direction);
    }

    public void act() 
    {
        move(4);
        if(atWorldEdge()) {
            turn(153);
            changeImage();
        }
    }
    /**
     * Change the image(field) of this ball
     */
    public void changeImage()
    {
        imageNumber++;
        if (imageNumber == 5) {
            imageNumber = 0;
        }
        setImage("button-" + imageNumber + ".png");
    }
    

    /**
     * Test if we are close to one of the edges of the world. Return true is we are.
     */
    public boolean atWorldEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)
            return true;
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)
            return true;
        else
            return false;
    }

}
