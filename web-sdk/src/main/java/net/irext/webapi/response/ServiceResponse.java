package net.irext.webapi.response;

/**
 * Filename:       ServiceResponse.java
 * Revised:        Date: 2017-03-31
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP Response base class
 * <p>
 * Revision log:
 * 2017-03-31: created by strawmanbobi
 */
public class ServiceResponse {

    private Status status;

    /**
     * Constructs a ServiceResponse with the specified status.
     *
     * @param status the response status
     */
    public ServiceResponse(Status status) {
        this.status = status;
    }

    /**
     * Default constructor for ServiceResponse.
     */
    public ServiceResponse() {

    }

    /**
     * Gets the response status.
     *
     * @return the response status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the response status.
     *
     * @param status the response status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }
}