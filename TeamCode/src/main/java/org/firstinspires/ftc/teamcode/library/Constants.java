package org.firstinspires.ftc.teamcode.library;

import com.acmerobotics.dashboard.config.Config;
import com.bylazar.configurables.annotations.Configurable;

/**
 * <div style="background-color: #0CA366; color: black; border-bottom: 4px dashed black;">
 * <h1>Constants</h1>
 * </div>
 * <div style="background-color: #009AD2; color: black; border-top: 4px dashed black; border-bottom: 4px dashed black;">
 * <h1>Overview</h1>
 * <p>
 * Constants are the values that remain constant throughout all programs.
 * These values are configurable via FTCDashboard or Panels, but remember to put new values into code.
 * </p>
 * </div>
 * <div style="background-color: #0CA366; color: black; border-bottom: 4px dashed black; border-top: 4px dashed black;">
 * <h2>Panels Configuration</h2>
 * <ol>
 *     <li>Connect to robot via Wi-Fi</li>
 *     <li>Go to the Panels IP (<a href="http://192.168.43.1:8001/" style="color: black">http://192.168.43.1:8001/</a>)</li>
 *     <li>Add a "Configurables" Panel</li>
 *     <li>Update values from there</li>
 *     <li>When done, update values in code; changes in configuration doesn't apply to the code on your computer</li>
 * </ol>
 * </div>
 * <div style="background-color: #009AD2; color: black; border-top: 4px dashed black;">
 * <h2>FTCDashboard Configuration</h2>
 * <p>TBD; probably similar to Panels</p>
 * </div>
 * @author Phillip
 * @author Noah
 * @since 03/15/2026
 * @version 0.1.0 (04/02/2026)
 */
@Config
@Configurable
public class Constants {
    public static double drivetrainExponentIndex = 3;
    public static double drivetrainMinimumMoveableSpeed = 0.25;
}
