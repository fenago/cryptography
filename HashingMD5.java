package net.ernesto.md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Provides Message Digest 5 features.
 */
public class HashingMD5 {

    /**
     * Creates a MD5 Hash from a String.
     *
     * @param data: The String we want to hash
     * @return MD5 hash String value in hex format
     * @throws java.security.NoSuchAlgorithmException
     */
    public static String createMD5HashFromString(String data) throws NoSuchAlgorithmException {
        //Get bytes from string, and invokes 'createMD5HashFromBytes'
        byte[] hashBytes = HashingMD5.createMD5HashFromBytes(data.getBytes());
        //convert the byte to hex format
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hashBytes.length; i++) {
            sb.append(Integer.toString((hashBytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }
}
