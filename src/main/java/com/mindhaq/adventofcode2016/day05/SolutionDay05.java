package com.mindhaq.adventofcode2016.day05;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
@Slf4j
public class SolutionDay05 {
    public static void main(String... args) {
        String input = args[0];
        PasswordCracker passwordCracker = new PasswordCracker(input);
        String password = passwordCracker.crack();
        log.info("Password is {}", password);

        PasswordCracker passwordCracker2 = new PasswordCracker(input);
        String password2 = passwordCracker2.crackWithOrder();
        log.info("Password #2 is {}", password2);
    }
}
