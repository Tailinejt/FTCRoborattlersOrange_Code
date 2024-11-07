package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.util.ElapsedTime;

public class PIDController {

    double integralsum = 0;
    double Kp = 0;
    double Ki = 0;
    double Kd = 0;
    double lastError =0;
    double lastTime = 0;
    private double output;
    public double setPoint = 0.0;
    ElapsedTime timer = new ElapsedTime();

    public PIDController(double Kp, double Ki, double Kd) {
        this.Kp = Kp;
        this.Ki = Ki;
        this.Kd = Kd;
    }

    public double getOutput() {
        return output;
    }

    public void update(double state){
        double error = setPoint - state;

        double currentTime = timer.seconds();
        double deltaTime = currentTime - lastTime;
        lastTime = currentTime;

        integralsum += error * deltaTime;
        double derivative = (error - lastError) / deltaTime;
        lastError = error;

        timer.reset();

        output = (error * Kp) + (derivative * Kd) + (integralsum * Ki);
    }

}
