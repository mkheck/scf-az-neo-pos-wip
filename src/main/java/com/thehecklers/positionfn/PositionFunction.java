package com.thehecklers.positionfn;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PositionFunction implements Function<Position, Position> {
    private final PositionRepository repo;

    public PositionFunction(PositionRepository repo) {
        this.repo = repo;
    }

    @Override
    public Position apply(Position position) {
        System.out.println(position.toString());
        return repo.save(position);
    }
}
