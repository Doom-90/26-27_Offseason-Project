package org.firstinspires.ftc.teamcode.examples.robot;

import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.hardware.sparkfun.SparkFunOTOS;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.library.actuator.drivetrain.MechanumDrive;
import org.firstinspires.ftc.teamcode.library.sensor.localization.Limelight;
import org.firstinspires.ftc.teamcode.library.sensor.localization.OTOSSensor;

public class ProgrammingChassis {
    private MechanumDrive drivetrain;
    private OTOSSensor otosSensor;
    private Limelight limelight;

    public ProgrammingChassis(MechanumDrive drivetrain, OTOSSensor otosSensor, Limelight limelight) {
        this.drivetrain = drivetrain;
        this.otosSensor = otosSensor;
        this.limelight = limelight;
        this.otosSensor.configureOtos(Constants.getPhysicalOffset(), DistanceUnit.INCH, AngleUnit.DEGREES, 1, 1); //default
    }

    public MechanumDrive getDrivetrain(){
        return drivetrain;
    }

    public OTOSSensor getOtosSensor() {
        return otosSensor;
    }


    /**
     * this is for building the robot without having to copypaste this around everywhere
     * use like:
     * robot = StateRobot.build() in init
     * if new parts are added then change this
     *
     * @return the robot
     */
    public static ProgrammingChassis build(HardwareMap hardwareMap) {
        return new ProgrammingChassis(
                new MechanumDrive(
                        hardwareMap.get(DcMotor.class, HardwareName.FRONT_LEFT_MOTOR.getName()),
                        hardwareMap.get(DcMotor.class, HardwareName.FRONT_RIGHT_MOTOR.getName()),
                        hardwareMap.get(DcMotor.class, HardwareName.BACK_LEFT_MOTOR.getName()),
                        hardwareMap.get(DcMotor.class, HardwareName.BACK_RIGHT_MOTOR.getName())
                ),
                new OTOSSensor(hardwareMap.get(SparkFunOTOS.class, HardwareName.ODOMETRY_SENSOR.getName())),
                new Limelight(hardwareMap.get(Limelight3A.class, HardwareName.LIMELIGHT.getName()))
        );
    }
}
