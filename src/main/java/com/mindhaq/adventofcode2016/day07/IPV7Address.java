package com.mindhaq.adventofcode2016.day07;

import lombok.Data;

import java.util.List;

import static java.util.stream.Collectors.toSet;

@Data
public class IPV7Address {

    private final List<String> supernetSequences;

    private final List<String> hypernetSequences;

    public boolean supportsTLS() {
        return containsAbba(supernetSequences) && !containsAbba(hypernetSequences);
    }

    private boolean containsAbba(List<String> normalSequences) {
        return normalSequences
            .stream()
            .anyMatch(IPV7Parser::containsAbba);
    }

    public boolean supportsSSL() {
        var hypernetAbas = hypernetSequences
            .stream()
            .flatMap(IPV7Parser::findAbas)
            .collect(toSet());

        return supernetSequences
            .stream()
            .flatMap(IPV7Parser::findAbas)
            .map(IPV7Parser::toBab)
            .anyMatch(hypernetAbas::contains);
    }
}
