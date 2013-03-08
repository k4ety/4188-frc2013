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
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;
import team4188_2013.commands.*;
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
    /*
     * comment out stick constructors!
     */
    double tiltAngle = 0, turnAngle = 0;
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton pilot1;
    public JoystickButton pilot2;
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
    public JoystickButton copilot1;
    public JoystickButton copilot2;
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
        copilotStick = new CorpsJoystick(2,3,11,-5,5,1,1,-1,1,1,1,0,0,0,0);
        SmartDashboard.putNumber("TurnAngle", turnAngle);
        SmartDashboard.putNumber("TiltAngle", tiltAngle);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        //copilotStick = new CorpsJoystick(2);
        
        copilot12 = new JoystickButton(copilotStick, 12);
        
        copilot11 = new JoystickButton(copilotStick, 11);
        
        copilot10 = new JoystickButton(copilotStick, 10);
        copilot10.whenPressed(new PrintPotentiometer());
        copilot9 = new JoystickButton(copilotStick, 9);
        copilot9.whenPressed(new Shoot());
        copilot8 = new JoystickButton(copilotStick, 8);
        copilot8.whenPressed(new LoadFrisbee());
        copilot7 = new JoystickButton(copilotStick, 7);
        copilot7.whileHeld(new BackUpClimb());
        copilot6 = new JoystickButton(copilotStick, 6);
        
        copilot5 = new JoystickButton(copilotStick, 5);
        
        copilot4 = new JoystickButton(copilotStick, 4);
        copilot4.whileHeld(new AutoAim());
        copilot3 = new JoystickButton(copilotStick, 3);
        copilot3.whenPressed(new Climb());
        copilot2 = new JoystickButton(copilotStick, 2);
        copilot2.whileHeld(new DriveTilHit());
        copilot1 = new JoystickButton(copilotStick, 1);
        copilot1.whenPressed(new PushFrisbee());
        //pilotStick = new CorpsJoystick(1);
        
        pilot12 = new JoystickButton(pilotStick, 12);
        pilot12.whenPressed(new FieldOrientOn());
        pilot11 = new JoystickButton(pilotStick, 11);
        pilot11.whenPressed(new FieldOrientOff());
        pilot10 = new JoystickButton(pilotStick, 10);
        pilot10.whenPressed(new ResetGyro());
        pilot9 = new JoystickButton(pilotStick, 9);
        pilot9.whenPressed(new ResetEncoders());
        pilot8 = new JoystickButton(pilotStick, 8);
        
        pilot7 = new JoystickButton(pilotStick, 7);
        
        pilot6 = new JoystickButton(pilotStick, 6);
        
        pilot5 = new JoystickButton(pilotStick, 5);
        
        pilot4 = new JoystickButton(pilotStick, 4);
        
        pilot3 = new JoystickButton(pilotStick, 3);
        
        pilot2 = new JoystickButton(pilotStick, 2);
        
        pilot1 = new JoystickButton(pilotStick, 1);
        pilot1.whenPressed(new LookDown());
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("PickupFrisbees", new PickupFrisbees());
        SmartDashboard.putData("TiltYDegrees", new TiltYDegrees(tiltAngle));
        SmartDashboard.putData("AutoAim", new AutoAim());
        SmartDashboard.putData("FieldOrientOff", new FieldOrientOff());
        SmartDashboard.putData("FieldOrientOn", new FieldOrientOn());
        SmartDashboard.putData("FrisbeePush", new FrisbeePush());
        SmartDashboard.putData("ManaulAim", new ManaulAim());
        SmartDashboard.putData("ManualDrive", new ManualDrive());
        SmartDashboard.putData("ManualServo", new ManualServo());
        SmartDashboard.putData("PanServo", new PanServo());
        SmartDashboard.putData("ResetGyro", new ResetGyro());
        SmartDashboard.putData("Shoot", new Shoot());
        SmartDashboard.putData("ShooterOff", new ShooterOff());
        SmartDashboard.putData("ShooterOn", new ShooterOn());
        SmartDashboard.putData("TurnXDegrees", new TurnXDegrees(turnAngle));
        SmartDashboard.putData("HoldShoot", new HoldShoot());
        SmartDashboard.putData("ManualTilt", new ManualTilt());
        SmartDashboard.putData("Autonomous", new Autonomous());
        SmartDashboard.putData("LookDown", new LookDown());
        SmartDashboard.putData("BackUpClimb", new BackUpClimb());
        SmartDashboard.putData("Climb", new Climb());
        SmartDashboard.putData("DriveTilHit", new DriveTilHit());
        SmartDashboard.putData("ExtendPusher", new ExtendPusher());
        SmartDashboard.putData("LoadFrisbee", new LoadFrisbee());
        SmartDashboard.putData("PrintEncoders", new PrintEncoders());
        SmartDashboard.putData("PushFrisbee", new PushFrisbee());
        SmartDashboard.putData("ResetEncoders", new ResetEncoders());
        SmartDashboard.putData("RetractPusher", new RetractPusher());
        SmartDashboard.putData("DecrementVoltage", new DecrementVoltage());
        SmartDashboard.putData("IncrementVoltage", new IncrementVoltage());
        SmartDashboard.putData("PrintPotentiometer", new PrintPotentiometer());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        copilot1.whenReleased(new RetractPusher());
        //copilot5.whenPressed(new TiltYDegrees(30.0));
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public CorpsJoystick getpilotStick() {
        return pilotStick;
    }
    public CorpsJoystick getcopilotStick() {
        return copilotStick;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public void setAngles(){
        turnAngle = SmartDashboard.getNumber("TurnAngle");
        tiltAngle = SmartDashboard.getNumber("TiltAngle");
    }
}
