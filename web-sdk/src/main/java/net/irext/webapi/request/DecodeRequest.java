package net.irext.webapi.request;

import net.irext.webapi.bean.ACStatus;

/**
 * Filename:       DecodeRequest.java
 * Revised:        Date: 2017-05-16
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP decode online
 * <p>
 * Revision log:
 * 2017-05-16: created by strawmanbobi
 */
public class DecodeRequest extends BaseRequest {

    private int indexId;
    private ACStatus acStatus;
    private int keyCode;
    private int changeWindDir;
    private Integer directDecode;
    private Integer paraData;

    /**
     * Constructs a DecodeRequest with the specified parameters.
     *
     * @param indexId the index ID
     * @param acStatus the AC status
     * @param keyCode the key code
     * @param changeWindDir the change wind direction flag
     * @param directDecode the direct decode flag
     * @param paraData the parameter data
     */
    public DecodeRequest(int indexId, ACStatus acStatus, int keyCode, int changeWindDir,
                         Integer directDecode, Integer paraData) {
        this.indexId = indexId;
        this.acStatus = acStatus;
        this.keyCode = keyCode;
        this.changeWindDir = changeWindDir;
        this.directDecode = directDecode;
        this.paraData = paraData;
    }

    /**
     * Default constructor for DecodeRequest.
     */
    public DecodeRequest() {

    }

    /**
     * Gets the index ID.
     *
     * @return the index ID
     */
    public int getIndexId() {
        return indexId;
    }

    /**
     * Sets the index ID.
     *
     * @param indexId the index ID to set
     */
    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    /**
     * Gets the AC status.
     *
     * @return the AC status
     */
    public ACStatus getAcStatus() {
        return acStatus;
    }

    /**
     * Sets the AC status.
     *
     * @param acStatus the AC status to set
     */
    public void setAcStatus(ACStatus acStatus) {
        this.acStatus = acStatus;
    }

    /**
     * Gets the key code.
     *
     * @return the key code
     */
    public int getKeyCode() {
        return keyCode;
    }

    /**
     * Sets the key code.
     *
     * @param keyCode the key code to set
     */
    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }

    /**
     * Gets the change wind direction flag.
     *
     * @return the change wind direction flag
     */
    public int getChangeWindDir() {
        return changeWindDir;
    }

    /**
     * Sets the change wind direction flag.
     *
     * @param changeWindDir the change wind direction flag to set
     */
    public void setChangeWindDir(int changeWindDir) {
        this.changeWindDir = changeWindDir;
    }

    /**
     * Gets the direct decode flag.
     *
     * @return the direct decode flag
     */
    public Integer getDirectDecode() {
        return directDecode;
    }

    /**
     * Sets the direct decode flag.
     *
     * @param directDecode the direct decode flag to set
     */
    public void setDirectDecode(Integer directDecode) {
        this.directDecode = directDecode;
    }

    /**
     * Gets the parameter data.
     *
     * @return the parameter data
     */
    public Integer getParaData() {
        return paraData;
    }

    /**
     * Sets the parameter data.
     *
     * @param paraData the parameter data to set
     */
    public void setParaData(Integer paraData) {
        this.paraData = paraData;
    }
}