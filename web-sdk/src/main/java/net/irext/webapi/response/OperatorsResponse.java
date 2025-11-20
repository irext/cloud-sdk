package net.irext.webapi.response;

import net.irext.webapi.model.StbOperator;

import java.util.List;

/**
 * Filename:       OperatorsResponse.java
 * Revised:        Date: 2017-04-10
 * Revision:       Revision: 1.0
 * <p>
 * Description:    List STB operators response
 * <p>
 * Revision log:
 * 2017-04-10: created by strawmanbobi
 */
public class OperatorsResponse extends ServiceResponse {

    private List<StbOperator> entity;

    /**
     * Constructs an OperatorsResponse with the specified status and cities.
     *
     * @param status the response status
     * @param cities the list of STB operators
     */
    public OperatorsResponse(Status status, List<StbOperator> cities) {
        super(status);
        this.entity = cities;
    }

    /**
     * Default constructor for OperatorsResponse.
     */
    public OperatorsResponse() {

    }

    /**
     * Gets the list of STB operators.
     *
     * @return the list of STB operators
     */
    public List<StbOperator> getEntity() {
        return entity;
    }

    /**
     * Sets the list of STB operators.
     *
     * @param entity the list of STB operators to set
     */
    public void setEntity(List<StbOperator> entity) {
        this.entity = entity;
    }
}