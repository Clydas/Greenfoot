import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        populate();
    }
    public void populate()
    {
        addObject (new Worm());
        addObject (new Worm());
        addObject (new Worm());
        addObject (new Worm());
        addObject (new Worm());        
        addObject (new Crab());
    }
    public void addObject(Actor actor) 
    {
        addObject(actor, 
            10 + Greenfoot.getRandomNumber(540), 
            10 + Greenfoot.getRandomNumber(540));
    }
}