package net.irext.webapi.model;

/**
 * Filename:       Brand.java
 * Revised:        Date: 2017-03-28
 * Revision:       Revision: 1.0
 * <p>
 * Description:    Brand bean
 * <p>
 * Revision log:
 * 2017-03-28: created by strawmanbobi
 */
public class Brand {

    private int id;
    private String name;
    private int categoryId;
    private String categoryName;
    private int status;
    private String updateTime;
    private int priority;
    private String nameEn;
    private String nameTw;
    private String contributor;

    /**
     * Constructs a Brand with the specified parameters.
     *
     * @param id the brand ID
     * @param name the brand name
     * @param categoryId the category ID
     * @param categoryName the category name
     * @param status the status
     * @param updateTime the update time
     * @param priority the priority
     * @param nameEn the English name
     * @param nameTw the Traditional Chinese name
     * @param contributor the contributor
     */
    public Brand(int id, String name, int categoryId, String categoryName, int status,
                 String updateTime, int priority,
                 String nameEn, String nameTw, String contributor) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.status = status;
        this.updateTime = updateTime;
        this.priority = priority;
        this.nameEn = nameEn;
        this.nameTw = nameTw;
        this.contributor = contributor;
    }

    /**
     * Default constructor for Brand.
     */
    public Brand() {

    }

    /**
     * Gets the brand ID.
     *
     * @return the brand ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the brand ID.
     *
     * @param id the brand ID to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the brand name.
     *
     * @return the brand name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the brand name.
     *
     * @param name the brand name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * Gets the English name.
     *
     * @return the English name
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * Sets the English name.
     *
     * @param nameEn the English name to set
     */
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    /**
     * Gets the Traditional Chinese name.
     *
     * @return the Traditional Chinese name
     */
    public String getNameTw() {
        return nameTw;
    }

    /**
     * Sets the Traditional Chinese name.
     *
     * @param nameTw the Traditional Chinese name to set
     */
    public void setNameTw(String nameTw) {
        this.nameTw = nameTw;
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
}