package net.irext.webapi.response;

import net.irext.webapi.model.UserApp;
/**
 * Filename:       LoginResponse.java
 * Revised:        Date: 2017-03-31
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP Admin login response
 * <p>
 * Revision log:
 * 2017-03-31: created by strawmanbobi
 */
public class LoginResponse extends ServiceResponse {

    private UserApp entity;

    /**
     * Constructs a LoginResponse with the specified status and user app.
     *
     * @param status the response status
     * @param userApp the user app
     */
    public LoginResponse(Status status, UserApp userApp) {
        super(status);
        this.entity = userApp;
    }

    /**
     * Default constructor for LoginResponse.
     */
    public LoginResponse() {

    }

    /**
     * Gets the user app entity.
     *
     * @return the user app entity
     */
    public UserApp getEntity() {
        return entity;
    }

    /**
     * Sets the user app entity.
     *
     * @param entity the user app entity to set
     */
    public void setEntity(UserApp entity) {
        this.entity = entity;
    }
}