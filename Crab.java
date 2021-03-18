import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{   
    public void act()
    {
       
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
        public void checkKeyPress()
        {
            if(Greemfoot.isKeyDown("left"))
             { 
                 turn(-4);
         
            }
            if(Greenfoot.isKeyDown("right"))
            {
                turn(4);
            }
            
    
}
    