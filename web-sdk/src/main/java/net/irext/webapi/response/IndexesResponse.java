package net.irext.webapi.response;

import net.irext.webapi.model.RemoteIndex;

import java.util.List;

/**
 * Filename:       IndexesResponse.java
 * Revised:        Date: 2017-04-12
 * Revision:       Revision: 1.0
 * <p>
 * Description:    List remote indexes response
 * <p>
 * Revision log:
 * 2017-04-12: created by strawmanbobi
 */
public class IndexesResponse extends ServiceResponse {

    private List<RemoteIndex> entity;

    /**
     * Constructs an IndexesResponse with the specified status and indexes.
     *
     * @param status the response status
     * @param indexes the list of remote indexes
     */
    public IndexesResponse(Status status, List<RemoteIndex> indexes) {
        super(status);
        this.entity = indexes;
    }

    /**
     * Default constructor for IndexesResponse.
     */
    public IndexesResponse() {

    }

    /**
     * Gets the list of remote indexes.
     *
     * @return the list of remote indexes
     */
    public List<RemoteIndex> getEntity() {
        return entity;
    }

    /**
     * Sets the list of remote indexes.
     *
     * @param entity the list of remote indexes to set
     */
    public void setEntity(List<RemoteIndex> entity) {
        this.entity = entity;
    }
}