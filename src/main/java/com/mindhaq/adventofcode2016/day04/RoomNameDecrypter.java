package com.mindhaq.adventofcode2016.day04;

import java.util.stream.Collectors;

class RoomNameDecrypter {

    private static final int ALPHABET_SIZE = 26;

    char decryptLetter(char encrypted, int shift) {
        if (encrypted == '-') {
            return ' ';
        }

        int ascii = encrypted + (shift % ALPHABET_SIZE);
        if (ascii > (int)'z') {
            ascii -= ALPHABET_SIZE;
        }
        return (char) ascii;
    }

    String decrypt(String encrypted, int shift) {
        return encrypted
                .chars()
                .map(c -> decryptLetter((char)c, shift))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}
