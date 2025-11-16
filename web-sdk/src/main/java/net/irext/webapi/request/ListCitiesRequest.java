package net.irext.webapi.request;

/**
 * Filename:       ListCitiesRequest.java
 * Revised:        Date: 2017-04-07
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP list cities request
 * <p>
 * Revision log:
 * 2017-04-07: created by strawmanbobi
 */
public class ListCitiesRequest extends BaseRequest {

    private String provincePrefix;

    /**
     * Constructs a ListCitiesRequest with the specified province prefix.
     *
     * @param provincePrefix the province prefix
     */
    public ListCitiesRequest(String provincePrefix) {
        this.provincePrefix = provincePrefix;
    }

    /**
     * Default constructor for ListCitiesRequest.
     */
    public ListCitiesRequest() {

    }

    /**
     * Gets the province prefix.
     *
     * @return the province prefix
     */
    public String getProvincePrefix() {
        return provincePrefix;
    }

    /**
     * Sets the province prefix.
     *
     * @param provincePrefix the province prefix to set
     */
    public void setProvincePrefix(String provincePrefix) {
        this.provincePrefix = provincePrefix;
    }
}