package com.mindhaq.adventofcode2016.day05;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class PasswordCrackerTest {

    @Test
    public void cracks_example_door() {
        // given
        String doorId = "abc";
        PasswordCracker passwordCracker = new PasswordCracker(doorId);

        // when
        String password = passwordCracker.crack();

        // then
        assertThat(password).isEqualTo("18f47a30");
    }

    @Test
    public void cracks_example_door_part2() {
        // given
        String doorId = "abc";
        PasswordCracker passwordCracker = new PasswordCracker(doorId);

        // when
        String password = passwordCracker.crackWithOrder();

        // then
        assertThat(password).isEqualTo("05ace8e3");
    }
}
