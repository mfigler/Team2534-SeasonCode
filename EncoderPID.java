package frc.robot;
import edu.wpi.first.wpilibj.PIDOutput;

public class EncoderPID implements PIDOutput{
    Robot robot;
    public double outputEncoder;

    public EncoderPID(Robot r){
        robot = r;
    }
    public void pidWrite(double output){
    outputEncoder = output;
    //robot.m_robotDrive.driveCartesian(robot.JoyX, robot.JoyY,output, 0.0);  
      
    }
}
