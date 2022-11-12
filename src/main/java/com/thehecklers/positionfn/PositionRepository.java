package com.thehecklers.positionfn;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PositionRepository extends Neo4jRepository<Position, Long> {
}
