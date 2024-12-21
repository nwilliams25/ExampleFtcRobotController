package org.firstinspires.ftc.teamcode;

import androidx.annotation.NonNull;

import com.acmerobotics.dashboard.config.Config;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcontroller.external.samples.RobotHardware;

@Config
public class RobotConfig {
    public HardwareMap hMap;

    public MotorEx frontLeftMotor = null;
    public MotorEx frontRightMotor = null;
    public MotorEx backLeftMotor = null;
    public MotorEx backRightMotor = null;

    public void init(@NonNull HardwareMap hardwareMap) {
        this.hMap = hardwareMap;

        frontLeftMotor = new MotorEx(hMap, "DriveFl");
        frontRightMotor = new MotorEx(hMap, "DriveFr");
        backLeftMotor = new MotorEx(hMap, "DriveBl");
        backRightMotor = new MotorEx(hMap, "DriveBr");
    }
}
