package net.irext.webapi.request;

/**
 * Filename:       GetACParametersRequest.java
 * Revised:        Date: 2017-05-16
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP server online
 * <p>
 * Revision log:
 * 2019-02-14: created by strawmanbobi
 */
public class GetACParametersRequest extends BaseRequest {
    private int indexId;
    private int mode;

    /**
     * Constructs a GetACParametersRequest with the specified index ID and mode.
     *
     * @param indexId the index ID
     * @param mode the mode
     */
    public GetACParametersRequest(int indexId, int mode) {
        this.indexId = indexId;
        this.mode = mode;
    }

    /**
     * Default constructor for GetACParametersRequest.
     */
    public GetACParametersRequest() {

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
     * Gets the mode.
     *
     * @return the mode
     */
    public int getMode() {
        return mode;
    }

    /**
     * Sets the mode.
     *
     * @param mode the mode to set
     */
    public void setMode(int mode) {
        this.mode = mode;
    }
}