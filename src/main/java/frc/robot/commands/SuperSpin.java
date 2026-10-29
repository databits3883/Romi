package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase; 

public class SuperSpin extends CommandBase {

    private final Drivetrain m_drive;
    private final double m_speed;
    public SuperSpin(double speed, Drivetrain drive) {
        m_speed = speed;
        m_drive = drive;
        addRequirements(drive);
    } 

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void execute() {
        m_drive.arcadeDrive(0, m_speed);
    }
    
    @Override
    public void end(boolean interrupted) {
        m_drive.arcadeDrive(0, 0);
    }
    


}
