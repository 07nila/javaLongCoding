import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OfficeFacility {
    private Map<Integer, Room> rooms = new HashMap<>();
    private int totalRooms;

    public OfficeFacility(int totalRooms) {
        this.totalRooms = totalRooms;
        for (int i = 1; i <= totalRooms; i++) {
            rooms.put(i, new Room(i));
        }
    }

    public void bookRoom(int roomId) {
        Room room = rooms.get(roomId);
        if (room != null && !room.isBooked()) {
            room.book();
            System.out.println("Room " + roomId + " is successfully booked.");
        } else {
            System.out.println("Room " + roomId + " is already booked or does not exist.");
        }
    }

    public void cancelBooking(int roomId) {
        Room room = rooms.get(roomId);
        if (room != null && room.isBooked()) {
            room.cancelBooking();
            System.out.println("Booking for Room " + roomId + " is successfully canceled.");
        } else {
            System.out.println("Room " + roomId + " is not booked or does not exist.");
        }
    }

    public void detectOccupancy(int roomId, int occupants) {
        Room room = rooms.get(roomId);
        if (room != null && room.isBooked()) {
            if (occupants >= 2) {
                room.setOccupied(true);
                room.turnOnLightsAndAC();
            } else {
                room.setOccupied(false);
                room.turnOffLightsAndAC();
            }
        } else {
            System.out.println("Room " + roomId + " is not booked or does not exist.");
        }
    }

    public void checkUnoccupiedRooms() {
        for (Room room : rooms.values()) {
            if (room.isBooked() && !room.isOccupied()) {
                room.releaseBooking();
                System.out.println("Room " + room.getRoomId() + " was automatically released due to no occupancy.");
            }
        }
    }

    public void printRoomStatus() {
        for (Room room : rooms.values()) {
            System.out.println("Room " + room.getRoomId() + ": " + (room.isBooked() ? "Booked" : "Available")
                + ", " + (room.isOccupied() ? "Occupied" : "Not Occupied"));
        }
    }
}


