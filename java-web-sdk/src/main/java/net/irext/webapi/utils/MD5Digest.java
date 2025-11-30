package net.irext.webapi.utils;

import java.security.MessageDigest;

/**
 * Filename:       MD5Digest.java
 * Revised:        Date: 2017-04-03
 * Revision:       Revision: 1.0
 * <p>
 * Description:    MD5 digest algorithm
 * <p>
 * Revision log:
 * 2017-04-03: created by strawmanbobi
 */
public class MD5Digest {

    /**
     * Default constructor for MD5Digest.
     */
    public MD5Digest() {
        // Private constructor to prevent instantiation
    }

    /**
     * Generates an MD5 hash for the given content.
     *
     * @param content the content to hash
     * @return the MD5 hash of the content
     */
    public static String MD5(String content) {
        String result = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(content.getBytes());
            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) i += 256;
                if (i < 16) buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            result = buf.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return content;
        }
        return result;
    }
}