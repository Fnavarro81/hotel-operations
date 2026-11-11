package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkIn_should_markRoomOccupiedAndDirty() {
        //arrange
        Room room = new Room(1, 180, false, false, true);
        //act
        room.checkIn();
        //assert
        assertEquals(true, room.isOccupied());
        assertEquals(true, room.isDirty());
    }

    @Test
    public void checkOut_should_markRoomNotOccupiedAndDirty() {
        //arrange
        Room room = new Room(1, 180, true, true, false);
        //act
        room.checkOut();
        //assert
        assertEquals(false, room.isOccupied());
        assertEquals(true, room.isDirty());
        assertEquals(false, room.isAvailable());
    }

    @Test
    public void cleanRoom_should_markRoomNotOccupiedAndNotDirty() {
        //arrange
        Room room = new Room(1, 180, false, true, false);
        //act
        room.cleanRoom();
        //assert
        assertEquals(false, room.isDirty());
        assertEquals(true, room.isAvailable());
    }

    @Test
    public void checkIn_should_markRoomNotOccupiedForDirtyRoom() {
        //arrange
        Room room = new Room(1, 180, false, true, false);
        //act
        room.checkIn();
        //assert
        assertEquals(false, room.isOccupied());
        assertEquals(true, room.isDirty());
        assertEquals(false, room.isAvailable());
    }

    @Test
    public void checkIn_should_notChangeOccupiedRoom() {
        //arrange
        Room room = new Room(2, 124.00, true, false, false);
        //act
        room.checkIn();
        //assert
        assertEquals(true, room.isOccupied());
    }

    @Test
    public void cleanRoom_should_notChangeOccupiedRoom() {
        //arrange
        Room room = new Room(1, 180, true, true, false);
        //act
        room.cleanRoom();
        //assert
        assertEquals(true, room.isDirty());
    }
}