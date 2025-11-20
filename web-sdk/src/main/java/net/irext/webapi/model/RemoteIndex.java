package net.irext.webapi.model;

/**
 * Filename:       RemoteIndex.java
 * Revised:        Date: 2017-03-28
 * Revision:       Revision: 1.0
 * <p>
 * Description:    RemoteIndex bean
 * <p>
 * Revision log:
 * 2017-03-28: created by strawmanbobi
 */
public class RemoteIndex {

    private int id;
    private int categoryId;
    private String categoryName;
    private int brandId;
    private String brandName;
    private String cityCode;
    private String cityName;
    private String operatorId;
    private String operatorName;
    private String protocol;
    private String remote;
    private String remoteMap;
    private int status;
    private int subCate;
    private int priority;
    private String remoteNumber;
    private String categoryNameTw;
    private String brandNameTw;
    private String cityNameTw;
    private String operatorNameTw;
    private String binaryMd5;
    private String contributor;
    private String updateTime;

    /**
     * Constructs a RemoteIndex with the specified parameters.
     *
     * @param id the ID
     * @param categoryId the category ID
     * @param categoryName the category name
     * @param brandId the brand ID
     * @param brandName the brand name
     * @param cityCode the city code
     * @param cityName the city name
     * @param operatorId the operator ID
     * @param operatorName the operator name
     * @param protocol the protocol
     * @param remote the remote
     * @param remoteMap the remote map
     * @param status the status
     * @param subCate the sub category
     * @param priority the priority
     * @param remoteNumber the remote number
     * @param categoryNameTw the category name in Traditional Chinese
     * @param brandNameTw the brand name in Traditional Chinese
     * @param cityNameTw the city name in Traditional Chinese
     * @param operatorNameTw the operator name in Traditional Chinese
     * @param binaryMd5 the binary MD5
     * @param contributor the contributor
     * @param updateTime the update time
     */
    public RemoteIndex(int id,
                       int categoryId, String categoryName, int brandId, String brandName,
                       String cityCode, String cityName, String operatorId, String operatorName,
                       String protocol, String remote, String remoteMap, int status, int subCate,
                       int priority, String remoteNumber,
                       String categoryNameTw, String brandNameTw,
                       String cityNameTw, String operatorNameTw,
                       String binaryMd5, String contributor, String updateTime) {
        this.id = id;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.brandId = brandId;
        this.brandName = brandName;
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.operatorId = operatorId;
        this.operatorName = operatorName;
        this.protocol = protocol;
        this.remote = remote;
        this.remoteMap = remoteMap;
        this.status = status;
        this.subCate = subCate;
        this.priority = priority;
        this.remoteNumber = remoteNumber;
        this.categoryNameTw = categoryNameTw;
        this.brandNameTw = brandNameTw;
        this.cityNameTw = cityNameTw;
        this.operatorNameTw = operatorNameTw;
        this.binaryMd5 = binaryMd5;
        this.contributor = contributor;
        this.updateTime = updateTime;
    }

    /**
     * Default constructor for RemoteIndex.
     */
    public RemoteIndex() {

    }

    /**
     * Gets the ID.
     *
     * @return the ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID.
     *
     * @param id the ID to set
     */
    public void setId(int id) {
        this.id = id;
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
     * Gets the category name.
     *
     * @return the category name
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the category name.
     *
     * @param categoryName the category name to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
     * Gets the brand name.
     *
     * @return the brand name
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the brand name.
     *
     * @param brandName the brand name to set
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
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
     * Gets the city name.
     *
     * @return the city name
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the city name.
     *
     * @param cityName the city name to set
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
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
     * Gets the operator name.
     *
     * @return the operator name
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Sets the operator name.
     *
     * @param operatorName the operator name to set
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    /**
     * Gets the protocol.
     *
     * @return the protocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the protocol.
     *
     * @param protocol the protocol to set
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * Gets the remote.
     *
     * @return the remote
     */
    public String getRemote() {
        return remote;
    }

    /**
     * Sets the remote.
     *
     * @param remote the remote to set
     */
    public void setRemote(String remote) {
        this.remote = remote;
    }

    /**
     * Gets the remote map.
     *
     * @return the remote map
     */
    public String getRemoteMap() {
        return remoteMap;
    }

    /**
     * Sets the remote map.
     *
     * @param remoteMap the remote map to set
     */
    public void setRemoteMap(String remoteMap) {
        this.remoteMap = remoteMap;
    }

    /**
     * Gets the status.
     *
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the status.
     *
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Gets the sub category.
     *
     * @return the sub category
     */
    public int getSubCate() {
        return subCate;
    }

    /**
     * Sets the sub category.
     *
     * @param subCate the sub category to set
     */
    public void setSubCate(int subCate) {
        this.subCate = subCate;
    }

    /**
     * Gets the priority.
     *
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the priority.
     *
     * @param priority the priority to set
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * Gets the remote number.
     *
     * @return the remote number
     */
    public String getRemoteNumber() {
        return remoteNumber;
    }

    /**
     * Sets the remote number.
     *
     * @param remoteNumber the remote number to set
     */
    public void setRemoteNumber(String remoteNumber) {
        this.remoteNumber = remoteNumber;
    }

    /**
     * Gets the category name in Traditional Chinese.
     *
     * @return the category name in Traditional Chinese
     */
    public String getCategoryNameTw() {
        return categoryNameTw;
    }

    /**
     * Sets the category name in Traditional Chinese.
     *
     * @param categoryNameTw the category name in Traditional Chinese to set
     */
    public void setCategoryNameTw(String categoryNameTw) {
        this.categoryNameTw = categoryNameTw;
    }

    /**
     * Gets the brand name in Traditional Chinese.
     *
     * @return the brand name in Traditional Chinese
     */
    public String getBrandNameTw() {
        return brandNameTw;
    }

    /**
     * Sets the brand name in Traditional Chinese.
     *
     * @param brandNameTw the brand name in Traditional Chinese to set
     */
    public void setBrandNameTw(String brandNameTw) {
        this.brandNameTw = brandNameTw;
    }

    /**
     * Gets the city name in Traditional Chinese.
     *
     * @return the city name in Traditional Chinese
     */
    public String getCityNameTw() {
        return cityNameTw;
    }

    /**
     * Sets the city name in Traditional Chinese.
     *
     * @param cityNameTw the city name in Traditional Chinese to set
     */
    public void setCityNameTw(String cityNameTw) {
        this.cityNameTw = cityNameTw;
    }

    /**
     * Gets the operator name in Traditional Chinese.
     *
     * @return the operator name in Traditional Chinese
     */
    public String getOperatorNameTw() {
        return operatorNameTw;
    }

    /**
     * Sets the operator name in Traditional Chinese.
     *
     * @param operatorNameTw the operator name in Traditional Chinese to set
     */
    public void setOperatorNameTw(String operatorNameTw) {
        this.operatorNameTw = operatorNameTw;
    }

    /**
     * Gets the binary MD5.
     *
     * @return the binary MD5
     */
    public String getBinaryMd5() {
        return binaryMd5;
    }

    /**
     * Sets the binary MD5.
     *
     * @param binaryMd5 the binary MD5 to set
     */
    public void setBinaryMd5(String binaryMd5) {
        this.binaryMd5 = binaryMd5;
    }

    /**
     * Gets the contributor.
     *
     * @return the contributor
     */
    public String getContributor() {
        return contributor;
    }

    /**
     * Sets the contributor.
     *
     * @param contributor the contributor to set
     */
    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    /**
     * Gets the update time.
     *
     * @return the update time
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the update time.
     *
     * @param updateTime the update time to set
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}