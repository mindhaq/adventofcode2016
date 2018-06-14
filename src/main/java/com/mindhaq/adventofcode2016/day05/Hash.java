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
    private final String positionToken;
    private final String hashed;

    public Hash(String input) {
        this.input = input;

        hashed = Hashing.md5().hashString(input, Charset.defaultCharset()).toString();
        interesting = hashed.startsWith("00000");
        token = hashed.substring(5, 6);
        positionToken = hashed.substring(6, 7);
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

    /**
     * For part #2
     *
     * @return
     */
    public int getPosition() {
        try {
            return Integer.valueOf(token.toString());
        } catch (NumberFormatException e) {
            return Integer.MAX_VALUE;
        }
    }

    /**
     * For part #2
     *
     * @return
     */
    public CharSequence getTokenAtPosition() {
        return positionToken;
    }

    public boolean isInterestingPosition() {
        return isInteresting() && getPosition() < 8;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("input", input)
                .add("hashed", hashed)
                .add("interesting", interesting)
                .add("interestingPosition", isInterestingPosition())
                .add("token", token)
                .add("position", getPosition())
                .add("positionToken", positionToken)
                .toString();
    }
}
