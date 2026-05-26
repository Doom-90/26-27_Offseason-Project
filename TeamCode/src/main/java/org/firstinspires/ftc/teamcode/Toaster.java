package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
@TeleOp(name="Basic: Linear OpMode", group="Linear OpMode")
public class Toaster extends LinearOpMode{
    private DcMotor toasterOne = null;
    private Servo bread = null;
    public void runOpMode() {
        toasterOne  = hardwareMap.get(DcMotor.class, "Toast");
        bread = hardwareMap.get(Servo.class, "butter");
        waitForStart();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            double toastTwo  = -gamepad1.left_stick_y;
            double breadTwo = gamepad1.right_stick_x;
            toasterOne.setPower(toastTwo);
            bread.setPosition(breadTwo);
        }
    }
}
