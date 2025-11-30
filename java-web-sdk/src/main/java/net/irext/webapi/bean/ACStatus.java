package net.irext.webapi.bean;

/**
 * Filename:       ACStatus.java
 * Revised:        Date: 2017-03-28
 * Revision:       Revision: 1.0
 * <p>
 * Description:    Status descriptor for air-conditioner
 * <p>
 * Revision log:
 * 2017-03-28: created by strawmanbobi
 */
public class ACStatus {

    private static final String TAG = ACStatus.class.getSimpleName();

    private int acPower;
    private int acTemp;
    private int acMode;
    private int acWindDir;
    private int acWindSpeed;
    private int acDisplay;
    private int acSleep;
    private int acTimer;

    /**
     * Default constructor for ACStatus.
     */
    public ACStatus() {
    }

    /**
     * Constructs an ACStatus with the specified parameters.
     *
     * @param acPower the power status
     * @param acMode the mode setting
     * @param acTemp the temperature setting
     * @param acWindSpeed the wind speed setting
     * @param acWindDir the wind direction setting
     * @param acDisplay the display setting
     * @param acSleep the sleep mode setting
     * @param acTimer the timer setting
     */
    public ACStatus(int acPower, int acMode, int acTemp, int acWindSpeed, int acWindDir,
                    int acDisplay, int acSleep, int acTimer) {
        this.acPower = acPower;
        this.acTemp = acTemp;
        this.acMode = acMode;
        this.acWindDir = acWindDir;
        this.acWindSpeed = acWindSpeed;
        this.acDisplay = acDisplay;
        this.acSleep = acSleep;
        this.acTimer = acTimer;
    }

    /**
     * Gets the air conditioner power status.
     *
     * @return the power status
     */
    public int getAcPower() {
        return acPower;
    }

    /**
     * Sets the air conditioner power status.
     *
     * @param acPower the power status to set
     */
    public void setAcPower(int acPower) {
        this.acPower = acPower;
    }

    /**
     * Gets the air conditioner temperature setting.
     *
     * @return the temperature setting
     */
    public int getAcTemp() {
        return acTemp;
    }

    /**
     * Sets the air conditioner temperature setting.
     *
     * @param acTemp the temperature setting to set
     */
    public void setAcTemp(int acTemp) {
        this.acTemp = acTemp;
    }

    /**
     * Gets the air conditioner mode setting.
     *
     * @return the mode setting
     */
    public int getAcMode() {
        return acMode;
    }

    /**
     * Sets the air conditioner mode setting.
     *
     * @param acMode the mode setting to set
     */
    public void setAcMode(int acMode) {
        this.acMode = acMode;
    }

    /**
     * Gets the air conditioner wind direction setting.
     *
     * @return the wind direction setting
     */
    public int getAcWindDir() {
        return acWindDir;
    }

    /**
     * Sets the air conditioner wind direction setting.
     *
     * @param acWindDir the wind direction setting to set
     */
    public void setAcWindDir(int acWindDir) {
        this.acWindDir = acWindDir;
    }

    /**
     * Gets the air conditioner wind speed setting.
     *
     * @return the wind speed setting
     */
    public int getAcWindSpeed() {
        return acWindSpeed;
    }

    /**
     * Sets the air conditioner wind speed setting.
     *
     * @param acWindSpeed the wind speed setting to set
     */
    public void setAcWindSpeed(int acWindSpeed) {
        this.acWindSpeed = acWindSpeed;
    }

    /**
     * Gets the air conditioner display setting.
     *
     * @return the display setting
     */
    public int getAcDisplay() {
        return acDisplay;
    }

    /**
     * Sets the air conditioner display setting.
     *
     * @param acDisplay the display setting to set
     */
    public void setAcDisplay(int acDisplay) {
        this.acDisplay = acDisplay;
    }

    /**
     * Gets the air conditioner sleep mode setting.
     *
     * @return the sleep mode setting
     */
    public int getAcSleep() {
        return acSleep;
    }

    /**
     * Sets the air conditioner sleep mode setting.
     *
     * @param acSleep the sleep mode setting to set
     */
    public void setAcSleep(int acSleep) {
        this.acSleep = acSleep;
    }

    /**
     * Gets the air conditioner timer setting.
     *
     * @return the timer setting
     */
    public int getAcTimer() {
        return acTimer;
    }

    /**
     * Sets the air conditioner timer setting.
     *
     * @param acTimer the timer setting to set
     */
    public void setAcTimer(int acTimer) {
        this.acTimer = acTimer;
    }
}