import java.util.ArrayList;

public class Ship {
    // Instance variables: Arraylist for ships and size of ship
    private static ArrayList<Ship> ships;
    private int size;

    // Default constructor
    public Ship(int size) {
        this.size = size;
        ships.add(this);
    }

}