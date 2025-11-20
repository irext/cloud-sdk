package net.irext.webapi.request;

/**
 * Filename:       AppSignInRequest.java
 * Revised:        Date: 2017-05-27
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP admin login request
 * <p>
 * Revision log:
 * 2017-05-27: created by strawmanbobi
 */
public class AppSignInRequest extends BaseRequest {

    private String appKey;
    private String appSecret;
    private int appType;
    private String iOSID;
    private String androidPackageName;
    private String androidSignature;

    /**
     * Constructs an AppSignInRequest with the specified parameters.
     *
     * @param appKey the application key
     * @param appSecret the application secret
     * @param appType the application type
     * @param iOSID the iOS identifier
     * @param androidPackageName the Android package name
     * @param androidSignature the Android signature
     */
    public AppSignInRequest(String appKey, String appSecret, int appType,
                            String iOSID, String androidPackageName, String androidSignature) {
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.appType = appType;
        this.iOSID = iOSID;
        this.androidPackageName = androidPackageName;
        this.androidSignature = androidSignature;
    }

    /**
     * Default constructor for AppSignInRequest.
     */
    public AppSignInRequest() {

    }

    /**
     * Gets the application key.
     *
     * @return the application key
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * Sets the application key.
     *
     * @param appKey the application key to set
     */
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    /**
     * Gets the application secret.
     *
     * @return the application secret
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * Sets the application secret.
     *
     * @param appSecret the application secret to set
     */
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    /**
     * Gets the application type.
     *
     * @return the application type
     */
    public int getAppType() {
        return appType;
    }

    /**
     * Sets the application type.
     *
     * @param appType the application type to set
     */
    public void setAppType(int appType) {
        this.appType = appType;
    }

    /**
     * Gets the iOS identifier.
     *
     * @return the iOS identifier
     */
    public String getiOSID() {
        return iOSID;
    }

    /**
     * Sets the iOS identifier.
     *
     * @param iOSID the iOS identifier to set
     */
    public void setiOSID(String iOSID) {
        this.iOSID = iOSID;
    }

    /**
     * Gets the Android package name.
     *
     * @return the Android package name
     */
    public String getAndroidPackageName() {
        return androidPackageName;
    }

    /**
     * Sets the Android package name.
     *
     * @param androidPackageName the Android package name to set
     */
    public void setAndroidPackageName(String androidPackageName) {
        this.androidPackageName = androidPackageName;
    }

    /**
     * Gets the Android signature.
     *
     * @return the Android signature
     */
    public String getAndroidSignature() {
        return androidSignature;
    }

    /**
     * Sets the Android signature.
     *
     * @param androidSignature the Android signature to set
     */
    public void setAndroidSignature(String androidSignature) {
        this.androidSignature = androidSignature;
    }
}