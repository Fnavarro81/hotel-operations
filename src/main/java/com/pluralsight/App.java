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

        Employee employee1 = new Employee(1, "Richard", "Sanitation", 15.50, 0);

        System.out.println(employee1.getHoursWorked());

        employee1.punchIn(10);

        employee1.punchOut(14);

        System.out.println(employee1.getHoursWorked());

        Hotel hotel = new Hotel("lakeside Inn", 2, 10);

        boolean booking1 = hotel.bookRoom(2, true);
        System.out.println(booking1);

        boolean booking2 = hotel.bookRoom(1, true);
        System.out.println(booking2);

        System.out.println(hotel.getAvailableSuites());
    }
}
