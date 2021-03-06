import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WaterWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WaterWorld extends World
{

    /**
     * Constructor for objects of class WaterWorld.
     * 
     */
    public WaterWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
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

