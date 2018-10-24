import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    private int points;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);
    
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }
    
        public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        if(points < 100) {
            img.drawString("Score: " + points, 5,25); 
        } else {
            img.drawString("You win!!!", 5,25);
            Greenfoot.stop();
        }        
    } 
}
