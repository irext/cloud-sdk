package net.irext.webapi.request;

/**
 * Filename:       ListOperatorsRequest.java
 * Revised:        Date: 2017-04-10
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP list STB operators request
 * <p>
 * Revision log:
 * 2017-04-10: created by strawmanbobi
 */
public class ListOperatorsRequest extends BaseRequest {

    private int from;
    private int count;
    private String cityCode;

    /**
     * Constructs a ListOperatorsRequest with the specified from, count, and city code.
     *
     * @param from the starting index
     * @param count the number of items
     * @param cityCode the city code
     */
    public ListOperatorsRequest(int from, int count, String cityCode) {
        this.from = from;
        this.count = count;
        this.cityCode = cityCode;
    }

    /**
     * Default constructor for ListOperatorsRequest.
     */
    public ListOperatorsRequest() {

    }

    /**
     * Gets the starting index.
     *
     * @return the starting index
     */
    public int getFrom() {
        return from;
    }

    /**
     * Sets the starting index.
     *
     * @param from the starting index to set
     */
    public void setFrom(int from) {
        this.from = from;
    }

    /**
     * Gets the number of items.
     *
     * @return the number of items
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the number of items.
     *
     * @param count the number of items to set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Gets the city code.
     *
     * @return the city code
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the city code.
     *
     * @param cityCode the city code to set
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
}