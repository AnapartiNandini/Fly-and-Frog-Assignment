import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed;   
    
    public Frog()
    {        
        // set the Frog's speed to a random number between 4 and 8
        speed = Greenfoot.getRandomNumber(4 + 4);
    }
    
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // make the Frog move at its speed, in the direction it is facing
        walk(speed);
        //Call the checkForFLy method
        checkForFly();
        //Call the checkTheParameters method
        checkTheParameters();
    }
    
    /**
     * move allows the Frog to walk in a disoriented motion.
     * The Frog turns 35% of the time,of that 35%,50% of the time the Frog turns counterclockwise 15 degrees and the other 
     * 50% of the time it turns clockwise 15 degrees.Then the Frog  moves 4 - 8 pixles in the current direction
     * 
     * @param One There is an integer indicating the direction, so one parameter
     * @return Nothing is returned
     */
    public void walk(int direction)
    {
        /*
         * Make the frog turn off course 35% of the time.
         * It will turn left or right 15 degrees equally as often. 
         */
        //If the number generateed is less than 35(the statement will only be true)
        if(Greenfoot. getRandomNumber(100)<35)
        {
            //If the next random number generated is less than 1(the statement will be true) 
            if(Greenfoot. getRandomNumber(2)<1)
            {
                //Turn counterclockwise 15 degrees
                turn(-15);
            }
            //Otherwise...
            else
            {
                //Turn clockwise 15 degrees
                turn(15);
            }
        } 
        
        //Then move 4-8 pixles in the current direction
        move(speed);
    }
    
    /**
     * checkForFly causes the game to end if the Frog touches the Fly object
     * 
     * @param None There are no parameters
     * @return Nothing is returned
     */
    public void checkForFly()
    {
        /*
         * If the frog encounters the fly, the game ends, so
         * stop the scenario 
         */ 
        if(isTouching(Fly.class) == true)
        {
            Greenfoot.stop();
        }   
    }
    
    /**
     * checkTheParameters allows the Frog to turn 7 degrees when it hits the edge of the world
     * 
     * @param None Thare are no parameters
     * @return Nothing is returned
     */
    public void checkTheParameters()
    {
        /*
         * If the frog is near an edge of the world, make it turn
         * 7 degrees to the right. 
         * 
         * Hint: use the atEdgeOfWorld method in the Creature class.
         */
        if(atEdgeOfWorld() == true)
        {
            turn(7);
        }
    }
}
