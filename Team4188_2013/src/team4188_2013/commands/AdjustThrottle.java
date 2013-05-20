// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package team4188_2013.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.*;
import team4188_2013.Robot;
/**
 *@author Tobore Tasker
 * Adjusts throttle while shooter is running
 * Questions? Answers? Text: 6786870685, email: etasker@mit.edu
 */
public class  AdjustThrottle extends Command {
    double throttle = 1.0;
    boolean done = false;
    boolean fullThrottle = false;
    public AdjustThrottle() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        done = false;
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        throttle = Robot.oi.copilotStick.getThrottle();
        if(throttle <= .2){
            throttle = 0;
        }
        SmartDashboard.putNumber("Throttle", throttle*100);
        SmartDashboard.putBoolean("Full Throttle", fullThrottle);
        if(throttle > .98){
            fullThrottle = true;    
        }
        else{
            fullThrottle = false;
        }
        //System.out.println("AdjustThrottle= " + throttle);
        if(Robot.shooter.isOn){
            Robot.shooter.adjustSpeed(throttle);
        }
        else{
            end();
        }
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done;
    }
    // Called once after isFinished returns true
    protected void end() {
        done = true;
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
