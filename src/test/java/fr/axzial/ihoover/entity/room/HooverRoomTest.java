package fr.axzial.ihoover.entity.room;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HooverRoomTest {

    private final HooverRoom hooverRoom = new HooverRoom(10, 10);

    @Test
    void canMove() {
        assertTrue(hooverRoom.canMove(9, 5));
        assertTrue(hooverRoom.canMove(10, 10));
        assertFalse(hooverRoom.canMove(11, 10));
        assertFalse(hooverRoom.canMove(10, -2));
    }
}