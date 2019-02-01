package frc.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.PIDOutput;



public class PIDout implements PIDOutput{
    Robot robot;
    public double outputSkew;

    public PIDout(Robot r){
        robot = r;
    }
    public void pidWrite(double output){
    outputSkew = output;
    //robot.m_robotDrive.driveCartesian(robot.JoyX, robot.JoyY,output, 0.0);  
      
    }
}

