package net.irext.webapi.response;

import net.irext.webapi.model.Brand;

import java.util.List;

/**
 * Filename:       BrandsResponse.java
 * Revised:        Date: 2017-04-07
 * Revision:       Revision: 1.0
 * <p>
 * Description:    List brands response
 * <p>
 * Revision log:
 * 2017-04-07: created by strawmanbobi
 */
public class BrandsResponse extends ServiceResponse {

    private List<Brand> entity;

    /**
     * Constructs a BrandsResponse with the specified status and brands list.
     *
     * @param status the response status
     * @param brands the list of brands
     */
    public BrandsResponse(Status status, List<Brand> brands) {
        super(status);
        this.entity = brands;
    }

    /**
     * Default constructor for BrandsResponse.
     */
    public BrandsResponse() {

    }

    /**
     * Gets the list of brands.
     *
     * @return the list of brands
     */
    public List<Brand> getEntity() {
        return entity;
    }

    /**
     * Sets the list of brands.
     *
     * @param entity the list of brands to set
     */
    public void setEntity(List<Brand> entity) {
        this.entity = entity;
    }
}