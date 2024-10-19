import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rooms in the office:");
        int numberOfRooms = scanner.nextInt();

        OfficeFacility facility = new OfficeFacility(numberOfRooms);

        while (true) {
            System.out.println("\n1. Book Room\n2. Cancel Booking\n3. Detect Occupancy\n4. Check for Unoccupied Rooms\n5. Print Room Status\n6. Exit");
            System.out.println("Choose an option:");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the room number to book:");
                    int bookRoom = scanner.nextInt();
                    facility.bookRoom(bookRoom);
                    break;
                case 2:
                    System.out.println("Enter the room number to cancel booking:");
                    int cancelRoom = scanner.nextInt();
                    facility.cancelBooking(cancelRoom);
                    break;
                case 3:
                    System.out.println("Enter the room number for occupancy detection:");
                    int occupancyRoom = scanner.nextInt();
                    System.out.println("Enter the number of occupants:");
                    int occupants = scanner.nextInt();
                    facility.detectOccupancy(occupancyRoom, occupants);
                    break;
                case 4:
                    facility.checkUnoccupiedRooms();
                    break;
                case 5:
                    facility.printRoomStatus();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}

