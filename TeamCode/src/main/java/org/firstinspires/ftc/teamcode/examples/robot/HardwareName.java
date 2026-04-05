package org.firstinspires.ftc.teamcode.examples.robot;

/**
 * <div style="background-color: #0CA366; color: black; border-bottom: 4px dashed black;">
 * <h1>Hardware Names</h1>
 * </div>
 * <div style="background-color: #009AD2; color: black; border-top: 4px dashed black;">
 * <h2>Overview</h2>
 * <p>This is where the names of all motors are stored.
 * It is recommended to store all of these in one place incase names need to be changed or added</p>
 * </div>
 * @author Phillip
 * @since 04/02/2026
 * @version -1.0.0 (04/02/2026)
 */
public enum HardwareName {
    FRONT_LEFT_MOTOR("lf"),
    FRONT_RIGHT_MOTOR("rf"),
    BACK_LEFT_MOTOR("lb"),
    BACK_RIGHT_MOTOR("rb"),
    ODOMETRY_SENSOR("otos"),
    LIMELIGHT("limelight"),
    IMU("imu");

    private final String name;

    HardwareName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
