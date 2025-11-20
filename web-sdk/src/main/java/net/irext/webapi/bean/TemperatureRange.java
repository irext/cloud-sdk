package net.irext.webapi.bean;

/**
 * Filename:       TemperatureRange.java
 * Revised:        Date: 2017-03-28
 * Revision:       Revision: 1.0
 * <p>
 * Description:    Temperature range for air-conditioner
 * <p>
 * Revision log:
 * 2017-03-28: created by strawmanbobi
 */
public class TemperatureRange {

    private static final String TAG = TemperatureRange.class.getSimpleName();

    private int tempMin;
    private int tempMax;

    /**
     * Default constructor for TemperatureRange.
     */
    public TemperatureRange() {
    }

    /**
     * Constructs a TemperatureRange with the specified minimum and maximum temperatures.
     *
     * @param tempMin the minimum temperature
     * @param tempMax the maximum temperature
     */
    public TemperatureRange(int tempMin, int tempMax) {
        this.tempMin = tempMin;
        this.tempMax = tempMax;
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
}