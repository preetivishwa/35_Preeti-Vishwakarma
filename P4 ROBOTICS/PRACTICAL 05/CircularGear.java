/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulargear;

/**
 *
 * @author Admin
 */
import ch.aplu.robotsim.*;
class CircularGear
{
   CircularGear()
 {
    NxtRobot robot=new NxtRobot();
   Gear gear=new Gear();
   robot.addPart(gear);
  gear.forward(200);
  gear.setSpeed(20);
  gear.leftArc(0.2,7000);
 gear.forward(200);
  gear.leftArc(0.2,7000);
gear.forward(200);
 gear.leftArc(0.2,7000);
gear.forward(200);
    gear.leftArc(0.2,7000);
  gear.forward(200);
 robot.exit();
}
 public static void main(String args[])
{
    CircularGear  m=new  CircularGear();
    NxtContext.setStartPosition(250,200);
   NxtContext.setStartDirection(90);
  }
}       
