package net.irext.webapi.model;

/**
 * Filename:       ACParameters.java
 * Revised:        Date: 2019-02-14
 * Revision:       Revision: 1.0
 * <p>
 * Description:    AC parameters entity
 * <p>
 * Revision log:
 * 2018-12-29: created by strawmanbobi
 */
public class ACParameters {
    private int tempMin;
    private int tempMax;
    private int [] supportedModes;
    private int []supportedWindSpeed;
    private int []supportedSwing;
    private int []supportedWindDirections;

    /**
     * Constructs an ACParameters object with specified parameters.
     *
     * @param tempMin the minimum temperature
     * @param tempMax the maximum temperature
     * @param supportedModes array of supported modes
     * @param supportedWindSpeed array of supported wind speeds
     * @param supportedSwing array of supported swing modes
     * @param supportedWindDirections array of supported wind directions
     */
    public ACParameters(int tempMin, int tempMax, int[] supportedModes,
                        int[] supportedWindSpeed,
                        int[] supportedSwing, int[] supportedWindDirections) {
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.supportedModes = supportedModes;
        this.supportedWindSpeed = supportedWindSpeed;
        this.supportedSwing = supportedSwing;
        this.supportedWindDirections = supportedWindDirections;
    }

    /**
     * Default constructor for ACParameters.
     */
    public ACParameters() {

    }

    /**
     * Gets the minimum temperature.
     *
     * @return the minimum temperature
     */
    public int getTempMin() {
        return tempMin;
    }

    /**
     * Sets the minimum temperature.
     *
     * @param tempMin the minimum temperature to set
     */
    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    /**
     * Gets the maximum temperature.
     *
     * @return the maximum temperature
     */
    public int getTempMax() {
        return tempMax;
    }

    /**
     * Sets the maximum temperature.
     *
     * @param tempMax the maximum temperature to set
     */
    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    /**
     * Gets the supported modes.
     *
     * @return array of supported modes
     */
    public int[] getSupportedModes() {
        return supportedModes;
    }

    /**
     * Sets the supported modes.
     *
     * @param supportedModes array of supported modes to set
     */
    public void setSupportedModes(int[] supportedModes) {
        this.supportedModes = supportedModes;
    }

    /**
     * Gets the supported wind speed settings.
     *
     * @return array of supported wind speeds
     */
    public int[] getSupportedWindSpeed() {
        return supportedWindSpeed;
    }

    /**
     * Sets the supported wind speed settings.
     *
     * @param supportedWindSpeed array of supported wind speeds to set
     */
    public void setSupportedWindSpeed(int[] supportedWindSpeed) {
        this.supportedWindSpeed = supportedWindSpeed;
    }

    /**
     * Gets the supported swing modes.
     *
     * @return array of supported swing modes
     */
    public int[] getSupportedSwing() {
        return supportedSwing;
    }

    /**
     * Sets the supported swing modes.
     *
     * @param supportedSwing array of supported swing modes to set
     */
    public void setSupportedSwing(int[] supportedSwing) {
        this.supportedSwing = supportedSwing;
    }

    /**
     * Gets the supported wind directions.
     *
     * @return array of supported wind directions
     */
    public int[] getSupportedWindDirections() {
        return supportedWindDirections;
    }

    /**
     * Sets the supported wind directions.
     *
     * @param supportedWindDirections array of supported wind directions to set
     */
    public void setSupportedWindDirections(int[] supportedWindDirections) {
        this.supportedWindDirections = supportedWindDirections;
    }
}