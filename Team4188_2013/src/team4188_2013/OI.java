// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package team4188_2013;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;
import team4188_2013.commands.AimFire;
import team4188_2013.commands.AutonomousCommand;
import team4188_2013.commands.Climb;
import team4188_2013.commands.DriveWithJoystick;
import team4188_2013.commands.PickupFrisbees;
import team4188_2013.commands.StartShooter;
import team4188_2013.commands.StopShooter;
import team4188_2013.commands.TiltYDegrees;
import team4188_2013.commands.TurnXDegrees;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton pilotTrigger;
    public JoystickButton pilotTop;
    public JoystickButton pilot3;
    public JoystickButton pilot4;
    public JoystickButton pilot5;
    public JoystickButton pilot6;
    public JoystickButton pilot7;
    public JoystickButton pilot8;
    public JoystickButton pilot9;
    public JoystickButton pilot10;
    public JoystickButton pilot11;
    public JoystickButton pilot12;
    public CorpsJoystick pilotStick;
    public JoystickButton copilotTrigger;
    public JoystickButton copilotTop;
    public JoystickButton copilot3;
    public JoystickButton copilot4;
    public JoystickButton copilot5;
    public JoystickButton copilot6;
    public JoystickButton copilot7;
    public JoystickButton copilot8;
    public JoystickButton copilot9;
    public JoystickButton copilot10;
    public JoystickButton copilot11;
    public JoystickButton copilot12;
    public CorpsJoystick copilotStick;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        pilotStick = new CorpsJoystick (1,4,12,RobotMap.xNegDeadZone,RobotMap.xPosDeadZone,RobotMap.xMult,1.0,RobotMap.yNegDeadZone,RobotMap.yPosDeadZone,
                RobotMap.yMult,1.0,RobotMap.zNegDeadZone,RobotMap.zPosDeadZone,RobotMap.twistMult,1.0);
        copilotStick = new CorpsJoystick(2,3,11,-5,5,2,1,-3,3,4,-1,0,0,0,0);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        copilotStick = new CorpsJoystick(2);
        
        copilot12 = new JoystickButton(copilotStick, 12);
        
        copilot11 = new JoystickButton(copilotStick, 11);
        
        copilot10 = new JoystickButton(copilotStick, 10);
        
        copilot9 = new JoystickButton(copilotStick, 9);
        
        copilot8 = new JoystickButton(copilotStick, 8);
        
        copilot7 = new JoystickButton(copilotStick, 7);
        
        copilot6 = new JoystickButton(copilotStick, 6);
        
        copilot5 = new JoystickButton(copilotStick, 5);
        
        copilot4 = new JoystickButton(copilotStick, 4);
        
        copilot3 = new JoystickButton(copilotStick, 3);
        
        copilotTop = new JoystickButton(copilotStick, 2);
        
        copilotTrigger = new JoystickButton(copilotStick, 1);
        copilotTrigger.whileHeld(new AimFire());
        pilotStick = new CorpsJoystick(1);
        
        pilot12 = new JoystickButton(pilotStick, 12);
        
        pilot11 = new JoystickButton(pilotStick, 11);
        
        pilot10 = new JoystickButton(pilotStick, 10);
        
        pilot9 = new JoystickButton(pilotStick, 9);
        
        pilot8 = new JoystickButton(pilotStick, 8);
        
        pilot7 = new JoystickButton(pilotStick, 7);
        
        pilot6 = new JoystickButton(pilotStick, 6);
        
        pilot5 = new JoystickButton(pilotStick, 5);
        
        pilot4 = new JoystickButton(pilotStick, 4);
        
        pilot3 = new JoystickButton(pilotStick, 3);
        
        pilotTop = new JoystickButton(pilotStick, 2);
        
        pilotTrigger = new JoystickButton(pilotStick, 1);
        
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("AutonomousCommand", new AutonomousCommand());
        SmartDashboard.putData("DriveWithJoystick", new DriveWithJoystick());
        SmartDashboard.putData("PickupFrisbees", new PickupFrisbees());
        SmartDashboard.putData("AimFire", new AimFire());
        SmartDashboard.putData("TurnXDegrees", new TurnXDegrees());
        SmartDashboard.putData("TiltYDegrees", new TiltYDegrees());
        SmartDashboard.putData("StartShooter", new StartShooter());
        SmartDashboard.putData("StopShooter", new StopShooter());
        SmartDashboard.putData("Climb", new Climb());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public CorpsJoystick getpilotStick() {
        return pilotStick;
    }
    public CorpsJoystick getcopilotStick() {
        return copilotStick;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
