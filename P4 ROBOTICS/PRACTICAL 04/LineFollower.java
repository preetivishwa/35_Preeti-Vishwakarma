/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linefollower;

/**
 *
 * @author Admin
 */
import ch.aplu.robotsim.*;
public class LineFollower
{
  LineFollower()
  {
    LegoRobot robot=new LegoRobot();
    Gear gear=new Gear();
    LightSensor ls=new LightSensor(SensorPort.S3);
    robot.addPart(gear);
    gear.setSpeed(20);
    robot.addPart(ls);
    while(true)
    {
      int v=ls.getValue();
      if(v < 100)//black
      gear.forward();
      if(v > 300 && v < 750)  //blue
      gear.leftArc(0.05);
      if(v> 800)  //yellow
      gear.rightArc(0.05);
    }
  }
  public static void main(String args[])
  {
    new LineFollower();
    
  }
  static
  {
    RobotContext.setStartPosition(50,490);
    RobotContext.setStartDirection(-90);
    RobotContext.useBackground("sprites/road.gif");
  }
} 
