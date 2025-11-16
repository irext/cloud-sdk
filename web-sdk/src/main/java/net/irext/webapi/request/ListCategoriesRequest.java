package net.irext.webapi.request;

/**
 * Filename:       ListCategoriesRequest.java
 * Revised:        Date: 2017-04-07
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP list categories request
 * <p>
 * Revision log:
 * 2017-04-07: created by strawmanbobi
 */
public class ListCategoriesRequest extends BaseRequest {

    private int from;
    private int count;

    /**
     * Constructs a ListCategoriesRequest with the specified from and count.
     *
     * @param from the starting index
     * @param count the number of items
     */
    public ListCategoriesRequest(int from, int count) {
        this.from = from;
        this.count = count;
    }

    /**
     * Default constructor for ListCategoriesRequest.
     */
    public ListCategoriesRequest() {

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
}