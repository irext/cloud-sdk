package net.irext.webapi.response;

/**
 * Filename:       DecodeResponse.java
 * Revised:        Date: 2017-05-16
 * Revision:       Revision: 1.0
 * <p>
 * Description:    Online decode response
 * <p>
 * Revision log:
 * 2017-05-16: created by strawmanbobi
 */
public class DecodeResponse extends ServiceResponse {

    private int[] entity;

    /**
     * Constructs a DecodeResponse with the specified status and entity.
     *
     * @param status the response status
     * @param entity the entity data
     */
    public DecodeResponse(Status status, int[] entity) {
        super(status);
        this.entity = entity;
    }

    /**
     * Default constructor for DecodeResponse.
     */
    public DecodeResponse() {

    }

    /**
     * Gets the entity data.
     *
     * @return the entity data
     */
    public int[] getEntity() {
        return entity;
    }

    /**
     * Sets the entity data.
     *
     * @param entity the entity data to set
     */
    public void setEntity(int[] entity) {
        this.entity = entity;
    }
}