package fr.axzial.ihoover.entity.location;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CardinalStateTest {

    @Test
    void isXAxis() {
        assertTrue(CardinalState.E.isXAxis());
    }

    @Test
    void isYAxis() {
        assertTrue(CardinalState.N.isYAxis());
    }

    @Test
    void plus90() {
        assertEquals(CardinalState.N.plus90(), CardinalState.E);
    }

    @Test
    void minus90() {
        assertEquals(CardinalState.N.minus90(), CardinalState.W);
    }
}