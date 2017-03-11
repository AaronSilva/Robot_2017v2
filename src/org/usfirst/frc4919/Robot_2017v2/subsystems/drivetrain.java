// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4919.Robot_2017v2.subsystems;

import org.usfirst.frc4919.Robot_2017v2.commands.DriveJoystick;
import org.usfirst.frc4919.Robot_2017v2.Robot;
import org.usfirst.frc4919.Robot_2017v2.RobotMap;
import org.usfirst.frc4919.Robot_2017v2.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class drivetrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController right = RobotMap.drivetrainRight;
    private final SpeedController left = RobotMap.drivetrainLeft;
    private final RobotDrive robotDrive21 = RobotMap.drivetrainRobotDrive21;
    //private final Relay rightmotorrelay = RobotMap.drivetrainRightmotorrelay;
    //private final Relay leftmotorrelay = RobotMap.drivetrainLeftmotorrelay;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    	setDefaultCommand(new DriveJoystick());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
    }    // setDefaultCommand(new MySpecialCommand());
    	
    public void takeJoystickInputs(Joystick joystick) {
      	robotDrive21.arcadeDrive(joystick);
    }
    public void moveForward() {
    	robotDrive21.arcadeDrive(1.0, 0);
    }
    public void moveBackwards() {
    	robotDrive21.arcadeDrive(-1.0, 0);
    }	
    public void stop() {
       	robotDrive21.drive(0, 0);   
    }
}

   

