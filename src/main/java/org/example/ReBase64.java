package org.example;
import org.apache.commons.codec.binary.Base64;

public class ReBase64 {
    public static String encode(String input) {
        byte[] bytes = input.getBytes();
        return Base64.encodeBase64String(bytes);
    }
    public static String decode(String input) {
        byte[] bytes = Base64.decodeBase64(input);
        return new String(Base64.decodeBase64(bytes));
    }
}
