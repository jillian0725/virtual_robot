package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.linear.LinearOptimizer;
@TeleOp(name="jilliantest")
public class jilliantest extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("name", "jillian");
        telemetry.update();
        waitForStart();
        while (opModeIsActive()) {
        }
    }
}


