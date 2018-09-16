package com.mindhaq.adventofcode2016.day08;

import com.mindhaq.adventofcode2016.Utils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SolutionDay08 {
    public static void main(String[] args) {
        var screen = new Screen(50, 6);

        Utils
            .readInput(SolutionDay08.class)
            .forEach(command -> {
                OperationParser.parse(command).execute(screen);
                log.info("Screen displays:\n{}", screen.display());
            });
        log.info("Lit pixels: {}", screen.countLit());

    }
}
