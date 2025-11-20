package net.irext.webapi.request;

/**
 * Filename:       ListIndexesRequest.java
 * Revised:        Date: 2017-04-12
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP list remote indexes request
 * <p>
 * Revision log:
 * 2017-04-12: created by strawmanbobi
 */
public class ListIndexesRequest extends BaseRequest {

    private int from;
    private int count;
    private int categoryId;
    private int brandId;
    private String cityCode;
    private String operatorId;

    // try index in IRIS with this flag set to 1
    private int withParaData;

    /**
     * Constructs a ListIndexesRequest with the specified parameters.
     *
     * @param from the starting index
     * @param count the number of items
     * @param categoryId the category ID
     * @param brandId the brand ID
     * @param cityCode the city code
     * @param operatorId the operator ID
     * @param withParaData the parameter data flag
     */
    public ListIndexesRequest(int from, int count, int categoryId, int brandId,
                              String cityCode, String operatorId, int withParaData) {
        this.from = from;
        this.count = count;
        this.categoryId = categoryId;
        this.brandId = brandId;
        this.cityCode = cityCode;
        this.operatorId = operatorId;
        this.withParaData = withParaData;
    }

    /**
     * Default constructor for ListIndexesRequest.
     */
    public ListIndexesRequest() {

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
     * Gets the brand ID.
     *
     * @return the brand ID
     */
    public int getBrandId() {
        return brandId;
    }

    /**
     * Sets the brand ID.
     *
     * @param brandId the brand ID to set
     */
    public void setBrandId(int brandId) {
        this.brandId = brandId;
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

    /**
     * Gets the operator ID.
     *
     * @return the operator ID
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * Sets the operator ID.
     *
     * @param operatorId the operator ID to set
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * Gets the parameter data flag.
     *
     * @return the parameter data flag
     */
    public int getWithParaData() {
        return withParaData;
    }

    /**
     * Sets the parameter data flag.
     *
     * @param withParaData the parameter data flag to set
     */
    public void setWithParaData(int withParaData) {
        this.withParaData = withParaData;
    }
}