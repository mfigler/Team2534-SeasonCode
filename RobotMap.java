package frc.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

public class RobotMap extends IterativeRobot {

//drive train    
public static int talonFrontRightChannel = 4;
public static int talonRearRightChannel = 3;
public static int talonFrontLeftChannel = 2;
public static int talonRearLeftChannel = 1;

//Controller
public static int xBoxControllerChannel = 0;
public static int xBoxButtonAChannel = 1;
public static int xBoxButtonBChannel = 2;
public static int xBoxButtonXChannel = 3;
public static int xBoxButtonYChannel = 4;
public static int xBoxButtonLeftChannel = 5;
public static int xBoxButtonRightChannel = 6;
public static int xBoxLeftStickXChannel = 0;
public static int xBoxLeftStickYChannel = 1;
public static int xBoxLeftTriggerChannel = 2;
public static int xBoxRightTriggerChannel = 3;
public static int xBoxRightStickXChannel = 4;

//Encoder
public static int encoderAChannel = 0;
public static int encoderBChannel = 1;

//Solenoid
public static int doubleSolenoidForwardChannel = 0;
public static int doubleSolenoidReverseChannel = 1;
}