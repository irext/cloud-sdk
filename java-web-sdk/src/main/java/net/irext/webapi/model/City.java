package net.irext.webapi.model;

/**
 * Filename:       City.java
 * Revised:        Date: 2017-03-28
 * Revision:       Revision: 1.0
 * <p>
 * Description:    City bean
 * <p>
 * Revision log:
 * 2017-03-28: created by strawmanbobi
 */
public class City {

    private int id;
    private String code;
    private String name;
    private double longitude;
    private double latitude;
    private int status;
    private String nameTw;

    /**
     * Constructs a City with the specified parameters.
     *
     * @param id the city ID
     * @param code the city code
     * @param name the city name
     * @param longitude the longitude
     * @param latitude the latitude
     * @param status the status
     * @param nameTw the Traditional Chinese name
     */
    public City(int id, String code, String name, double longitude, double latitude,
                int status, String nameTw) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.status = status;
        this.nameTw = nameTw;
    }

    /**
     * Default constructor for City.
     */
    public City() {

    }

    /**
     * Gets the city ID.
     *
     * @return the city ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the city ID.
     *
     * @param id the city ID to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the city code.
     *
     * @return the city code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the city code.
     *
     * @param code the city code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets the city name.
     *
     * @return the city name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the city name.
     *
     * @param name the city name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the longitude.
     *
     * @return the longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the longitude.
     *
     * @param longitude the longitude to set
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Gets the latitude.
     *
     * @return the latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the latitude.
     *
     * @param latitude the latitude to set
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Gets the status.
     *
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the status.
     *
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Gets the Traditional Chinese name.
     *
     * @return the Traditional Chinese name
     */
    public String getNameTw() {
        return nameTw;
    }

    /**
     * Sets the Traditional Chinese name.
     *
     * @param nameTw the Traditional Chinese name to set
     */
    public void setNameTw(String nameTw) {
        this.nameTw = nameTw;
    }
}