package fr.iut.persistence;

import java.util.ArrayList;

/**
 * Created by jnvarzea on 01/03/17.
 */
public class FakeRoom {
    private String name;
    private int occupation;
    private int capacity;

    public FakeRoom(String name, int occupation, int capacity) {
        this.name = name;
        this.occupation = occupation;
        this.capacity = capacity;
    }

    public static ArrayList<FakeRoom> getFakeRooms(){
        ArrayList<FakeRoom> rooms = new ArrayList<FakeRoom>();
        rooms.add(new FakeRoom("Piece", 3, 20));
        rooms.add(new FakeRoom("De", 9, 40));
        rooms.add(new FakeRoom("Test", 0, 1000));
        return rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOccupation() {
        return occupation;
    }

    public void setOccupation(int occupation) {
        this.occupation = occupation;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
