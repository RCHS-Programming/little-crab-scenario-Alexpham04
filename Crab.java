import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{   
    public void act()
    {
        
        randomTurn();
        move();
       lookforWorm();
    }
    public void move( )
    {
        move(5);
        
    }   
    
    
    /*cheack if we found a Worm 
     *if we have eat it 
     * 
     */
    public void lookforWorm()
    {
            if ( isTouching(Worm.class))
        {
            removeTouching(Worm.class);
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
            RandomTurn();
        }      
    }
}
    