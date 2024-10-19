public class Room {
    private int roomId;
    private boolean booked;
    private boolean occupied;

    public Room(int roomId) {
        this.roomId = roomId;
        this.booked = false;
        this.occupied = false;
    }

    public int getRoomId() {
        return roomId;
    }

    public boolean isBooked() {
        return booked;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void book() {
        this.booked = true;
    }

    public void cancelBooking() {
        this.booked = false;
        this.occupied = false;
        turnOffLightsAndAC();
    }

    public void releaseBooking() {
        this.booked = false;
        this.occupied = false;
        turnOffLightsAndAC();
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void turnOnLightsAndAC() {
        System.out.println("Lights and AC turned on in Room " + roomId);
    }

    public void turnOffLightsAndAC() {
        System.out.println("Lights and AC turned off in Room " + roomId);
    }
}

