package com.mindhaq.adventofcode2016.day05;

import com.google.common.base.MoreObjects;
import com.google.common.hash.Hashing;

import java.nio.charset.Charset;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class Hash {
    private final boolean interesting;
    private final CharSequence token;
    private final String input;

    public Hash(String input) {
        this.input = input;

        String hashed = Hashing.md5().hashString(input, Charset.defaultCharset()).toString();
        interesting = hashed.startsWith("00000");
        token = hashed.substring(5, 6);
    }

    public boolean isInteresting() {
        return interesting;
    }

    /**
     * For solution part #1
     *
     * @return
     */
    public CharSequence getToken() {
        return token;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("input", input)
                .add("interesting", interesting)
                .add("token", token)
                .toString();
    }
}
