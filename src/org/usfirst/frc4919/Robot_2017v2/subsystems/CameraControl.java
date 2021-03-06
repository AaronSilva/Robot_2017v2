// RobotBuilder Version: 2.0

package org.usfirst.frc4919.Robot_2017v2.subsystems;

import org.usfirst.frc4919.Robot_2017v2.Robot;
import org.usfirst.frc4919.Robot_2017v2.RobotMap;
import org.usfirst.frc4919.Robot_2017v2.commands.*;
import edu.wpi.first.wpilibj.Servo;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class CameraControl extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Servo cameraTurner = RobotMap.cameraControlCameraTurner;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
//    	Robot.cameraControl.cameraTurner.set(0.0);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new CameraTurner());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
       
    }
    public void swapPosition () {
    	    	
    	Double variable = Robot.cameraControl.cameraTurner.getPosition();

    	if (variable <= 0.5) {
    		Robot.cameraControl.cameraTurner.set(1.0);
	}
    	else {
    		Robot.cameraControl.cameraTurner.set(0.1);
	  }
    }
}

