package com.mindhaq.adventofcode2016.day04;

class RoomNameDecrypter {

    private static final int ALPHABET_SIZE = 26;

    char decryptLetter(char encrypted, int shift) {
        int ascii = encrypted + (shift % ALPHABET_SIZE);
        if (ascii > (int)'z') {
            ascii -= ALPHABET_SIZE;
        }
        return (char) ascii;
    }
}
