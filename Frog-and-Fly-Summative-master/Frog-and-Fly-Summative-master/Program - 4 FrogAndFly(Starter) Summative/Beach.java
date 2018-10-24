import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
public class Beach extends World
{
    //create a Scoreboard variable that we will store a Scoreboard in later
    private Scoreboard score;
    
    public Beach()
    {  
        
        super(800, 600, 1); 
        // add 10 Food objects to the world (NOTE: YOU SHOULD BE CALLING A METHOD FROM THIS CLASS TO 
        // DO THIS!)
        addFood(10);      
        // add a Fly object at a random position somewhere in the world
        addFly();
        // add a Frog object at the center of the world 
        addFrog();
       
        //Add a scoreboard object to the world in the top left hand corner.
        //Make sure to store this as an instance variable so you have access to it later.
        score = new Scoreboard();
        addObject(score,75,25);
    }
    
    public void act()
    {
        if(getObjects(Food.class).size() == 0)
        {
            addFood(10);
        }
    }
    
    /**
     * Adds n Food objects to the world
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(), x, y);
        }
    }
    
    /**
     * Adds a Fly object in a random location within the world
     */
    public void addFly()
    {
        addObject(new Fly(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
    }
    
    /**
     * Adds a Frog Object in a random location within the world
     */
    public void addFrog()
    {
        addObject(new Frog(), getWidth()/2, getHeight()/2);
    }
    
        public void update()
    {
        score.addToScore();
        
    }
}
