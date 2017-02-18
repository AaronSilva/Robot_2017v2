// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4919.Robot_2017v2;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Servo cameraControlCameraTurner;
    public static Compressor gearBoxGateCompressor1;
    public static DoubleSolenoid gearBoxGateGearBoxGateSolenoid1;
    public static SpeedController drivetrainRight;
    public static SpeedController drivetrainLeft;
    public static RobotDrive drivetrainRobotDrive21;
    public static Relay drivetrainRightmotorrelay;
    public static Relay drivetrainLeftmotorrelay;
    public static SpeedController climbingSubsystemWinch;
    public static DoubleSolenoid gearPushGearPushSolenoid1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        cameraControlCameraTurner = new Servo(3);
        LiveWindow.addActuator("Camera Control", "Camera Turner", cameraControlCameraTurner);
        
        gearBoxGateCompressor1 = new Compressor(0);
        
        
        gearBoxGateGearBoxGateSolenoid1 = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("Gear Box Gate", "Gear Box Gate Solenoid 1", gearBoxGateGearBoxGateSolenoid1);
        
        drivetrainRight = new Talon(1);
        LiveWindow.addActuator("drive train", "Right", (Talon) drivetrainRight);
        
        drivetrainLeft = new Talon(0);
        LiveWindow.addActuator("drive train", "Left", (Talon) drivetrainLeft);
        
        drivetrainRobotDrive21 = new RobotDrive(drivetrainLeft, drivetrainRight);
        
        drivetrainRobotDrive21.setSafetyEnabled(true);
        drivetrainRobotDrive21.setExpiration(0.1);
        drivetrainRobotDrive21.setSensitivity(0.5);
        drivetrainRobotDrive21.setMaxOutput(1.0);

        drivetrainRightmotorrelay = new Relay(1);
        LiveWindow.addActuator("drive train", "Right motor relay", drivetrainRightmotorrelay);
        
        drivetrainLeftmotorrelay = new Relay(0);
        LiveWindow.addActuator("drive train", "Left motor relay", drivetrainLeftmotorrelay);
        
        climbingSubsystemWinch = new Talon(2);
        LiveWindow.addActuator("Climbing Subsystem", "Winch", (Talon) climbingSubsystemWinch);
        
        gearPushGearPushSolenoid1 = new DoubleSolenoid(0, 2, 3);
        LiveWindow.addActuator("Gear Push", "Gear Push Solenoid 1", gearPushGearPushSolenoid1);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
