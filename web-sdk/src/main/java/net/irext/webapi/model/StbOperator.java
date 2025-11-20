package net.irext.webapi.model;

/**
 * Filename:       StbOperator.java
 * Revised:        Date: 2017-03-28
 * Revision:       Revision: 1.0
 * <p>
 * Description:    StbOperator bean
 * <p>
 * Revision log:
 * 2017-03-28: created by strawmanbobi
 */
public class StbOperator {

    private int id;
    private String operatorId;
    private String operatorName;
    private String cityCode;
    private String cityName;
    private int status;
    private String operatorNameTw;

    /**
     * Constructs a StbOperator with the specified parameters.
     *
     * @param id the ID
     * @param operatorId the operator ID
     * @param operatorName the operator name
     * @param cityCode the city code
     * @param cityName the city name
     * @param status the status
     * @param operatorNameTw the operator name in Traditional Chinese
     */
    public StbOperator(int id, String operatorId, String operatorName,
                       String cityCode, String cityName, int status, String operatorNameTw) {
        this.id = id;
        this.operatorId = operatorId;
        this.operatorName = operatorName;
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.status = status;
        this.operatorNameTw = operatorNameTw;
    }

    /**
     * Default constructor for StbOperator.
     */
    public StbOperator() {

    }

    /**
     * Gets the ID.
     *
     * @return the ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID.
     *
     * @param id the ID to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the operator ID.
     *
     * @return the operator ID
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * Sets the operator ID.
     *
     * @param operatorId the operator ID to set
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * Gets the operator name.
     *
     * @return the operator name
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Sets the operator name.
     *
     * @param operatorName the operator name to set
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    /**
     * Gets the city code.
     *
     * @return the city code
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the city code.
     *
     * @param cityCode the city code to set
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * Gets the city name.
     *
     * @return the city name
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the city name.
     *
     * @param cityName the city name to set
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
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
     * Gets the operator name in Traditional Chinese.
     *
     * @return the operator name in Traditional Chinese
     */
    public String getOperatorNameTw() {
        return operatorNameTw;
    }

    /**
     * Sets the operator name in Traditional Chinese.
     *
     * @param operatorNameTw the operator name in Traditional Chinese to set
     */
    public void setOperatorNameTw(String operatorNameTw) {
        this.operatorNameTw = operatorNameTw;
    }
}