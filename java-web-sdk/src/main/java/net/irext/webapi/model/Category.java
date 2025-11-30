package net.irext.webapi.model;

/**
 * Filename:       Category.java
 * Revised:        Date: 2017-03-28
 * Revision:       Revision: 1.0
 * <p>
 * Description:    Category bean
 * <p>
 * Revision log:
 * 2017-03-28: created by strawmanbobi
 */
public class Category {

    private int id;
    private String name;
    private int status;
    private String updateTime;
    private String nameEn;
    private String nameTw;
    private String contributor;

    /**
     * Constructs a Category with the specified parameters.
     *
     * @param id the category ID
     * @param name the category name
     * @param status the status
     * @param updateTime the update time
     * @param nameEn the English name
     * @param nameTw the Traditional Chinese name
     * @param contributor the contributor
     */
    public Category(int id, String name, int status, String updateTime,
                    String nameEn, String nameTw, String contributor) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.updateTime = updateTime;
        this.nameEn = nameEn;
        this.nameTw = nameTw;
        this.contributor = contributor;
    }

    /**
     * Default constructor for Category.
     */
    public Category() {

    }

    /**
     * Gets the category ID.
     *
     * @return the category ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the category ID.
     *
     * @param id the category ID to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the category name.
     *
     * @return the category name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the category name.
     *
     * @param name the category name to set
     */
    public void setName(String name) {
        this.name = name;
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