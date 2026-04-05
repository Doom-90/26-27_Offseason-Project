package org.firstinspires.ftc.teamcode.library.sensor.localization;

import com.qualcomm.hardware.sparkfun.SparkFunOTOS;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.library.internal.Pose2D;

public class OTOSSensor {
    private SparkFunOTOS sensor;

    public OTOSSensor(SparkFunOTOS sensor) {
        this.sensor = sensor;
    }

    public void configureOtos(Pose2D physicalOffset, DistanceUnit distanceUnit, AngleUnit angleUnit, double linearScalar, double angularScalar) {
        sensor.setLinearUnit(distanceUnit);
        sensor.setAngularUnit(angleUnit);

        sensor.setLinearScalar(linearScalar);
        sensor.setAngularScalar(angularScalar);

        sensor.calibrateImu();
        sensor.resetTracking();
        sensor.setOffset(physicalOffset.toSparkFunPose2D());

    }

    public void resetPosition() {
        setPosition(new Pose2D(0, 0, 0));

    }

    public Pose2D getPosition() {
        return new Pose2D(sensor.getPosition());

    }

    public void setPosition(Pose2D position) {
        sensor.setPosition(position.toSparkFunPose2D());
        getPosition();

    }
}
