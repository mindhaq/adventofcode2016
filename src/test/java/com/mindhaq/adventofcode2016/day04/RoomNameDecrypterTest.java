package com.mindhaq.adventofcode2016.day04;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoomNameDecrypterTest {

    private RoomNameDecrypter roomNameDecrypter = new RoomNameDecrypter();

    @Test
    public void a_becomes_b() {
        char decrypted = roomNameDecrypter.decryptLetter('a', 1);

        assertThat(decrypted).isEqualTo('b');
    }

    @Test
    public void b_becomes_c() {
        char decrypted = roomNameDecrypter.decryptLetter('b', 1);

        assertThat(decrypted).isEqualTo('c');
    }
}
