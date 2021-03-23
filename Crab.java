import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{   
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten;
    /*  
     * Create a crab and initialize its two images.
     */
        public Crab()
        {
            image1 = new GreenfootImage ("crab.png")
           ;image2 = new GreenfootImage ("crab2.png");
           setImage (image1);
           wormsEaten=0;
        }         // methods ommitted
        
      

    public void act()
    {
       if (getImage() == image1)
       {
           setImage (image2);
        }
        else
        {
            setImage (image1);
        }
        
        checkKeyPress();
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
              Greenfoot.playSound("slurp.wav");
              
             wormsEaten = wormsEaten +1;
             if( wormsEaten ==8) 
             {
                 
            
              
              
              
        }
    }
        public void checkKeyPress()
        {
            if(Greenfoot.isKeyDown("left"))
             { 
                 turn(-4);
         
            
            if(Greenfoot.isKeyDown("right"))
            {
                turn(4);
            }
            
    
     } 
    }
}
    