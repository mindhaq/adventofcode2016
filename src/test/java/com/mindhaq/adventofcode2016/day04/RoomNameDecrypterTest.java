package com.mindhaq.adventofcode2016.day04;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoomNameDecrypterTest {

    private RoomNameDecrypter roomNameDecrypter = new RoomNameDecrypter();

    @Test
    public void a_becomes_b() {
        String decrypted = roomNameDecrypter.decrypt("a", 1);

        assertThat(decrypted).isEqualTo("b");
    }
}
