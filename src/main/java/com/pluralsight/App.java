package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Room room1 = new Room(1, 149.99, false, false, true);

        System.out.println(room1.isAvailable());

        room1.checkIn();
        System.out.println(room1.isAvailable());

        room1.checkOut();
        System.out.println(room1.isAvailable());

        room1.cleanRoom();
        System.out.println(room1.isAvailable());
    }
}
