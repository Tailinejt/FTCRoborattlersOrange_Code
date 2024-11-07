package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.List;

@TeleOp
public class EncoderReader extends LinearOpMode {

    @Override
    public void runOpMode() {
        List<DcMotor> motors = hardwareMap.getAll(DcMotor.class);

        waitForStart();

        while (opModeIsActive()) {
            for (DcMotor motor : motors) {
                telemetry.addData(motor.getDeviceName(), motor.getCurrentPosition());
            }
            telemetry.update();
        }
    }
}