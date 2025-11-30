package net.irext.webapi.response;

/**
 * Filename:       Status.java
 * Revised:        Date: 2017-03-31
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP response status
 * <p>
 * Revision log:
 * 2017-03-31: created by strawmanbobi
 */
public class Status {

    private int code;
    private String cause;

    /**
     * Constructs a Status with the specified code and cause.
     *
     * @param code the status code
     * @param cause the cause message
     */
    public Status(int code, String cause) {
        this.code = code;
        this.cause = cause;
    }

    /**
     * Default constructor for Status.
     */
    public Status() {

    }

    /**
     * Gets the status code.
     *
     * @return the status code
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the status code.
     *
     * @param code the status code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Gets the cause message.
     *
     * @return the cause message
     */
    public String getCause() {
        return cause;
    }

    /**
     * Sets the cause message.
     *
     * @param cause the cause message to set
     */
    public void setCause(String cause) {
        this.cause = cause;
    }
}