package net.irext.webapi.request;

/**
 * Filename:       DownloadBinaryRequest.java
 * Revised:        Date: 2017-04-14
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP download IR binary
 * <p>
 * Revision log:
 * 2017-04-14: created by strawmanbobi
 */
public class DownloadBinaryRequest extends BaseRequest {
    private int indexId;
    
    /**
     * Constructs a DownloadBinaryRequest with the specified index ID.
     *
     * @param indexId the index ID
     */
    public DownloadBinaryRequest(int indexId) {
        this.indexId = indexId;
    }

    /**
     * Default constructor for DownloadBinaryRequest.
     */
    public DownloadBinaryRequest() {

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
}