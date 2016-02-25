
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kangh4484
 */
public class quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       City A = new City();
       Robot a = new Robot (A, 4, 0, Direction.EAST);
       new Wall (A,4,2,Direction.WEST);
       new Wall (A,4,2,Direction.NORTH);
       new Wall (A,3,3,Direction.WEST);
       new Wall (A,3,3,Direction.NORTH);
       new Wall (A,2,4,Direction.WEST);
       new Wall (A,2,4,Direction.NORTH);
       new Wall (A,2,5,Direction.EAST);
       new Wall (A,2,5,Direction.NORTH);
       new Wall (A,3,6,Direction.EAST);
       new Wall (A,3,6,Direction.NORTH);
       new Wall (A,4,7,Direction.EAST);
       new Wall (A,4,7,Direction.NORTH);
       new Thing (A,4,1);
       new Thing (A,3,2);
       new Thing (A,2,3);
       new Thing (A,1,4);
       
       while(a.frontIsClear())
       {
           a.move();
           a.pickThing();
           
       if(!a.frontIsClear())
           {
           a.turnLeft();
           a.move();
           a.turnLeft();
           a.turnLeft();
           a.turnLeft();
           }
       
       if(a.getStreet()==1&&a.getAvenue()==4)
       { break;}
       
       }
       
       a.move();
       a.putThing();
       a.move();
       a.turnLeft();
       a.turnLeft();
       a.turnLeft();
       
       while(a.frontIsClear())
       {
           a.move();
           a.putThing();
           
           if(!a.frontIsClear())
               {
               a.turnLeft();
               a.move();
               a.turnLeft();
               a.turnLeft();
               a.turnLeft();
               }
           
           if(a.getStreet()==4&&a.getAvenue()==8)
           {break;}
        }
       
           a.turnLeft();
           a.move();
           
       }
       
    }


    

