package net.irext.webapi.response;

import net.irext.webapi.model.ACParameters;

/**
 * Filename:       ACParametersResponse.java
 * Revised:        Date: 2017-05-16
 * Revision:       Revision: 1.0
 * <p>
 * Description:    Air conditioner support parameters response
 * <p>
 * Revision log:
 * 2019-02-14: created by strawmanbobi
 */
public class ACParametersResponse extends ServiceResponse {

    private ACParameters entity;

    /**
     * Constructs an ACParametersResponse with the specified status and entity.
     *
     * @param status the status of the response
     * @param entity the AC parameters entity
     */
    public ACParametersResponse(Status status, ACParameters entity) {
        super(status);
        this.entity = entity;
    }

    /**
     * Default constructor for ACParametersResponse.
     */
    public ACParametersResponse() {
        super(new Status());
        this.entity = null;
    }

    /**
     * Gets the AC parameters entity.
     *
     * @return the AC parameters entity
     */
    public ACParameters getEntity() {
        return entity;
    }

    /**
     * Sets the AC parameters entity.
     *
     * @param entity the AC parameters entity to set
     */
    public void setEntity(ACParameters entity) {
        this.entity = entity;
    }
}