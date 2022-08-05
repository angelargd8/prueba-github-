import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        wait(3);
        //isBored();
        walkLeft(3);
        walkRight(3);
        if (isBored()){            
            wait(2);
            dance();
            shoutHooray();
        }
        if (isHungry()){
            eat();
        }
        if (isAlone()){
            isSleepy();
        }
        if (isSleepy()){
            sleep(2);
        }
        if (hasCompany()){
            shoutHooray();
        }
    }    
}
