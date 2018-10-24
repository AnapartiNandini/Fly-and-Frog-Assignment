import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Creature extends Actor
{
    public boolean atEdgeOfWorld()
    {
        return getX()<5 || getY()<5 || getX()>getWorld().getWidth()-5 || getY()>getWorld().getHeight()-5;
    }   
}
