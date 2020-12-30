/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

/**
 *
 * @author Admin
 */
import ch.aplu.robotsim.*;
class square
{
  square()
  {
    NxtRobot r = new NxtRobot();
    Gear g = new Gear();
    r.addPart(g);
    g.setSpeed(100);
    g.forward(1000);
    g.left(275);
    g.forward(1000);
    g.left(275);
    g.forward(1000);
    g.left(275);
    g.forward(1000);
    
    Tools.delay(2000);
    r.exit();
  }
  public static void main(String[] args)
  {
    new square();
  }
}  
            
