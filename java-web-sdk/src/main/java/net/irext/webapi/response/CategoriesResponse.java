package net.irext.webapi.response;

import net.irext.webapi.model.Category;

import java.util.List;

/**
 * Filename:       CategoriesResponse.java
 * Revised:        Date: 2017-04-07
 * Revision:       Revision: 1.0
 * <p>
 * Description:    List categories response
 * <p>
 * Revision log:
 * 2017-04-07: created by strawmanbobi
 */
public class CategoriesResponse extends ServiceResponse {

    private List<Category> entity;

    /**
     * Constructs a CategoriesResponse with the specified status and categories list.
     *
     * @param status the response status
     * @param categories the list of categories
     */
    public CategoriesResponse(Status status, List<Category> categories) {
        super(status);
        this.entity = categories;
    }

    /**
     * Default constructor for CategoriesResponse.
     */
    public CategoriesResponse() {

    }

    /**
     * Gets the list of categories.
     *
     * @return the list of categories
     */
    public List<Category> getEntity() {
        return entity;
    }

    /**
     * Sets the list of categories.
     *
     * @param entity the list of categories to set
     */
    public void setEntity(List<Category> entity) {
        this.entity = entity;
    }
}