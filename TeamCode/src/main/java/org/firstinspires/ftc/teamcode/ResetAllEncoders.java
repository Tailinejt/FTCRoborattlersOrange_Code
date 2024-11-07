package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import java.io.File;
import java.io.IOException;
import java.util.List;

@TeleOp
public class ResetAllEncoders extends LinearOpMode {

    @Override
    public void runOpMode() {
        List<DcMotor> motors = hardwareMap.getAll(DcMotor.class);

        waitForStart();

        for (DcMotor motor : motors) {
            motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        }

    }
}