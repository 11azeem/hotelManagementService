package com.hms.hotelmanagementservice.model;

import com.hms.hotelmanagementservice.Room;

import java.util.List;

public class GetAllRoomsResponse {
    List<Room> rooms;

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
