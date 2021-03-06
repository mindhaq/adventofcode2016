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

    @Test
    public void z_becomes_a() {
        char decrypted = roomNameDecrypter.decryptLetter('z', 1);

        assertThat(decrypted).isEqualTo('a');
    }

    @Test
    public void q_becomes_v_with_shift_343() {
        char decrypted = roomNameDecrypter.decryptLetter('q', 343);

        assertThat(decrypted).isEqualTo('v');
    }

    @Test
    public void dash_becomes_space() {
        char decrypted = roomNameDecrypter.decryptLetter('-', 343);

        assertThat(decrypted).isEqualTo(' ');
    }

    @Test
    public void decrypts_example() {
        String encrypted = "qzmt-zixmtkozy-ivhz";
        int shift = 343;

        String decrypted = roomNameDecrypter.decrypt(encrypted, shift);

        assertThat(decrypted).isEqualTo("very encrypted name");
    }
}
