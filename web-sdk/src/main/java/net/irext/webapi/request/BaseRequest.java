package net.irext.webapi.request;

import com.google.gson.Gson;

/**
 * Filename:       BaseRequest.java
 * Revised:        Date: 2017-04-07
 * Revision:       Revision: 1.0
 * <p>
 * Description:    authentication factors included
 * <p>
 * Revision log:
 * 2017-04-07: created by strawmanbobi
 */
public class BaseRequest {

    private int id;
    private String token;

    /**
     * Constructs a BaseRequest with the specified id and token.
     *
     * @param id the identifier
     * @param token the authentication token
     */
    public BaseRequest(int id, String token) {
        this.id = id;
        this.token = token;
    }

    /**
     * Default constructor for BaseRequest.
     */
    BaseRequest() {

    }

    /**
     * Gets the identifier.
     *
     * @return the identifier
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the identifier.
     *
     * @param id the identifier to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the authentication token.
     *
     * @return the authentication token
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the authentication token.
     *
     * @param token the authentication token to set
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Converts this object to JSON format.
     *
     * @return the JSON representation of this object
     */
    public String toJson() {
        return new Gson().toJson(this, this.getClass());
    }
}