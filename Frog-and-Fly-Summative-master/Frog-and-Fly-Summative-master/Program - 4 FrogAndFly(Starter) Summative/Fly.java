import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Have the fly count how many Food object it eats (2 marks)
 * Every time the fly eats all 10 Food objects, add 10 more Food
 * objects to the world and continue playing. (3 marks)
 * 
 */
public class Fly extends Creature
{
    public Fly()
    {
        /*
         * modify this code to make the fly faces any random initial direction
         */
        setRotation( 90 );
    }
    
    public void act() 
    {
        //To set the speed...
        
        //Call the checkKeys method
        checkForKeys();
        //Call the checkFood method
        checkForFood();
        
    }
    
    /**
     * checkKeys will allow the Fly to complete actions (turns) based on keyboard presses
     * 
     * @param None There are no parameters
     * @return Nothing is returned
     */
    /*
     * Make the fly turn left or right 5 degrees when
     * the left or right arrow key is pressed. 
     */
    private void checkForKeys()
    {
        // if the user presses the left arrow key...
        if(Greenfoot.isKeyDown("left") == true) 
        {
            //turns the Fly -5 degrees
            turn(-5); 
        } 
        // if the user presses the right arrow key...
        else if(Greenfoot.isKeyDown ("right") == true)
        {
            // turns the Fly 5 degrees
            turn(5);
        }
        else if(Greenfoot.isKeyDown ("up") == true)
        {
            //Moves 4 pixles in the current direction
            move(4);
        }
        
    }
    
    /**
     * checkFood will allow the Fly to eat the food(removing it from the world) present in the world
     *      
     * @param None There are no parameters
     * @return Nothing is returned
     */
      
    /*
     * If the fly touches a Food object, remove the Food object
     * from the world. 
     */
    
    private void checkForFood()
    {
        if(isTouching(Food.class) == true)
        {
            //Eat the Food(i.e. remove the Food from the world)
            removeTouching(Food.class);
            //call the method update from the KittyWorld class
            ( (Beach)getWorld() ).update();
        }
    }
}
