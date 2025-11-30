package net.irext.webapi.response;

import net.irext.webapi.model.City;

import java.util.List;

/**
 * Filename:       CitiesResponse.java
 * Revised:        Date: 2017-04-07
 * Revision:       Revision: 1.0
 * <p>
 * Description:    List cities response
 * <p>
 * Revision log:
 * 2017-04-07: created by strawmanbobi
 */
public class CitiesResponse extends ServiceResponse {

    private List<City> entity;

    /**
     * Constructs a CitiesResponse with the specified status and cities list.
     *
     * @param status the response status
     * @param cities the list of cities
     */
    public CitiesResponse(Status status, List<City> cities) {
        super(status);
        this.entity = cities;
    }

    /**
     * Default constructor for CitiesResponse.
     */
    public CitiesResponse() {

    }

    /**
     * Gets the list of cities.
     *
     * @return the list of cities
     */
    public List<City> getEntity() {
        return entity;
    }

    /**
     * Sets the list of cities.
     *
     * @param entity the list of cities to set
     */
    public void setEntity(List<City> entity) {
        this.entity = entity;
    }
}