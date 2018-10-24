import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Food extends Actor
{
    
    public Food()
    {
        /*
         * There are 5 different fruit images available to this scenario.
         * 
         * apple1.png
         * bananas.png
         * cherries.png
         * grapes.png
         * strawberry.png 
         * 
         * Modify this code so that the Food object will have the
         * one of the FIVE images assigned to it (instead of the one of three it currently uses) 
         */ 

        int foodType = Greenfoot.getRandomNumber(5);
        if( foodType == 0 ) {
            setImage("apple1.png");
        } 
        else if( foodType == 1 ) 
        {
            setImage("bananas.png");
        } 
        else if( foodType == 2 ) 
        {
            setImage("cherries.png");
        }
        else if( foodType == 3 )
        {
            setImage("grapes.png");
        }
        else
        {
            setImage("strawberry.png");
        }
        
    }   
}
