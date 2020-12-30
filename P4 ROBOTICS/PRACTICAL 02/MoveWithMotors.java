/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movewithmotors;

/**
 *
 * @author Admin
 */
import ch.aplu.robotsim.*;
public class MoveWithMotors
{
  public  MoveWithMotors()
  {
    NxtRobot robot=new  NxtRobot();
    Motor motA=new Motor(MotorPort.A);
    Motor motB=new Motor(MotorPort.B);
    robot.addPart(motA);
    robot.addPart(motB);
    motA.forward();
    motB.forward();
    Tools.delay(2000);
    
    motA.stop();
    Tools.delay(1050);
    motA.forward();
    Tools.delay(2000);
    
    motB.stop();
    Tools.delay(1050);
    motB.forward();
    Tools.delay(2000);
    
    robot.exit();
  }
  public static void main(String args[])
  {
    new MoveWithMotors();
  }
}
