import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Animal
{
    public void act()
    {
        move();
        if (canSee(Worm.class))
        eat(Worm.class);
        else if ( atWorldEdge() ) turn(15);
        
    }
}


