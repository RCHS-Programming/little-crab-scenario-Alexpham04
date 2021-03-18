import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    public void act()
    {
        turnAtEdge();
        randomTurn();
        move();
       lookforCrab();
    }
    public void move( )
    {
        move(5);
        
    }   
    
    
    /*cheack if we found a Worm 
     *if we have eat it 
     * 
     */
    public void lookforCrab()
    {
            if ( isTouching(Crab.class))
        {
            removeTouching(Crab.class);
              move(5);
        }
    }
    
    /*make the crab randomly turn left or right 
     * 
     */
    public void randomTurn()
    {
        if( Greenfoot.getRandomNumber(100)<10)
        {
            turn( Greenfoot.getRandomNumber(91)-45);
   
            
        }
    }
    /* do what the crab wants 
     * 
     */
    public void turnAtEdge()
    {
        if (isAtEdge())
        {
            turn(17);
        }      
    }
    
}
