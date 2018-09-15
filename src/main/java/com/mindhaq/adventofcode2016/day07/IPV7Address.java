package com.mindhaq.adventofcode2016.day07;

import lombok.Data;

import java.util.List;

@Data
public class IPV7Address {

    private final List<String> normalSequences;

    private final List<String> hypernetSequences;

    public boolean supportsTLS() {
        return containsAbba(normalSequences) && !containsAbba(hypernetSequences);
    }

    private boolean containsAbba(List<String> normalSequences) {
        return normalSequences
            .stream()
            .anyMatch(IPV7Parser::containsAbba);
    }
}
