import java.util.*;

class Room {
    int roomId;
    String type;
    boolean isAvailable;

    Room(int roomId, String type) {
        this.roomId = roomId;
        this.type = type;
        this.isAvailable = true;
    }
}

class Booking {
    int bookingId;
    String customerName;
    int roomId;

    Booking(int bookingId, String customerName, int roomId) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.roomId = roomId;
    }
}

public class Main {

    // Data Structures used in the system
    static HashMap<Integer, Room> roomInventory = new HashMap<>();
    static Queue<String> bookingRequestQueue = new LinkedList<>();
    static ArrayList<Booking> bookingHistory = new ArrayList<>();
    static HashSet<Integer> bookedRooms = new HashSet<>();

    public static void main(String[] args) {

        initializeRooms();

        System.out.println("Hotel Booking Management System Started");
        System.out.println("Rooms available in the system:");

        for (Room room : roomInventory.values()) {
            System.out.println("Room " + room.roomId + " - " + room.type + " - Available: " + room.isAvailable);
        }

        System.out.println("\nSystem ready for booking use cases...");
    }

    // System Initialization
    static void initializeRooms() {

        roomInventory.put(101, new Room(101, "Single"));
        roomInventory.put(102, new Room(102, "Double"));
        roomInventory.put(103, new Room(103, "Deluxe"));
        roomInventory.put(104, new Room(104, "Suite"));

    }
}
