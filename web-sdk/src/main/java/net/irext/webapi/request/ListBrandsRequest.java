package net.irext.webapi.request;

/**
 * Filename:       ListBrandsRequest.java
 * Revised:        Date: 2017-04-07
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP list brands request
 * <p>
 * Revision log:
 * 2017-04-07: created by strawmanbobi
 */
public class ListBrandsRequest extends BaseRequest {

    private int categoryId;
    private int from;
    private int count;

    /**
     * Constructs a ListBrandsRequest with the specified category ID, from, and count.
     *
     * @param categoryId the category ID
     * @param from the starting index
     * @param count the number of items
     */
    public ListBrandsRequest(int categoryId, int from, int count) {
        this.categoryId = categoryId;
        this.from = from;
        this.count = count;
    }

    /**
     * Default constructor for ListBrandsRequest.
     */
    public ListBrandsRequest() {

    }

    /**
     * Gets the category ID.
     *
     * @return the category ID
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the category ID.
     *
     * @param categoryId the category ID to set
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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